package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savePersonalInfoNotAttachedFiles complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="savePersonalInfoNotAttachedFiles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tckn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surveyId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="attachmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bulkBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="isReplaceWithExisting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePersonalInfoNotAttachedFiles", propOrder = {
        "tckn",
        "surveyId",
        "attachmentName",
        "bulkBytes",
        "isReplaceWithExisting"
})
public class SavePersonalInfoNotAttachedFiles {

    protected String tckn;
    protected int surveyId;
    protected String attachmentName;
    protected byte[] bulkBytes;
    protected Boolean isReplaceWithExisting;

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
     * Gets the value of the surveyId property.
     */
    public int getSurveyId() {
        return surveyId;
    }

    /**
     * Sets the value of the surveyId property.
     */
    public void setSurveyId(int value) {
        this.surveyId = value;
    }

    /**
     * Gets the value of the attachmentName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * Sets the value of the attachmentName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttachmentName(String value) {
        this.attachmentName = value;
    }

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
     * Gets the value of the isReplaceWithExisting property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsReplaceWithExisting() {
        return isReplaceWithExisting;
    }

    /**
     * Sets the value of the isReplaceWithExisting property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsReplaceWithExisting(Boolean value) {
        this.isReplaceWithExisting = value;
    }

}
