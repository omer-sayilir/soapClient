package com.kolaysoft.peyk.soapclient.configuration;

import com.kolaysoft.peyk.soapclient.service.PeykService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.oxm.XmlMappingException;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.oxm.mime.MimeContainer;

import javax.activation.DataHandler;
import javax.xml.bind.JAXBException;
import javax.xml.bind.attachment.AttachmentMarshaller;
import javax.xml.transform.Result;
import java.util.UUID;

@Configuration
public class SoapConfiguration {
    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller() {
            @Override
            public void marshal(Object graph, Result result, @Nullable MimeContainer mimeContainer) throws XmlMappingException {
                try {
                    javax.xml.bind.Marshaller marshaller = createMarshaller();
                    if (mimeContainer != null) {
                        marshaller.setAttachmentMarshaller(
                                new SwaRefAttachmentMarshaller(mimeContainer)
                        );
                        marshaller.marshal(graph, result);
                    } else {
                        super.marshal(graph, result, null);
                    }
                } catch (JAXBException ex) {
                    throw convertJaxbException(ex);
                }
            }
        };

        marshaller.setPackagesToScan("com.kolaysoft.peyk.soapclient.ws");

        marshaller.setMtomEnabled(false);

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

    private class SwaRefAttachmentMarshaller extends AttachmentMarshaller {

        private final MimeContainer mimeContainer;

        private SwaRefAttachmentMarshaller(MimeContainer mimeContainer) {
            this.mimeContainer = mimeContainer;
        }

        @Override
        public String addMtomAttachment(DataHandler data, String elementNamespace, String elementLocalName) {
            return null;
        }

        @Override
        public String addMtomAttachment(byte[] data, int offset, int length, String mimeType, String elementNamespace, String elementLocalName) {
            return null;
        }

        @Override
        public String addSwaRefAttachment(DataHandler data) {
            String attachmentId = UUID.randomUUID().toString();
            mimeContainer.addAttachment("<" + attachmentId + ">", data);

            return "cid:" + attachmentId;
        }
    }
}
