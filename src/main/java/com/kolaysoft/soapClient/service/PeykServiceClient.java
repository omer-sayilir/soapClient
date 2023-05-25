package com.kolaysoft.soapClient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.com.kolaysoft.peyk.soap.GetIller;
import tr.com.kolaysoft.peyk.soap.GetIllerResponse;
import tr.com.kolaysoft.peyk.soap.IlDto;
import tr.com.kolaysoft.peyk.soap.IlPyld;

import javax.xml.bind.JAXBElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class PeykServiceClient {
    @Autowired
    private PeykService peykService;
private final String URL="https://peyktest.kolaysoft.com.tr/ik-platform/services/ikService";

    public void testClient(){
        String soapAction="https://peyktest.kolaysoft.com.tr/ik-platform/services/ikService/getIller";
        GetIller request =  new GetIller();

        IlPyld response= ((GetIllerResponse) peykService.performRequest(URL,request)).getReturn();
        if(response.getError()!=null){
            System.out.println(response.getError());
        }else{
            List<IlDto> iller=response.getIlDto();
            for (IlDto il:iller) {
                System.out.println(il.getIlId());
            }
        }



    }

}
