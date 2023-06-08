package com.kolaysoft.peyk.soapclient;

import com.kolaysoft.peyk.soapclient.service.PeykServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SoapClientApplication implements CommandLineRunner {

	@Autowired
	PeykServiceClient peykServiceClient;
	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("started....");
		peykServiceClient.callGetIlLer();

		peykServiceClient.callGetEmployee(0,10);

		peykServiceClient.callEmployeeByTckn("22222222220");

		List<String> employeeList=new ArrayList<>();
		employeeList.add("22222222220");
		//0-> AKTİF, 1->ADAY, 2-> PASİF, 3-> FESİH
		Integer status=0;
		peykServiceClient.updateEmployeeStatus(employeeList,status);
		peykServiceClient.callEmployeeByTckn("22222222220");
	}
}
