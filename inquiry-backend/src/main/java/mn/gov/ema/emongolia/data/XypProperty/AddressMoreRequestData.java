
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressMoreRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressMoreRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://property.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressAparment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagKhorooCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressMoreRequestData", propOrder = {
    "addressAparment",
    "addressRegion",
    "addressStreet",
    "addressTown",
    "addressTypeName",
    "aimagCityCode",
    "bagKhorooCode",
    "soumDistrictCode"
})
public class AddressMoreRequestData
    extends ServiceRequest
{

    protected String addressAparment;
    protected String addressRegion;
    protected String addressStreet;
    protected String addressTown;
    protected String addressTypeName;
    protected String aimagCityCode;
    protected String bagKhorooCode;
    protected String soumDistrictCode;

    /**
     * Gets the value of the addressAparment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressAparment() {
        return addressAparment;
    }

    /**
     * Sets the value of the addressAparment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressAparment(String value) {
        this.addressAparment = value;
    }

    /**
     * Gets the value of the addressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRegion() {
        return addressRegion;
    }

    /**
     * Sets the value of the addressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRegion(String value) {
        this.addressRegion = value;
    }

    /**
     * Gets the value of the addressStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreet() {
        return addressStreet;
    }

    /**
     * Sets the value of the addressStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreet(String value) {
        this.addressStreet = value;
    }

    /**
     * Gets the value of the addressTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTown() {
        return addressTown;
    }

    /**
     * Sets the value of the addressTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTown(String value) {
        this.addressTown = value;
    }

    /**
     * Gets the value of the addressTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeName() {
        return addressTypeName;
    }

    /**
     * Sets the value of the addressTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeName(String value) {
        this.addressTypeName = value;
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

}
