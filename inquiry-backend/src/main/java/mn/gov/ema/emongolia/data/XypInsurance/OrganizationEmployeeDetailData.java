
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationEmployeeDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationEmployeeDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="benClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="benFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="benNdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legalEntityNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orgFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="organizationNDId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="salaryFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizationEmployeeDetailData", propOrder = {
    "benClass",
    "benFee",
    "benNdId",
    "branchCode",
    "branchName",
    "firstname",
    "lastname",
    "legalEntityNum",
    "month",
    "orgFee",
    "organizationNDId",
    "organizationName",
    "regnum",
    "salary",
    "salaryFee",
    "year"
})
public class OrganizationEmployeeDetailData {

    protected String benClass;
    protected double benFee;
    protected String benNdId;
    protected String branchCode;
    protected String branchName;
    protected String firstname;
    protected String lastname;
    protected String legalEntityNum;
    protected int month;
    protected double orgFee;
    protected String organizationNDId;
    protected String organizationName;
    protected String regnum;
    protected double salary;
    protected double salaryFee;
    protected int year;

    /**
     * Gets the value of the benClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenClass() {
        return benClass;
    }

    /**
     * Sets the value of the benClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenClass(String value) {
        this.benClass = value;
    }

    /**
     * Gets the value of the benFee property.
     * 
     */
    public double getBenFee() {
        return benFee;
    }

    /**
     * Sets the value of the benFee property.
     * 
     */
    public void setBenFee(double value) {
        this.benFee = value;
    }

    /**
     * Gets the value of the benNdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenNdId() {
        return benNdId;
    }

    /**
     * Sets the value of the benNdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenNdId(String value) {
        this.benNdId = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the legalEntityNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntityNum() {
        return legalEntityNum;
    }

    /**
     * Sets the value of the legalEntityNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityNum(String value) {
        this.legalEntityNum = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the orgFee property.
     * 
     */
    public double getOrgFee() {
        return orgFee;
    }

    /**
     * Sets the value of the orgFee property.
     * 
     */
    public void setOrgFee(double value) {
        this.orgFee = value;
    }

    /**
     * Gets the value of the organizationNDId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationNDId() {
        return organizationNDId;
    }

    /**
     * Sets the value of the organizationNDId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationNDId(String value) {
        this.organizationNDId = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     */
    public void setSalary(double value) {
        this.salary = value;
    }

    /**
     * Gets the value of the salaryFee property.
     * 
     */
    public double getSalaryFee() {
        return salaryFee;
    }

    /**
     * Sets the value of the salaryFee property.
     * 
     */
    public void setSalaryFee(double value) {
        this.salaryFee = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
