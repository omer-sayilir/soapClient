package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for departmentListPyld complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="departmentListPyld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="list" type="{http://service.ws.peyk.kolaysoft.com.tr/}departmentPyld" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "departmentListPyld", propOrder = {
        "comment",
        "error",
        "list",
        "totalCount"
})
public class DepartmentListPyld {

    protected String comment;
    protected boolean error;
    @XmlElement(nillable = true)
    protected List<DepartmentPyld> list;
    protected Integer totalCount;

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
     * {@link DepartmentPyld }
     */
    public List<DepartmentPyld> getList() {
        if (list == null) {
            list = new ArrayList<DepartmentPyld>();
        }
        return this.list;
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
