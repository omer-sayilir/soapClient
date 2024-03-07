package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for importFormByByteArrayRunSync complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="importFormByByteArrayRunSync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bulkBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employeeTcknList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="notificationTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAnswerMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importFormByByteArrayRunSync", propOrder = {
        "bulkBytes",
        "fileName",
        "employeeTcknList",
        "notificationTitle",
        "isAnswerMandatory"
})
public class ImportFormByByteArrayRunSync {

    protected byte[] bulkBytes;
    protected String fileName;
    protected List<String> employeeTcknList;
    protected String notificationTitle;
    protected Boolean isAnswerMandatory;

    /**
     * Gets the value of the bulkBytes property.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getBulkBytes() {
        return bulkBytes;
    }

    /**
     * Sets the value of the bulkBytes property.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setBulkBytes(byte[] value) {
        this.bulkBytes = value;
    }

    /**
     * Gets the value of the fileName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the employeeTcknList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeTcknList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeTcknList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getEmployeeTcknList() {
        if (employeeTcknList == null) {
            employeeTcknList = new ArrayList<String>();
        }
        return this.employeeTcknList;
    }

    /**
     * Gets the value of the notificationTitle property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNotificationTitle() {
        return notificationTitle;
    }

    /**
     * Sets the value of the notificationTitle property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNotificationTitle(String value) {
        this.notificationTitle = value;
    }

    /**
     * Gets the value of the isAnswerMandatory property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsAnswerMandatory() {
        return isAnswerMandatory;
    }

    /**
     * Sets the value of the isAnswerMandatory property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsAnswerMandatory(Boolean value) {
        this.isAnswerMandatory = value;
    }

}
