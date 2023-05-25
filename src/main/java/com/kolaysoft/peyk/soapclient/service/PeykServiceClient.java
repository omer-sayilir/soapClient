package com.kolaysoft.peyk.soapclient.service;

import com.kolaysoft.peyk.soapclient.ws.GetIller;
import com.kolaysoft.peyk.soapclient.ws.GetIllerResponse;
import com.kolaysoft.peyk.soapclient.ws.IlDto;
import com.kolaysoft.peyk.soapclient.ws.IlPyld;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PeykServiceClient {
    private final String URL = "https://peyktest.kolaysoft.com.tr/ik-platform/services/ikService";

    private PeykService peykService;

    public PeykServiceClient(PeykService peykService) {
        this.peykService = peykService;
    }

    public void callGetIlLer() {

        GetIller request = new GetIller();
        IlPyld response = ((GetIllerResponse) peykService.performRequest(URL, request)).getReturn();
        if (response.getError() != null) {
            System.out.println(response.getError());
        } else {
            List<IlDto> iller = response.getIlDto();
            for (IlDto il : iller) {
                System.out.println(il.getIlId());
            }
        }


    }

}
