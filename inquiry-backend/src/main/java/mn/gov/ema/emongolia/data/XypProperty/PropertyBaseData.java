
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyBaseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyBaseData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressApartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressRegionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressTownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagKhorooCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagKhorooName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="square" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyBaseData", propOrder = {
    "address",
    "addressApartmentName",
    "addressDetail",
    "addressRegionName",
    "addressStreetName",
    "addressTownName",
    "aimagCityCode",
    "aimagCityName",
    "bagKhorooCode",
    "bagKhorooName",
    "intent",
    "propertyNumber",
    "soumDistrictCode",
    "soumDistrictName",
    "square"
})
@XmlSeeAlso({
    PropertyDataOnlyMinor.class,
    PropertyData.class
})
public class PropertyBaseData {

    protected String address;
    protected String addressApartmentName;
    protected String addressDetail;
    protected String addressRegionName;
    protected String addressStreetName;
    protected String addressTownName;
    protected String aimagCityCode;
    protected String aimagCityName;
    protected String bagKhorooCode;
    protected String bagKhorooName;
    protected String intent;
    protected String propertyNumber;
    protected String soumDistrictCode;
    protected String soumDistrictName;
    protected String square;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressApartmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressApartmentName() {
        return addressApartmentName;
    }

    /**
     * Sets the value of the addressApartmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressApartmentName(String value) {
        this.addressApartmentName = value;
    }

    /**
     * Gets the value of the addressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * Sets the value of the addressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressDetail(String value) {
        this.addressDetail = value;
    }

    /**
     * Gets the value of the addressRegionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRegionName() {
        return addressRegionName;
    }

    /**
     * Sets the value of the addressRegionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRegionName(String value) {
        this.addressRegionName = value;
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
     * Gets the value of the addressTownName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTownName() {
        return addressTownName;
    }

    /**
     * Sets the value of the addressTownName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTownName(String value) {
        this.addressTownName = value;
    }

    /**
     * Gets the value of the aimagCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCityCode() {
        return aimagCityCode;
    }

    /**
     * Sets the value of the aimagCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCityCode(String value) {
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
     * Gets the value of the intent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntent() {
        return intent;
    }

    /**
     * Sets the value of the intent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntent(String value) {
        this.intent = value;
    }

    /**
     * Gets the value of the propertyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyNumber() {
        return propertyNumber;
    }

    /**
     * Sets the value of the propertyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyNumber(String value) {
        this.propertyNumber = value;
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

    /**
     * Gets the value of the square property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquare() {
        return square;
    }

    /**
     * Sets the value of the square property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquare(String value) {
        this.square = value;
    }

}
