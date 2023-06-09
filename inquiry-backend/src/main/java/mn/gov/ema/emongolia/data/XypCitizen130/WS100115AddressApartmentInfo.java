
package mn.gov.ema.emongolia.data.XypCitizen130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100115_addressApartmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100115_addressApartmentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}serviceAddressApartmentInfoRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100115_addressApartmentInfo", propOrder = {
    "request"
})
public class WS100115AddressApartmentInfo {

    protected ServiceAddressApartmentInfoRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAddressApartmentInfoRequestData }
     *     
     */
    public ServiceAddressApartmentInfoRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAddressApartmentInfoRequestData }
     *     
     */
    public void setRequest(ServiceAddressApartmentInfoRequestData value) {
        this.request = value;
    }

}
