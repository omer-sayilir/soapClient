package com.kolaysoft.soapClient.service.configuration;

import com.kolaysoft.soapClient.service.PeykService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class SoapConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan("tr.com.kolaysoft.peyk.soap");
		return marshaller;
	}
	
	@Bean
	public PeykService soapClientService(Jaxb2Marshaller marshaller) {
		PeykService client = new PeykService();
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		//for basic authentication you can use following..
		//client.setMessageSender(httpComponentsMessageSender());
		return client;
	}

	/*
	 @Bean
	  public HttpComponentsMessageSender httpComponentsMessageSender() {
	    HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
	    // set the basic authorization credentials
	    httpComponentsMessageSender.setCredentials(usernamePasswordCredentials());
	    return httpComponentsMessageSender;
	  }

	  @Bean
	  public UsernamePasswordCredentials usernamePasswordCredentials() {
	    // pass the user name and password to be used
	    return new UsernamePasswordCredentials("userName", "userPassword");
	  }*/
}
