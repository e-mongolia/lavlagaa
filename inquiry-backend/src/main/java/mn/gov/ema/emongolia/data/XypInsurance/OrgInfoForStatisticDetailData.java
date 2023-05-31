
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orgInfoForStatisticDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orgInfoForStatisticDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aimagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="benCalin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="benCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emCalin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emdFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ezClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gadaadCalin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gadaadCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgBaishin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgEmd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgGudamj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgHaalga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgHoroo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgInsuranceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orgInfoForStatisticDetailData", propOrder = {
    "aimagName",
    "benCalin",
    "benCount",
    "emCalin",
    "emCount",
    "emdFee",
    "ezClass",
    "fee",
    "gadaadCalin",
    "gadaadCount",
    "orgBaishin",
    "orgEmd",
    "orgFee",
    "orgGudamj",
    "orgHaalga",
    "orgHoroo",
    "orgID",
    "orgInsuranceID",
    "orgName",
    "soumID",
    "soumName"
})
public class OrgInfoForStatisticDetailData {

    protected String aimagName;
    protected String benCalin;
    protected String benCount;
    protected String emCalin;
    protected String emCount;
    protected String emdFee;
    protected String ezClass;
    protected String fee;
    protected String gadaadCalin;
    protected String gadaadCount;
    protected String orgBaishin;
    protected String orgEmd;
    protected String orgFee;
    protected String orgGudamj;
    protected String orgHaalga;
    protected String orgHoroo;
    protected String orgID;
    protected String orgInsuranceID;
    protected String orgName;
    protected String soumID;
    protected String soumName;

    /**
     * Gets the value of the aimagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagName() {
        return aimagName;
    }

    /**
     * Sets the value of the aimagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagName(String value) {
        this.aimagName = value;
    }

    /**
     * Gets the value of the benCalin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenCalin() {
        return benCalin;
    }

    /**
     * Sets the value of the benCalin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenCalin(String value) {
        this.benCalin = value;
    }

    /**
     * Gets the value of the benCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenCount() {
        return benCount;
    }

    /**
     * Sets the value of the benCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenCount(String value) {
        this.benCount = value;
    }

    /**
     * Gets the value of the emCalin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmCalin() {
        return emCalin;
    }

    /**
     * Sets the value of the emCalin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmCalin(String value) {
        this.emCalin = value;
    }

    /**
     * Gets the value of the emCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmCount() {
        return emCount;
    }

    /**
     * Sets the value of the emCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmCount(String value) {
        this.emCount = value;
    }

    /**
     * Gets the value of the emdFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmdFee() {
        return emdFee;
    }

    /**
     * Sets the value of the emdFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmdFee(String value) {
        this.emdFee = value;
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
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFee(String value) {
        this.fee = value;
    }

    /**
     * Gets the value of the gadaadCalin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGadaadCalin() {
        return gadaadCalin;
    }

    /**
     * Sets the value of the gadaadCalin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGadaadCalin(String value) {
        this.gadaadCalin = value;
    }

    /**
     * Gets the value of the gadaadCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGadaadCount() {
        return gadaadCount;
    }

    /**
     * Sets the value of the gadaadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGadaadCount(String value) {
        this.gadaadCount = value;
    }

    /**
     * Gets the value of the orgBaishin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgBaishin() {
        return orgBaishin;
    }

    /**
     * Sets the value of the orgBaishin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgBaishin(String value) {
        this.orgBaishin = value;
    }

    /**
     * Gets the value of the orgEmd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgEmd() {
        return orgEmd;
    }

    /**
     * Sets the value of the orgEmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgEmd(String value) {
        this.orgEmd = value;
    }

    /**
     * Gets the value of the orgFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgFee() {
        return orgFee;
    }

    /**
     * Sets the value of the orgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgFee(String value) {
        this.orgFee = value;
    }

    /**
     * Gets the value of the orgGudamj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgGudamj() {
        return orgGudamj;
    }

    /**
     * Sets the value of the orgGudamj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgGudamj(String value) {
        this.orgGudamj = value;
    }

    /**
     * Gets the value of the orgHaalga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgHaalga() {
        return orgHaalga;
    }

    /**
     * Sets the value of the orgHaalga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgHaalga(String value) {
        this.orgHaalga = value;
    }

    /**
     * Gets the value of the orgHoroo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgHoroo() {
        return orgHoroo;
    }

    /**
     * Sets the value of the orgHoroo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgHoroo(String value) {
        this.orgHoroo = value;
    }

    /**
     * Gets the value of the orgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgID() {
        return orgID;
    }

    /**
     * Sets the value of the orgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgID(String value) {
        this.orgID = value;
    }

    /**
     * Gets the value of the orgInsuranceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgInsuranceID() {
        return orgInsuranceID;
    }

    /**
     * Sets the value of the orgInsuranceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgInsuranceID(String value) {
        this.orgInsuranceID = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the soumID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumID() {
        return soumID;
    }

    /**
     * Sets the value of the soumID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumID(String value) {
        this.soumID = value;
    }

    /**
     * Gets the value of the soumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumName() {
        return soumName;
    }

    /**
     * Sets the value of the soumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumName(String value) {
        this.soumName = value;
    }

}
