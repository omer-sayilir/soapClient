package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFormWithContentByFormId complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getFormWithContentByFormId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormWithContentByFormId", propOrder = {
        "formId"
})
public class GetFormWithContentByFormId {

    protected Integer formId;

    /**
     * Gets the value of the formId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setFormId(Integer value) {
        this.formId = value;
    }

}
