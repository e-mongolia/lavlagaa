
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landOwningContractDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landOwningContractDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approvedDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="areaM2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagKhorooName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactOfficerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departmentAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departmentPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landuseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentQuarterFour" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentQuarterOne" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentQuarterThree" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentQuarterTwo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentTotalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="propertyNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landOwningContractDetailData", propOrder = {
    "aimagCityName",
    "approvedDuration",
    "areaM2",
    "bagKhorooName",
    "certificateNum",
    "contactOfficerName",
    "contractNum",
    "decisionDate",
    "decisionLevelName",
    "decisionNum",
    "departmentAddress",
    "departmentPhone",
    "firstName",
    "landuseType",
    "lastName",
    "parcelId",
    "paymentQuarterFour",
    "paymentQuarterOne",
    "paymentQuarterThree",
    "paymentQuarterTwo",
    "paymentTotalAmount",
    "propertyNum",
    "regnum",
    "soumDistrictName"
})
public class LandOwningContractDetailData {

    protected String aimagCityName;
    protected String approvedDuration;
    protected String areaM2;
    protected String bagKhorooName;
    protected String certificateNum;
    protected String contactOfficerName;
    protected String contractNum;
    protected String decisionDate;
    protected String decisionLevelName;
    protected String decisionNum;
    protected String departmentAddress;
    protected String departmentPhone;
    protected String firstName;
    protected String landuseType;
    protected String lastName;
    protected String parcelId;
    protected double paymentQuarterFour;
    protected double paymentQuarterOne;
    protected double paymentQuarterThree;
    protected double paymentQuarterTwo;
    protected double paymentTotalAmount;
    protected String propertyNum;
    protected String regnum;
    protected String soumDistrictName;

    /**
     * Gets the value of the aimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCityName() {
        return aimagCityName;
    }

    /**
     * Sets the value of the aimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCityName(String value) {
        this.aimagCityName = value;
    }

    /**
     * Gets the value of the approvedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedDuration() {
        return approvedDuration;
    }

    /**
     * Sets the value of the approvedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedDuration(String value) {
        this.approvedDuration = value;
    }

    /**
     * Gets the value of the areaM2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaM2() {
        return areaM2;
    }

    /**
     * Sets the value of the areaM2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaM2(String value) {
        this.areaM2 = value;
    }

    /**
     * Gets the value of the bagKhorooName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagKhorooName() {
        return bagKhorooName;
    }

    /**
     * Sets the value of the bagKhorooName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagKhorooName(String value) {
        this.bagKhorooName = value;
    }

    /**
     * Gets the value of the certificateNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNum() {
        return certificateNum;
    }

    /**
     * Sets the value of the certificateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNum(String value) {
        this.certificateNum = value;
    }

    /**
     * Gets the value of the contactOfficerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactOfficerName() {
        return contactOfficerName;
    }

    /**
     * Sets the value of the contactOfficerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactOfficerName(String value) {
        this.contactOfficerName = value;
    }

    /**
     * Gets the value of the contractNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * Sets the value of the contractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNum(String value) {
        this.contractNum = value;
    }

    /**
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionDate(String value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the decisionLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionLevelName() {
        return decisionLevelName;
    }

    /**
     * Sets the value of the decisionLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionLevelName(String value) {
        this.decisionLevelName = value;
    }

    /**
     * Gets the value of the decisionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNum() {
        return decisionNum;
    }

    /**
     * Sets the value of the decisionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNum(String value) {
        this.decisionNum = value;
    }

    /**
     * Gets the value of the departmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentAddress() {
        return departmentAddress;
    }

    /**
     * Sets the value of the departmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentAddress(String value) {
        this.departmentAddress = value;
    }

    /**
     * Gets the value of the departmentPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentPhone() {
        return departmentPhone;
    }

    /**
     * Sets the value of the departmentPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentPhone(String value) {
        this.departmentPhone = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the landuseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanduseType() {
        return landuseType;
    }

    /**
     * Sets the value of the landuseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanduseType(String value) {
        this.landuseType = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the parcelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelId() {
        return parcelId;
    }

    /**
     * Sets the value of the parcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelId(String value) {
        this.parcelId = value;
    }

    /**
     * Gets the value of the paymentQuarterFour property.
     * 
     */
    public double getPaymentQuarterFour() {
        return paymentQuarterFour;
    }

    /**
     * Sets the value of the paymentQuarterFour property.
     * 
     */
    public void setPaymentQuarterFour(double value) {
        this.paymentQuarterFour = value;
    }

    /**
     * Gets the value of the paymentQuarterOne property.
     * 
     */
    public double getPaymentQuarterOne() {
        return paymentQuarterOne;
    }

    /**
     * Sets the value of the paymentQuarterOne property.
     * 
     */
    public void setPaymentQuarterOne(double value) {
        this.paymentQuarterOne = value;
    }

    /**
     * Gets the value of the paymentQuarterThree property.
     * 
     */
    public double getPaymentQuarterThree() {
        return paymentQuarterThree;
    }

    /**
     * Sets the value of the paymentQuarterThree property.
     * 
     */
    public void setPaymentQuarterThree(double value) {
        this.paymentQuarterThree = value;
    }

    /**
     * Gets the value of the paymentQuarterTwo property.
     * 
     */
    public double getPaymentQuarterTwo() {
        return paymentQuarterTwo;
    }

    /**
     * Sets the value of the paymentQuarterTwo property.
     * 
     */
    public void setPaymentQuarterTwo(double value) {
        this.paymentQuarterTwo = value;
    }

    /**
     * Gets the value of the paymentTotalAmount property.
     * 
     */
    public double getPaymentTotalAmount() {
        return paymentTotalAmount;
    }

    /**
     * Sets the value of the paymentTotalAmount property.
     * 
     */
    public void setPaymentTotalAmount(double value) {
        this.paymentTotalAmount = value;
    }

    /**
     * Gets the value of the propertyNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyNum() {
        return propertyNum;
    }

    /**
     * Sets the value of the propertyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyNum(String value) {
        this.propertyNum = value;
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
     * Gets the value of the soumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumDistrictName() {
        return soumDistrictName;
    }

    /**
     * Sets the value of the soumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumDistrictName(String value) {
        this.soumDistrictName = value;
    }

}
