
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landRelatedInfoByParcelIdData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landRelatedInfoByParcelIdData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressKhashaa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approvedDuration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="areaM2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bagKhorooName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="court" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="courtDecisionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endMortgagePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="geom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="geometry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impositionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impositionYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="landuseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mortgage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="paidTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidYearAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remainingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yearAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landRelatedInfoByParcelIdData", propOrder = {
    "addressKhashaa",
    "addressStreetName",
    "aimagCityName",
    "appNo",
    "appStatus",
    "appType",
    "approvedDuration",
    "areaM2",
    "bagKhorooName",
    "certificateNo",
    "contractEnd",
    "contractNo",
    "contractStart",
    "contractStatus",
    "court",
    "courtDecisionNo",
    "decisionDate",
    "decisionLevel",
    "decisionNo",
    "endMortgagePeriod",
    "firstname",
    "geom",
    "geometry",
    "impositionDesc",
    "impositionYear",
    "landuseType",
    "lastname",
    "mortgage",
    "paidTotalAmount",
    "paidYearAmount",
    "parcelId",
    "personRegnum",
    "personType",
    "propertyNo",
    "remainingAmount",
    "rightType",
    "soumDistrictName",
    "surname",
    "totalAmount",
    "yearAmount"
})
public class LandRelatedInfoByParcelIdData {

    protected String addressKhashaa;
    protected String addressStreetName;
    protected String aimagCityName;
    protected String appNo;
    protected String appStatus;
    protected String appType;
    protected int approvedDuration;
    protected int areaM2;
    protected String bagKhorooName;
    protected String certificateNo;
    protected String contractEnd;
    protected String contractNo;
    protected String contractStart;
    protected String contractStatus;
    protected boolean court;
    protected String courtDecisionNo;
    protected String decisionDate;
    protected String decisionLevel;
    protected String decisionNo;
    protected String endMortgagePeriod;
    protected String firstname;
    protected String geom;
    protected String geometry;
    protected String impositionDesc;
    protected int impositionYear;
    protected String landuseType;
    protected String lastname;
    protected boolean mortgage;
    protected String paidTotalAmount;
    protected String paidYearAmount;
    protected String parcelId;
    protected String personRegnum;
    protected String personType;
    protected String propertyNo;
    protected String remainingAmount;
    protected String rightType;
    protected String soumDistrictName;
    protected String surname;
    protected String totalAmount;
    protected String yearAmount;

    /**
     * Gets the value of the addressKhashaa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressKhashaa() {
        return addressKhashaa;
    }

    /**
     * Sets the value of the addressKhashaa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressKhashaa(String value) {
        this.addressKhashaa = value;
    }

    /**
     * Gets the value of the addressStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreetName() {
        return addressStreetName;
    }

    /**
     * Sets the value of the addressStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreetName(String value) {
        this.addressStreetName = value;
    }

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
     * Gets the value of the appNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppNo() {
        return appNo;
    }

    /**
     * Sets the value of the appNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppNo(String value) {
        this.appNo = value;
    }

    /**
     * Gets the value of the appStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * Sets the value of the appStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStatus(String value) {
        this.appStatus = value;
    }

    /**
     * Gets the value of the appType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppType() {
        return appType;
    }

    /**
     * Sets the value of the appType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppType(String value) {
        this.appType = value;
    }

    /**
     * Gets the value of the approvedDuration property.
     * 
     */
    public int getApprovedDuration() {
        return approvedDuration;
    }

    /**
     * Sets the value of the approvedDuration property.
     * 
     */
    public void setApprovedDuration(int value) {
        this.approvedDuration = value;
    }

    /**
     * Gets the value of the areaM2 property.
     * 
     */
    public int getAreaM2() {
        return areaM2;
    }

