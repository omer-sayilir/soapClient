package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentPyld complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="documentPyld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="employee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tckn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentPyld", propOrder = {
        "bytes",
        "employee",
        "error",
        "state",
        "tckn",
        "term"
})
public class DocumentPyld {

    protected byte[] bytes;
    protected String employee;
    protected String error;
    protected String state;
    protected String tckn;
    protected String term;

    /**
     * Gets the value of the bytes property.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getBytes() {
        return bytes;
    }

    /**
     * Sets the value of the bytes property.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setBytes(byte[] value) {
        this.bytes = value;
    }

    /**
     * Gets the value of the employee property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmployee(String value) {
        this.employee = value;
    }

    /**
     * Gets the value of the error property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the tckn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTckn() {
        return tckn;
    }

    /**
     * Sets the value of the tckn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTckn(String value) {
        this.tckn = value;
    }

    /**
     * Gets the value of the term property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTerm(String value) {
        this.term = value;
    }

}
