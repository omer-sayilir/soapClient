
package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFormsByFormTypeAndEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFormsByFormTypeAndEmployee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tckn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormsByFormTypeAndEmployee", propOrder = {
    "formTypeId",
    "tckn"
})
public class GetFormsByFormTypeAndEmployee {

    protected Integer formTypeId;
    protected String tckn;

    /**
     * Gets the value of the formTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFormTypeId() {
        return formTypeId;
    }

    /**
     * Sets the value of the formTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFormTypeId(Integer value) {
        this.formTypeId = value;
    }

    /**
     * Gets the value of the tckn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTckn() {
        return tckn;
    }

    /**
     * Sets the value of the tckn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTckn(String value) {
        this.tckn = value;
    }

}
