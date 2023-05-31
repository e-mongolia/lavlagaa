
package mn.gov.ema.emongolia.data.XypCitizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressApartmentInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressApartmentInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressApartmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressApartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressApartmentInfoDetailData", propOrder = {
    "addressApartmentId",
    "addressApartmentName"
})
public class AddressApartmentInfoDetailData {

    protected String addressApartmentId;
    protected String addressApartmentName;

    /**
     * Gets the value of the addressApartmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressApartmentId() {
        return addressApartmentId;
    }

    /**
     * Sets the value of the addressApartmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressApartmentId(String value) {
        this.addressApartmentId = value;
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

}
