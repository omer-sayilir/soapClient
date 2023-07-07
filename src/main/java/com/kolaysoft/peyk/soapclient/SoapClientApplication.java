package com.kolaysoft.peyk.soapclient;

import com.kolaysoft.peyk.soapclient.helper.PeykWsHelper;
import com.kolaysoft.peyk.soapclient.service.PeykServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapClientApplication implements CommandLineRunner {

    @Autowired
    PeykServiceClient peykServiceClient;
    PeykWsHelper peykWsHelper;

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("here we go....");


        PeykWsHelper helper = new PeykWsHelper(peykServiceClient);
  //     helper.GetIller();
//        helper.GetIlceler();
//
//        helper.GetEmployeeDetail();
//
//        helper.GetEmployeeListOfCompany();
//
//        helper.UpdateEmployeeStatus();
//
//       helper.CreateNewEmployee();

//        helper.GetBordroOfCompanyByDateRange();

//        helper.UploadBordro();

//       helper.GetBordroOfEmployee();

     helper.ImportMultipleBordrosByAttachment();

//        helper.SavePersonalInfoNotAttachedFiles();



    }
}
