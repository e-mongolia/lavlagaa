
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for landOwningRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landOwningRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://property.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressKhashaa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagCityCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="appNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="appTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approvedDuration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="areaM2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="bagKhorooCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagKhorooName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="decisionLevelCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="decisionLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landuseTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="landuseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prprtyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rightTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rightTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landOwningRequest", propOrder = {
    "addressKhashaa",
    "addressStreetName",
    "aimagCityCode",
    "aimagCityName",
    "appDate",
    "appNo",
    "appTypeCode",
    "appTypeName",
    "approvedDuration",
    "areaM2",
    "bagKhorooCode",
    "bagKhorooName",
    "decisionDate",
    "decisionLevelCode",
    "decisionLevelName",
    "decisionNo",
    "landuseTypeCode",
    "landuseTypeName",
    "parcelId",
    "prprtyNo",
    "rightTypeCode",
    "rightTypeName",
    "soumDistrictCode",
    "soumDistrictName"
})
public class LandOwningRequest
    extends ServiceRequest
{

    protected String addressKhashaa;
    protected String addressStreetName;
    protected int aimagCityCode;
    protected String aimagCityName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appDate;
    protected String appNo;
    protected int appTypeCode;
    protected String appTypeName;
    protected int approvedDuration;
    protected float areaM2;
    protected String bagKhorooCode;
    protected String bagKhorooName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar decisionDate;
    protected int decisionLevelCode;
    protected String decisionLevelName;
    protected String decisionNo;
    protected int landuseTypeCode;
    protected String landuseTypeName;
    protected String parcelId;
    protected String prprtyNo;
    protected int rightTypeCode;
    protected String rightTypeName;
    protected String soumDistrictCode;
    protected String soumDistrictName;

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
     * Gets the value of the aimagCityCode property.
     * 
     */
    public int getAimagCityCode() {
        return aimagCityCode;
    }

    /**
     * Sets the value of the aimagCityCode property.
     * 
     */
    public void setAimagCityCode(int value) {
        this.aimagCityCode = value;
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
     * Gets the value of the appDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppDate() {
        return appDate;
    }

    /**
     * Sets the value of the appDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppDate(XMLGregorianCalendar value) {
        this.appDate = value;
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
     * Gets the value of the appTypeCode property.
     * 
     */
    public int getAppTypeCode() {
        return appTypeCode;
    }

    /**
     * Sets the value of the appTypeCode property.
     * 
     */
    public void setAppTypeCode(int value) {
        this.appTypeCode = value;
    }

    /**
     * Gets the value of the appTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppTypeName() {
        return appTypeName;
    }

    /**
     * Sets the value of the appTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppTypeName(String value) {
        this.appTypeName = value;
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
    public float getAreaM2() {
        return areaM2;
    }

    /**
     * Sets the value of the areaM2 property.
     * 
     */
    public void setAreaM2(float value) {
        this.areaM2 = value;
    }

    /**
     * Gets the value of the bagKhorooCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagKhorooCode() {
        return bagKhorooCode;
    }

    /**
     * Sets the value of the bagKhorooCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagKhorooCode(String value) {
        this.bagKhorooCode = value;
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
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the decisionLevelCode property.
     * 
     */
    public int getDecisionLevelCode() {
        return decisionLevelCode;
    }

    /**
     * Sets the value of the decisionLevelCode property.
     * 
     */
    public void setDecisionLevelCode(int value) {
        this.decisionLevelCode = value;
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
     * Gets the value of the landuseTypeCode property.
     * 
     */
    public int getLanduseTypeCode() {
        return landuseTypeCode;
    }

    /**
     * Sets the value of the landuseTypeCode property.
     * 
     */
    public void setLanduseTypeCode(int value) {
        this.landuseTypeCode = value;
    }

    /**
     * Gets the value of the landuseTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanduseTypeName() {
        return landuseTypeName;
    }

    /**
     * Sets the value of the landuseTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanduseTypeName(String value) {
        this.landuseTypeName = value;
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
     * Gets the value of the prprtyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyNo() {
        return prprtyNo;
    }

    /**
     * Sets the value of the prprtyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrprtyNo(String value) {
        this.prprtyNo = value;
    }

    /**
     * Gets the value of the rightTypeCode property.
     * 
     */
    public int getRightTypeCode() {
        return rightTypeCode;
    }

    /**
     * Sets the value of the rightTypeCode property.
     * 
     */
    public void setRightTypeCode(int value) {
        this.rightTypeCode = value;
    }

    /**
     * Gets the value of the rightTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightTypeName() {
        return rightTypeName;
    }

    /**
     * Sets the value of the rightTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightTypeName(String value) {
        this.rightTypeName = value;
    }

    /**
     * Gets the value of the soumDistrictCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumDistrictCode() {
        return soumDistrictCode;
    }

    /**
     * Sets the value of the soumDistrictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumDistrictCode(String value) {
        this.soumDistrictCode = value;
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
