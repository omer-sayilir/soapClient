package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ilDto complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ilDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilDto", propOrder = {
        "ilId",
        "isim"
})
public class IlDto {

    protected Integer ilId;
    protected String isim;

    /**
     * Gets the value of the ilId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getIlId() {
        return ilId;
    }

    /**
     * Sets the value of the ilId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setIlId(Integer value) {
        this.ilId = value;
    }

    /**
     * Gets the value of the isim property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsim() {
        return isim;
    }

    /**
     * Sets the value of the isim property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsim(String value) {
        this.isim = value;
    }

}
