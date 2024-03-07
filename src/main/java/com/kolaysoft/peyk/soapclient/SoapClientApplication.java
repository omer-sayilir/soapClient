package com.kolaysoft.peyk.soapclient;

import com.kolaysoft.peyk.soapclient.helper.PeykWsHelper;
import com.kolaysoft.peyk.soapclient.service.FileEncryptor;
import com.kolaysoft.peyk.soapclient.service.FileUtil;
import com.kolaysoft.peyk.soapclient.service.PeykServiceClient;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@SpringBootApplication
public class SoapClientApplication implements CommandLineRunner {

    @Autowired
    PeykServiceClient peykServiceClient;
    @Autowired
    FileUtil fileUtil;

    @Autowired
    private FileEncryptor fileEncryptor;
    PeykWsHelper peykWsHelper;

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("here we go....");


        PeykWsHelper helper = new PeykWsHelper(peykServiceClient);

//        helper.GetIller();

//        helper.GetIlceler();

//        helper.GetEmployeeDetail();

//        helper.GetEmployeeListOfCompany();

//        helper.UpdateEmployeeStatus();

//        helper.CreateNewEmployee();

//        helper.GetBordroOfCompanyByDateRange();

//        helper.UploadBordro();

//        helper.GetBordroOfEmployee();

//        helper.ImportMultipleBordrosByAttachment();

        helper.ImportMultipleBordrosByAttachmentForLoadTest();

//        helper.SavePersonalInfoNotAttachedFiles();

//        helper.checkFileTypeFromByteArray();

 //       helper.ImportFormByByteArrayRunSync();

     //byte[] cryptedFile=fileEncryptor.read("23168513908_cce65d");
     //fileEncryptor.writeClean(cryptedFile,"23168513908_cce65d.pdf");

        /*
        ClassPathResource resource = new ClassPathResource("bordro_202305.pdf");
        byte[] cryptedFile = Files.readAllBytes(Paths.get(resource.getURI()));
        fileEncryptor.write(cryptedFile,"bordro_1");

        byte[] cryptedFile1=fileEncryptor.read("bordro_1");
        fileEncryptor.writeClean(cryptedFile1,"bordro_1.pdf");

         */




    }

}
