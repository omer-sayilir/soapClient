package com.kolaysoft.peyk.soapclient.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;
import java.util.stream.Stream;

@Service
public class FileContentHelper {

    public void Test()  {

        System.out.println("Hey");


        try (Stream<Path> filePathStream=Files.walk(Paths.get("/tmp/test"))) {
            filePathStream.forEach(filePath -> {
                if (Files.isRegularFile(filePath)) {
                    readFile(filePath);
                }
            });
        }catch (Exception exception){
            System.out.println("File read exception:"+exception.getMessage());
        }



    }

    private static void readFile(Path filePath) {
        try {
            byte[] fileContent = Files.readAllBytes(filePath);
            byte[] topOfStream = new byte[32];
            System.arraycopy(fileContent, 0, topOfStream, 0, topOfStream.length);
            String mimeGuess = guessMimeType(topOfStream);
            System.out.println( filePath+" "+mimeGuess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String guessMimeType(byte[] topOfStream) {

        String mimeType = null;



        // Read in the magicmimes.properties file (e.g. of file listed below)

        String resourceName = "magicmimes.properties"; // could also be a constant
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties magicmimes = new Properties();
        try(InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
            magicmimes.load(resourceStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // loop over each file signature, if a match is found, return mime type
        for (Enumeration keys = magicmimes.keys(); keys.hasMoreElements(); ) {


            String key = (String) keys.nextElement();

            byte[] sample = new byte[key.length()];
            System.arraycopy(topOfStream, 0, sample, 0, sample.length);
            System.out.println(encodeUTF8(key));
            System.out.println(decodeUTF8(sample));


            byte[] unicodeBytes = key.getBytes(StandardCharsets.UTF_8);

            boolean areEqual = sample.length == unicodeBytes.length;

            for (int i = 0; i < sample.length && areEqual; i++) {
                if (sample[i] != unicodeBytes[i]) {
                    areEqual = false;
                }
            }
            if (areEqual) {
                System.out.println("The byte array and Unicode string are equal.");
            } else {
                System.out.println("The byte array and Unicode string are not equal.");
            }

            if( key.equals( new String(sample) )){
                mimeType = magicmimes.getProperty(key);
                System.out.println("Mime Found! "+ mimeType);
                break;
            } else {
                System.out.println("trying "+key+" == "+new String(sample));
            }
        }

        return mimeType;
    }
    private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");

    public static  String decodeUTF8(byte[] bytes) {
        return new String(bytes, UTF8_CHARSET);
    }

    public static byte[] encodeUTF8(String string) {
        return string.getBytes(UTF8_CHARSET);
    }
}
