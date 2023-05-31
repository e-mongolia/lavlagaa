
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permittedVehiclesAddressData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="permittedVehiclesAddressData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="door" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permittedVehiclesAddressData", propOrder = {
    "apartment",
    "door",
    "soum",
    "state"
})
public class PermittedVehiclesAddressData {

    protected String apartment;
    protected String door;
    protected String soum;
    protected String state;

    /**
     * Gets the value of the apartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartment(String value) {
        this.apartment = value;
    }

    /**
     * Gets the value of the door property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoor() {
        return door;
    }

    /**
     * Sets the value of the door property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoor(String value) {
        this.door = value;
    }

    /**
     * Gets the value of the soum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoum() {
        return soum;
    }

    /**
     * Sets the value of the soum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoum(String value) {
        this.soum = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
