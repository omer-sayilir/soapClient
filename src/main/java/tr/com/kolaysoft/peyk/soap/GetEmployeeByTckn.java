
package tr.com.kolaysoft.peyk.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEmployeeByTckn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEmployeeByTckn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tckn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeeByTckn", propOrder = {
    "tckn"
})
public class GetEmployeeByTckn {

    protected String tckn;

    /**
     * Gets the value of the tckn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTckn() {
        return tckn;
    }

    /**
     * Sets the value of the tckn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTckn(String value) {
        this.tckn = value;
    }

}
