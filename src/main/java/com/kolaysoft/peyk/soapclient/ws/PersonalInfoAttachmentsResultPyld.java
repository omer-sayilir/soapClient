package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personalInfoAttachmentsResultPyld complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="personalInfoAttachmentsResultPyld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="surveyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalInfoAttachmentsResultPyld", propOrder = {
        "comment",
        "error",
        "surveyId"
})
public class PersonalInfoAttachmentsResultPyld {

    protected String comment;
    protected boolean error;
    protected Integer surveyId;

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
     * Gets the value of the error property.
     */
    public boolean isError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     */
    public void setError(boolean value) {
        this.error = value;
    }

    /**
     * Gets the value of the surveyId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getSurveyId() {
        return surveyId;
    }

    /**
     * Sets the value of the surveyId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setSurveyId(Integer value) {
        this.surveyId = value;
    }

}
