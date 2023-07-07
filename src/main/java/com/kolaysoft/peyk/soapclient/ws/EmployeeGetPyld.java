package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employeeGetPyld complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="employeeGetPyld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employee" type="{http://service.ws.peyk.kolaysoft.com.tr/}employeePyld" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeGetPyld", propOrder = {
        "comment",
        "employee",
        "error"
})
public class EmployeeGetPyld {

    protected String comment;
    protected EmployeePyld employee;
    protected boolean error;

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
     * Gets the value of the employee property.
     *
     * @return possible object is
     * {@link EmployeePyld }
     */
    public EmployeePyld getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     *
     * @param value allowed object is
     *              {@link EmployeePyld }
     */
    public void setEmployee(EmployeePyld value) {
        this.employee = value;
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

}
