package com.kolaysoft.peyk.soapclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.WebServiceMessageCallback;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpUrlConnection;

import javax.xml.bind.JAXBElement;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PeykService  extends WebServiceGatewaySupport {
    @Value("${peyk.ws.username}")
    String username;
    @Value("${peyk.ws.password}")
    String password;
    /**
     * @param URL       the URI to send the message to
     * @param payload   the object to marshal into the request message payload
     * @param headers   HTTP headers to add to the request
     */
    public  <T> T  performRequest(String URL, Object payload) {
        Map<String,String> headers=new HashMap<String, String>();
        headers.put("Username", username);
        headers.put("Password", password);
        JAXBElement<T> response = (JAXBElement<T>) getWebServiceTemplate()
                .marshalSendAndReceive(URL, payload, getRequestCallback(headers));
        return response.getValue();
    }

    /**
     * Returns a {@code WebServiceMessageCallback} instance with custom HTTP headers.
     */
    private WebServiceMessageCallback getRequestCallback(Map<String, String> headers) {
        return message -> {
            TransportContext context = TransportContextHolder.getTransportContext();
            HttpUrlConnection connection = (HttpUrlConnection)context.getConnection();
            addHeadersToConnection(connection, headers);
        };
    }

    /**
     * Adds all headers from the {@code headers} to the {@code connection}.
     */
    private void addHeadersToConnection(HttpUrlConnection connection, Map<String, String> headers){
        headers.forEach((name, value) -> {
            try {
                connection.addRequestHeader(name, value);
            } catch (IOException e) {
                e.printStackTrace(); // or whatever you want
            }
        });
    }



}
