package com.kolaysoft.peyk.soapclient.service;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/**
 * Created at 09-Dec-20.
 *
 * @author Samet Abdullah
 */

@Component
public class FileEncryptor {


    private final String prefix;

    public FileEncryptor(@Value("${file.path.prefix}") String prefix) {this.prefix = prefix;}


    private static final int PASSWORD_ITERATIONS = 65536; // vs brute force
    private static final int KEY_LENGTH          = 256;
    private final String password = "!afc15bd8-13cd-4a9f-990E-f678468c21d1_PeyK!";
    private final byte[] salt = {   //Arbitrarily selected 56-byte salt sequence
        (byte) 0x43, (byte) 0x76, (byte) 0x95, (byte) 0xc7,
        (byte) 0x5b, (byte) 0xd7, (byte) 0x45, (byte) 0x17,
        (byte) 0xe5, (byte) 0xd2, (byte) 0xae, (byte) 0x2b,
        (byte) 0x16, (byte) 0xfd, (byte) 0x06, (byte) 0x10,
        (byte) 0x24, (byte) 0xe6, (byte) 0xc5, (byte) 0x09,
        (byte) 0x8d, (byte) 0xa5, (byte) 0xae, (byte) 0xdf,
        (byte) 0x59, (byte) 0x39, (byte) 0xca, (byte) 0x49,
        (byte) 0x4e, (byte) 0xe2, (byte) 0x6e, (byte) 0xba,
        (byte) 0xc4, (byte) 0x79, (byte) 0xbe, (byte) 0xb4,
        (byte) 0xc6, (byte) 0x9a, (byte) 0x52, (byte) 0x2b,
        (byte) 0x85, (byte) 0xf8, (byte) 0xda, (byte) 0x47,
        (byte) 0x5f, (byte) 0x2a, (byte) 0x14, (byte) 0x3d,
        (byte) 0xab, (byte) 0x89, (byte) 0x81, (byte) 0x95,
        (byte) 0xd1, (byte) 0xe9, (byte) 0xdf, (byte) 0xab
    };

    final byte[] iv2 = new byte[]{-82, 58, 15, 123, -63, 102, -94, -2, -92, -3, 39, 96, 48, -88, -110, -17};


    private Cipher makeCipher(Boolean encryptMode) throws GeneralSecurityException {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), salt, PASSWORD_ITERATIONS, KEY_LENGTH);    //Use a KeyFactory to derive the corresponding key from the passphrase
        SecretKey secretKey = factory.generateSecret(spec);
        SecretKeySpec keySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");                                         //Set up the cipher
        int mode = encryptMode ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE;                                 //Set the cipher mode to decryption or encryption
        cipher.init(mode, keySpec, new IvParameterSpec(iv2));
        return cipher;
    }

    /**
     * Encrypts one file to a second file using a key derived from a passphrase:
     **/

    public void write(byte[] content, File outFile) throws IOException, GeneralSecurityException {
        Cipher cipher = makeCipher(true);                                                       //Generate the cipher using pass
        byte[] encData = cipher.doFinal(content);
        FileOutputStream outStream = new FileOutputStream(outFile);
        outStream.write(encData);
        outStream.close();
    }
    public void writeClean(byte[] content, File outFile) throws IOException, GeneralSecurityException {
        FileOutputStream outStream = new FileOutputStream(outFile);
        outStream.write(content);
        outStream.close();
    }
    public void write(byte[] content, String fileName) throws IOException, GeneralSecurityException {
        write(content, new File(pathByOs(fileName)));
    }
    public void writeClean(byte[] content, String fileName) throws IOException, GeneralSecurityException {
        writeClean(content, new File(pathByOs(fileName)));
    }

    /**
     * Decrypts one file to a second file using a key derived from a passphrase:
     **/
    public byte[] read(String fileName) throws IOException {
        return read(new File(pathByOs(fileName)));
    }

    public byte[] read(File inFile) throws IOException {
        try {
            return read(new FileInputStream(inFile), (int) inFile.length());
        } catch (Exception e) {
            return FileUtils.readFileToByteArray(inFile);
        }
    }

    public byte[] read(FileInputStream inStream, int fileLength) throws IOException, GeneralSecurityException {
        Cipher cipher = makeCipher(false);                                                      //Generate the cipher using pass

        byte[] encData = new byte[(int) fileLength];                                                        //Read in the file
        inStream.read(encData);
        inStream.close();

        byte[] decData = cipher.doFinal(encData);                                                           //Decrypt the file data

        int padCount = (int) decData[decData.length - 1];                                                   //Figure out how much padding to remove
        //Naive check, will fail if plaintext file actually contained
        //this at the end
        //For robust check, check that padCount bytes at the end have same value
        if (padCount >= 1 && padCount <= 8) {
            decData = Arrays.copyOfRange(decData, 0, decData.length - padCount);
        }
        return decData;
    }

    private String pathByOs(String path) {
        if (!StringUtils.isEmpty(path) && path.startsWith("O:"))
            path = path.replace("O:", "");
        return Paths.get(prefix + path).toString();
    }
}