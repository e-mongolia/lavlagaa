
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenIdCardAddressDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenIdCardAddressDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressApartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressRegionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressTownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrivedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenIdCardAddressDetailData", propOrder = {
    "addressApartmentName",
    "addressDetail",
    "addressRegionName",
    "addressStreetName",
    "addressTownName",
    "arrivedDate",
    "bagName",
    "cityName",
    "districtName"
})
public class CitizenIdCardAddressDetailData {

    protected String addressApartmentName;
    protected String addressDetail;
    protected String addressRegionName;
    protected String addressStreetName;
    protected String addressTownName;
    protected String arrivedDate;
    protected String bagName;
    protected String cityName;
    protected String districtName;

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
     * Gets the value of the arrivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivedDate() {
        return arrivedDate;
    }

    /**
     * Sets the value of the arrivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivedDate(String value) {
        this.arrivedDate = value;
    }

    /**
     * Gets the value of the bagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagName() {
        return bagName;
    }

    /**
     * Sets the value of the bagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagName(String value) {
        this.bagName = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the districtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Sets the value of the districtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

}
