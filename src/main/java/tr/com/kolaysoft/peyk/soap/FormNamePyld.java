
package tr.com.kolaysoft.peyk.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formNamePyld complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formNamePyld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAnswerMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formNamePyld", propOrder = {
    "formName",
    "formType",
    "isAnswerMandatory"
})
public class FormNamePyld {

    protected String formName;
    protected String formType;
    protected Boolean isAnswerMandatory;

    /**
     * Gets the value of the formName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormName(String value) {
        this.formName = value;
    }

    /**
     * Gets the value of the formType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormType() {
        return formType;
    }

    /**
     * Sets the value of the formType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormType(String value) {
        this.formType = value;
    }

    /**
     * Gets the value of the isAnswerMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAnswerMandatory() {
        return isAnswerMandatory;
    }

    /**
     * Sets the value of the isAnswerMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAnswerMandatory(Boolean value) {
        this.isAnswerMandatory = value;
    }

}