    /**
     * Sets the value of the areaM2 property.
     * 
     */
    public void setAreaM2(int value) {
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
     * Gets the value of the certificateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * Sets the value of the certificateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNo(String value) {
        this.certificateNo = value;
    }

    /**
     * Gets the value of the contractEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractEnd() {
        return contractEnd;
    }

    /**
     * Sets the value of the contractEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractEnd(String value) {
        this.contractEnd = value;
    }

    /**
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

    /**
     * Gets the value of the contractStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStart() {
        return contractStart;
    }

    /**
     * Sets the value of the contractStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStart(String value) {
        this.contractStart = value;
    }

    /**
     * Gets the value of the contractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStatus(String value) {
        this.contractStatus = value;
    }

    /**
     * Gets the value of the court property.
     * 
     */
    public boolean isCourt() {
        return court;
    }

    /**
     * Sets the value of the court property.
     * 
     */
    public void setCourt(boolean value) {
        this.court = value;
    }

    /**
     * Gets the value of the courtDecisionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtDecisionNo() {
        return courtDecisionNo;
    }

    /**
     * Sets the value of the courtDecisionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtDecisionNo(String value) {
        this.courtDecisionNo = value;
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
     * Gets the value of the decisionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionLevel() {
        return decisionLevel;
    }

    /**
     * Sets the value of the decisionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionLevel(String value) {
        this.decisionLevel = value;
    }

    /**
     * Gets the value of the decisionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNo() {
        return decisionNo;
    }

    /**
     * Sets the value of the decisionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNo(String value) {
        this.decisionNo = value;
    }

    /**
     * Gets the value of the endMortgagePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndMortgagePeriod() {
        return endMortgagePeriod;
    }

    /**
     * Sets the value of the endMortgagePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndMortgagePeriod(String value) {
        this.endMortgagePeriod = value;
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
     * Gets the value of the geom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeom() {
        return geom;
    }

    /**
     * Sets the value of the geom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeom(String value) {
        this.geom = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometry(String value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the impositionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpositionDesc() {
        return impositionDesc;
    }

    /**
     * Sets the value of the impositionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpositionDesc(String value) {
        this.impositionDesc = value;
    }

    /**
     * Gets the value of the impositionYear property.
     * 
     */
    public int getImpositionYear() {
        return impositionYear;
    }

    /**
     * Sets the value of the impositionYear property.
     * 
     */
    public void setImpositionYear(int value) {
        this.impositionYear = value;
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
     * Gets the value of the mortgage property.
     * 
     */
    public boolean isMortgage() {
        return mortgage;
    }

    /**
     * Sets the value of the mortgage property.
     * 
     */
    public void setMortgage(boolean value) {
        this.mortgage = value;
    }

    /**
     * Gets the value of the paidTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidTotalAmount() {
        return paidTotalAmount;
    }

    /**
     * Sets the value of the paidTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidTotalAmount(String value) {
        this.paidTotalAmount = value;
    }

    /**
     * Gets the value of the paidYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidYearAmount() {
        return paidYearAmount;
    }

    /**
     * Sets the value of the paidYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidYearAmount(String value) {
        this.paidYearAmount = value;
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
     * Gets the value of the personRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRegnum() {
        return personRegnum;
    }

    /**
     * Sets the value of the personRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRegnum(String value) {
        this.personRegnum = value;
    }

    /**
     * Gets the value of the personType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonType() {
        return personType;
    }

    /**
     * Sets the value of the personType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonType(String value) {
        this.personType = value;
    }

    /**
     * Gets the value of the propertyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyNo() {
        return propertyNo;
    }

    /**
     * Sets the value of the propertyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyNo(String value) {
        this.propertyNo = value;
    }

    /**
     * Gets the value of the remainingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * Sets the value of the remainingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainingAmount(String value) {
        this.remainingAmount = value;
    }

    /**
     * Gets the value of the rightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightType() {
        return rightType;
    }

    /**
     * Sets the value of the rightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightType(String value) {
        this.rightType = value;
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

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the yearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearAmount() {
        return yearAmount;
    }

    /**
     * Sets the value of the yearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearAmount(String value) {
        this.yearAmount = value;
    }

}
