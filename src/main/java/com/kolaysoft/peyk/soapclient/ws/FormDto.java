package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formDto complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="formDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="createdAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="formId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="formName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formSessionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="jsonContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tckn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formDto", propOrder = {
        "comment",
        "content",
        "createdAt",
        "error",
        "formId",
        "formName",
        "formSessionId",
        "jsonContent",
        "state",
        "tckn",
        "updatedAt"
})
public class FormDto {

    protected String comment;
    protected byte[] content;
    protected String createdAt;
    protected Boolean error;
    protected Integer formId;
    protected String formName;
    protected Integer formSessionId;
    protected String jsonContent;
    protected String state;
    protected String tckn;
    protected String updatedAt;

    /**
     * Gets the value of the comment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the content property.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * Gets the value of the createdAt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the error property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setError(Boolean value) {
        this.error = value;
    }

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

    /**
     * Gets the value of the formName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFormName(String value) {
        this.formName = value;
    }

    /**
     * Gets the value of the formSessionId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getFormSessionId() {
        return formSessionId;
    }

    /**
     * Sets the value of the formSessionId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setFormSessionId(Integer value) {
        this.formSessionId = value;
    }

    /**
     * Gets the value of the jsonContent property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getJsonContent() {
        return jsonContent;
    }

    /**
     * Sets the value of the jsonContent property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJsonContent(String value) {
        this.jsonContent = value;
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
     * Gets the value of the updatedAt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUpdatedAt(String value) {
        this.updatedAt = value;
    }

}
