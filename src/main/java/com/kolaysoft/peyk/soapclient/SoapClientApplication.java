package com.kolaysoft.peyk.soapclient;

import com.kolaysoft.peyk.soapclient.service.PeykServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapClientApplication implements CommandLineRunner {

	@Autowired
	PeykServiceClient peykServiceClient;
	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("staretd....");
		peykServiceClient.callGetIlLer();
	}
}
