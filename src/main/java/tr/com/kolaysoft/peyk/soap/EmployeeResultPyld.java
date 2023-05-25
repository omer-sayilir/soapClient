
package tr.com.kolaysoft.peyk.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employeeResultPyld complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employeeResultPyld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="savedEmployeeList" type="{http://service.ws.peyk.kolaysoft.com.tr/}employeeShortResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unsavedEmployeeList" type="{http://service.ws.peyk.kolaysoft.com.tr/}employeeShortResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeResultPyld", propOrder = {
    "comment",
    "error",
    "savedEmployeeList",
    "unsavedEmployeeList"
})
public class EmployeeResultPyld {

    protected String comment;
    protected boolean error;
    @XmlElement(nillable = true)
    protected List<EmployeeShortResult> savedEmployeeList;
    @XmlElement(nillable = true)
    protected List<EmployeeShortResult> unsavedEmployeeList;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the error property.
     * 
     */
    public boolean isError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     */
    public void setError(boolean value) {
        this.error = value;
    }

    /**
     * Gets the value of the savedEmployeeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the savedEmployeeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSavedEmployeeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeShortResult }
     * 
     * 
     */
    public List<EmployeeShortResult> getSavedEmployeeList() {
        if (savedEmployeeList == null) {
            savedEmployeeList = new ArrayList<EmployeeShortResult>();
        }
        return this.savedEmployeeList;
    }

    /**
     * Gets the value of the unsavedEmployeeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsavedEmployeeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnsavedEmployeeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeShortResult }
     * 
     * 
     */
    public List<EmployeeShortResult> getUnsavedEmployeeList() {
        if (unsavedEmployeeList == null) {
            unsavedEmployeeList = new ArrayList<EmployeeShortResult>();
        }
        return this.unsavedEmployeeList;
    }

}
