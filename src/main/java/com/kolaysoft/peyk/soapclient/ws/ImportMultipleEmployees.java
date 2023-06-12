
package com.kolaysoft.peyk.soapclient.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importMultipleEmployees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importMultipleEmployees"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="employees" type="{http://service.ws.peyk.kolaysoft.com.tr/}employeePyld" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importMultipleEmployees", propOrder = {
    "employees"
})
public class ImportMultipleEmployees {

    protected List<EmployeePyld> employees;

    /**
     * Gets the value of the employees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeePyld }
     * 
     * 
     */
    public List<EmployeePyld> getEmployees() {
        if (employees == null) {
            employees = new ArrayList<EmployeePyld>();
        }
        return this.employees;
    }

}
