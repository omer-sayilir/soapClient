package com.kolaysoft.peyk.soapclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.support.MarshallingUtils;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpUrlConnection;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.xml.bind.JAXBElement;
import javax.xml.transform.TransformerException;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PeykService extends WebServiceGatewaySupport {
    @Value("${peyk.ws.username}")
    String username;
    @Value("${peyk.ws.password}")
    String password;

    /**
     * @param URL     the URI to send the message to
     * @param payload the object to marshal into the request message payload
     */
    public <T> T performRequest(String URL, Object payload ) {
        Map<String, String> headers = getHeaders();

        JAXBElement<T> response = (JAXBElement<T>) getWebServiceTemplate()
                .marshalSendAndReceive(URL, payload, getRequestCallback(headers,null));

        return response.getValue();
    }public <T> T performRequest(String URL, Object payload, Map<String,DataHandler> attachments) {
        Map<String, String> headers = getHeaders();

        JAXBElement<T> response = (JAXBElement<T>) getWebServiceTemplate()
                .marshalSendAndReceive(URL, payload, getRequestCallback(headers,attachments));

        return response.getValue();
    }

    private Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Username", username);
        headers.put("Password", password);
        return headers;
    }

    /**
     * Returns a {@code WebServiceMessageCallback} instance with custom HTTP headers.
     */
    private WebServiceMessageCallback getRequestCallback(Map<String, String> headers,Map<String,DataHandler> attachments) {


        return (message) -> {
            SoapMessage msg=(SoapMessage) message;

            if(attachments!=null) {
                for (Map.Entry<String, DataHandler> attachment : attachments.entrySet()) {
                    msg.addAttachment(attachment.getKey(), attachment.getValue());
                }
            }

            TransportContext context = TransportContextHolder.getTransportContext();
            HttpUrlConnection connection = (HttpUrlConnection) context.getConnection();
            addHeadersToConnection(connection, headers);
        };
    }

    /**
     * Adds all headers from the {@code headers} to the {@code connection}.
     */
    private void addHeadersToConnection(HttpUrlConnection connection, Map<String, String> headers) {
        headers.forEach((name, value) -> {
            try {
                connection.addRequestHeader(name, value);
            } catch (IOException e) {
                e.printStackTrace(); // or whatever you want
            }
        });
    }


}
