package com.kolaysoft.peyk.soapclient.service;

import com.kolaysoft.peyk.soapclient.helper.MimeTypeSigns;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@Component
public class FileUtil {


    public static String testFolder(String path) throws IOException {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        String fileType = null;
        for (File file : listOfFiles) {
            if (file.isFile()) {
                fileType = getFileTypeByFile(Paths.get(file.getPath()));
            }
        }
        return fileType;
    }

    public static String getFileTypeByFile(Path filePath) throws IOException {
        byte[] fileData = Files.readAllBytes(filePath);
        return getFileType(fileData);
    }

    public static String getFileTypeByteArray(byte[] fileData) throws IOException {

        return getFileType(fileData);
    }

    private static String getFileType(byte[] fileData) {
        String fileType = null;
        MimeTypeSigns types = new MimeTypeSigns();
        HashMap<String, String> mimeSigns = types.getMimeTypeSigns();
        for (Map.Entry<String, String> signs : mimeSigns.entrySet()) {

            String signature = signs.getKey();

            byte[] sample = new byte[signature.length()];
            System.arraycopy(fileData, 0, sample, 0, sample.length);

            byte[] signatureBytes = hexStringToByteArray(signature);
            if (isMatchFileOfType(sample, signatureBytes)) {
                fileType = signs.getValue();
                break;
            }
        }
        return fileType;
    }

    public static boolean isMatchFileOfType(byte[] fileData, byte[] fileSignature) {
        if (fileData.length < fileSignature.length) {
            return false;
        }

        for (int i = 0; i < fileSignature.length; i++) {
            if (fileData[i] != fileSignature[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] hexStringToByteArray(String hexString) {
        int len = hexString.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
                    + Character.digit(hexString.charAt(i + 1), 16));
        }
        return data;
    }
}
