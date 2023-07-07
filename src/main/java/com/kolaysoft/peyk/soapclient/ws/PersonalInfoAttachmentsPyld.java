package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for personalInfoAttachmentsPyld complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="personalInfoAttachmentsPyld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachmentList" type="{http://service.ws.peyk.kolaysoft.com.tr/}attachmentPersonelInfoPyld" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="surveyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="surveyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalInfoAttachmentsPyld", propOrder = {
        "attachmentList",
        "responseId",
        "surveyId",
        "surveyName"
})
public class PersonalInfoAttachmentsPyld {

    @XmlElement(nillable = true)
    protected List<AttachmentPersonelInfoPyld> attachmentList;
    protected Integer responseId;
    protected Integer surveyId;
    protected String surveyName;

    /**
     * Gets the value of the attachmentList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentPersonelInfoPyld }
     */
    public List<AttachmentPersonelInfoPyld> getAttachmentList() {
        if (attachmentList == null) {
            attachmentList = new ArrayList<AttachmentPersonelInfoPyld>();
        }
        return this.attachmentList;
    }

    /**
     * Gets the value of the responseId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getResponseId() {
        return responseId;
    }

    /**
     * Sets the value of the responseId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setResponseId(Integer value) {
        this.responseId = value;
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

    /**
     * Gets the value of the surveyName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSurveyName() {
        return surveyName;
    }

    /**
     * Sets the value of the surveyName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSurveyName(String value) {
        this.surveyName = value;
    }

}
