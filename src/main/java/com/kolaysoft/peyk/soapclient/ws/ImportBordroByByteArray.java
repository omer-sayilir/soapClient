package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importBordroByByteArray complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="importBordroByByteArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bulkBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importBordroByByteArray", propOrder = {
        "bulkBytes",
        "fileName",
        "year",
        "month"
})
public class ImportBordroByByteArray {

    protected byte[] bulkBytes;
    protected String fileName;
    protected Integer year;
    protected Integer month;

    /**
     * Gets the value of the bulkBytes property.
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getBulkBytes() {
        return bulkBytes;
    }

    /**
     * Sets the value of the bulkBytes property.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setBulkBytes(byte[] value) {
        this.bulkBytes = value;
    }

    /**
     * Gets the value of the fileName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the year property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setYear(Integer value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setMonth(Integer value) {
        this.month = value;
    }

}
