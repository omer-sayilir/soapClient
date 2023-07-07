package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for employeeListDto complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="employeeListDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="list" type="{http://service.ws.peyk.kolaysoft.com.tr/}employeeDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="queryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeListDto", propOrder = {
        "error",
        "list",
        "queryTime",
        "totalCount"
})
public class EmployeeListDto {

    protected String error;
    @XmlElement(nillable = true)
    protected List<EmployeeDto> list;
    protected String queryTime;
    protected Integer totalCount;

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
     * Gets the value of the list property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeDto }
     */
    public List<EmployeeDto> getList() {
        if (list == null) {
            list = new ArrayList<EmployeeDto>();
        }
        return this.list;
    }

    /**
     * Gets the value of the queryTime property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getQueryTime() {
        return queryTime;
    }

    /**
     * Sets the value of the queryTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQueryTime(String value) {
        this.queryTime = value;
    }

    /**
     * Gets the value of the totalCount property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

}
