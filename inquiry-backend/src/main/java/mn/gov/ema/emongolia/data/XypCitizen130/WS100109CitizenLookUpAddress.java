
package mn.gov.ema.emongolia.data.XypCitizen130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100109_citizenLookUpAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100109_citizenLookUpAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}serviceCitizenLookUpAddressRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100109_citizenLookUpAddress", propOrder = {
    "request"
})
public class WS100109CitizenLookUpAddress {

    protected ServiceCitizenLookUpAddressRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCitizenLookUpAddressRequestData }
     *     
     */
    public ServiceCitizenLookUpAddressRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCitizenLookUpAddressRequestData }
     *     
     */
    public void setRequest(ServiceCitizenLookUpAddressRequestData value) {
        this.request = value;
    }

}
