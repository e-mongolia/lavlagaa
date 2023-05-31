
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenInsuranceInfoForStatDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenInsuranceInfoForStatDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ezClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feePaidProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feePaidType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retiredKhoroo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retiredLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retiredProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retiredSoum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenInsuranceInfoForStatDetailData", propOrder = {
    "accountBalance",
    "age",
    "ezClass",
    "feeLevel",
    "feePaidProvince",
    "feePaidType",
    "gender",
    "regnum",
    "retiredKhoroo",
    "retiredLevel",
    "retiredProvince",
    "retiredSoum"
})
public class CitizenInsuranceInfoForStatDetailData {

    protected String accountBalance;
    protected int age;
    protected String ezClass;
    protected String feeLevel;
    protected String feePaidProvince;
    protected String feePaidType;
    protected String gender;
    protected String regnum;
    protected String retiredKhoroo;
    protected String retiredLevel;
    protected String retiredProvince;
    protected String retiredSoum;

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalance(String value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the ezClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEzClass() {
        return ezClass;
    }

    /**
     * Sets the value of the ezClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEzClass(String value) {
        this.ezClass = value;
    }

    /**
     * Gets the value of the feeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeLevel() {
        return feeLevel;
    }

    /**
     * Sets the value of the feeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeLevel(String value) {
        this.feeLevel = value;
    }

    /**
     * Gets the value of the feePaidProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeePaidProvince() {
        return feePaidProvince;
    }

    /**
     * Sets the value of the feePaidProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeePaidProvince(String value) {
        this.feePaidProvince = value;
    }

    /**
     * Gets the value of the feePaidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeePaidType() {
        return feePaidType;
    }

    /**
     * Sets the value of the feePaidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeePaidType(String value) {
        this.feePaidType = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
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
     * Gets the value of the retiredKhoroo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetiredKhoroo() {
        return retiredKhoroo;
    }

    /**
     * Sets the value of the retiredKhoroo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetiredKhoroo(String value) {
        this.retiredKhoroo = value;
    }

    /**
     * Gets the value of the retiredLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetiredLevel() {
        return retiredLevel;
    }

    /**
     * Sets the value of the retiredLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetiredLevel(String value) {
        this.retiredLevel = value;
    }

    /**
     * Gets the value of the retiredProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetiredProvince() {
        return retiredProvince;
    }

    /**
     * Sets the value of the retiredProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetiredProvince(String value) {
        this.retiredProvince = value;
    }

    /**
     * Gets the value of the retiredSoum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetiredSoum() {
        return retiredSoum;
    }

    /**
     * Sets the value of the retiredSoum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetiredSoum(String value) {
        this.retiredSoum = value;
    }

}
