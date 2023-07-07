package com.kolaysoft.peyk.soapclient.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employeePyld complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="employeePyld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customFields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="educationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employmentContract" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="employmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expenditureDepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="integrationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kepAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="managerTckn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="militaryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remainingAnnualVacation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="remainingExcuseVacation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="secondManagerTckn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tckn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeePyld", propOrder = {
        "activationStatus",
        "address",
        "cityOfBirth",
        "customFields",
        "dateOfBirth",
        "departmentCode",
        "educationLevel",
        "email",
        "employmentContract",
        "employmentStartDate",
        "employmentStatus",
        "expenditureDepCode",
        "integrationCode",
        "jobTitle",
        "kepAddress",
        "managerTckn",
        "militaryStatus",
        "name",
        "remainingAnnualVacation",
        "remainingExcuseVacation",
        "salary",
        "secondManagerTckn",
        "surname",
        "tckn",
        "telephone",
        "vip"
})
public class EmployeePyld {

    protected Integer activationStatus;
    protected String address;
    protected String cityOfBirth;
    protected String customFields;
    protected String dateOfBirth;
    protected String departmentCode;
    protected String educationLevel;
    protected String email;
    protected Integer employmentContract;
    protected String employmentStartDate;
    protected String employmentStatus;
    protected String expenditureDepCode;
    protected String integrationCode;
    protected String jobTitle;
    protected String kepAddress;
    protected String managerTckn;
    protected String militaryStatus;
    protected String name;
    protected Double remainingAnnualVacation;
    protected Double remainingExcuseVacation;
    protected Double salary;
    protected String secondManagerTckn;
    protected String surname;
    protected String tckn;
    protected String telephone;
    protected Boolean vip;

    /**
     * Gets the value of the activationStatus property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getActivationStatus() {
        return activationStatus;
    }

    /**
     * Sets the value of the activationStatus property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setActivationStatus(Integer value) {
        this.activationStatus = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the cityOfBirth property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCityOfBirth() {
        return cityOfBirth;
    }

    /**
     * Sets the value of the cityOfBirth property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCityOfBirth(String value) {
        this.cityOfBirth = value;
    }

    /**
     * Gets the value of the customFields property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCustomFields(String value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
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
     * Gets the value of the educationLevel property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * Sets the value of the educationLevel property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEducationLevel(String value) {
        this.educationLevel = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the employmentContract property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getEmploymentContract() {
        return employmentContract;
    }

    /**
     * Sets the value of the employmentContract property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setEmploymentContract(Integer value) {
        this.employmentContract = value;
    }

    /**
     * Gets the value of the employmentStartDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmploymentStartDate() {
        return employmentStartDate;
    }

    /**
     * Sets the value of the employmentStartDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmploymentStartDate(String value) {
        this.employmentStartDate = value;
    }

    /**
     * Gets the value of the employmentStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmploymentStatus(String value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the expenditureDepCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExpenditureDepCode() {
        return expenditureDepCode;
    }

    /**
     * Sets the value of the expenditureDepCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExpenditureDepCode(String value) {
        this.expenditureDepCode = value;
    }

    /**
     * Gets the value of the integrationCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIntegrationCode() {
        return integrationCode;
    }

    /**
     * Sets the value of the integrationCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIntegrationCode(String value) {
        this.integrationCode = value;
    }

    /**
     * Gets the value of the jobTitle property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the kepAddress property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKepAddress() {
        return kepAddress;
    }

    /**
     * Sets the value of the kepAddress property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKepAddress(String value) {
        this.kepAddress = value;
    }

    /**
     * Gets the value of the managerTckn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getManagerTckn() {
        return managerTckn;
    }

    /**
     * Sets the value of the managerTckn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setManagerTckn(String value) {
        this.managerTckn = value;
    }

    /**
     * Gets the value of the militaryStatus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMilitaryStatus() {
        return militaryStatus;
    }

    /**
     * Sets the value of the militaryStatus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMilitaryStatus(String value) {
        this.militaryStatus = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the remainingAnnualVacation property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRemainingAnnualVacation() {
        return remainingAnnualVacation;
    }

    /**
     * Sets the value of the remainingAnnualVacation property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setRemainingAnnualVacation(Double value) {
        this.remainingAnnualVacation = value;
    }

    /**
     * Gets the value of the remainingExcuseVacation property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getRemainingExcuseVacation() {
        return remainingExcuseVacation;
    }

    /**
     * Sets the value of the remainingExcuseVacation property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setRemainingExcuseVacation(Double value) {
        this.remainingExcuseVacation = value;
    }

    /**
     * Gets the value of the salary property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setSalary(Double value) {
        this.salary = value;
    }

    /**
     * Gets the value of the secondManagerTckn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSecondManagerTckn() {
        return secondManagerTckn;
    }

    /**
     * Sets the value of the secondManagerTckn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSecondManagerTckn(String value) {
        this.secondManagerTckn = value;
    }

    /**
     * Gets the value of the surname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the tckn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTckn() {
        return tckn;
    }

    /**
     * Sets the value of the tckn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTckn(String value) {
        this.tckn = value;
    }

    /**
     * Gets the value of the telephone property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the vip property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVip() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setVip(Boolean value) {
        this.vip = value;
    }

}
