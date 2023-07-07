
package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savePersonalInfoNotAttachedFilesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savePersonalInfoNotAttachedFilesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://service.ws.peyk.kolaysoft.com.tr/}personalInfoAttachmentsResultPyld" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePersonalInfoNotAttachedFilesResponse", propOrder = {
    "_return"
})
public class SavePersonalInfoNotAttachedFilesResponse {

    @XmlElement(name = "return")
    protected PersonalInfoAttachmentsResultPyld _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInfoAttachmentsResultPyld }
     *     
     */
    public PersonalInfoAttachmentsResultPyld getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInfoAttachmentsResultPyld }
     *     
     */
    public void setReturn(PersonalInfoAttachmentsResultPyld value) {
        this._return = value;
    }

}
