package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for departmentPyld complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="departmentPyld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departmentParentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="durum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ilId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ilName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ilceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ilceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isExpenditureDepartment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="typeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "departmentPyld", propOrder = {
        "adres",
        "departmentCode",
        "departmentName",
        "departmentParentCode",
        "durum",
        "ilId",
        "ilName",
        "ilceId",
        "ilceName",
        "isExpenditureDepartment",
        "typeDescription",
        "typeId"
})
public class DepartmentPyld {

    protected String adres;
    protected String departmentCode;
    protected String departmentName;
    protected String departmentParentCode;
    protected String durum;
    protected Integer ilId;
    protected String ilName;
    protected Integer ilceId;
    protected String ilceName;
    protected Boolean isExpenditureDepartment;
    protected String typeDescription;
    protected Integer typeId;

    /**
     * Gets the value of the adres property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAdres(String value) {
        this.adres = value;
    }

    /**
     * Gets the value of the departmentCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepartmentCode(String value) {
        this.departmentCode = value;
    }

    /**
     * Gets the value of the departmentName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the departmentParentCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDepartmentParentCode() {
        return departmentParentCode;
    }

    /**
     * Sets the value of the departmentParentCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDepartmentParentCode(String value) {
        this.departmentParentCode = value;
    }

    /**
     * Gets the value of the durum property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDurum() {
        return durum;
    }

    /**
     * Sets the value of the durum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDurum(String value) {
        this.durum = value;
    }

    /**
     * Gets the value of the ilId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getIlId() {
        return ilId;
    }

    /**
     * Sets the value of the ilId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setIlId(Integer value) {
        this.ilId = value;
    }

    /**
     * Gets the value of the ilName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIlName() {
        return ilName;
    }

    /**
     * Sets the value of the ilName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIlName(String value) {
        this.ilName = value;
    }

    /**
     * Gets the value of the ilceId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getIlceId() {
        return ilceId;
    }

    /**
     * Sets the value of the ilceId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setIlceId(Integer value) {
        this.ilceId = value;
    }

    /**
     * Gets the value of the ilceName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIlceName() {
        return ilceName;
    }

    /**
     * Sets the value of the ilceName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIlceName(String value) {
        this.ilceName = value;
    }

    /**
     * Gets the value of the isExpenditureDepartment property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsExpenditureDepartment() {
        return isExpenditureDepartment;
    }

    /**
     * Sets the value of the isExpenditureDepartment property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsExpenditureDepartment(Boolean value) {
        this.isExpenditureDepartment = value;
    }

    /**
     * Gets the value of the typeDescription property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Sets the value of the typeDescription property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
    }

    /**
     * Gets the value of the typeId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTypeId(Integer value) {
        this.typeId = value;
    }

}
