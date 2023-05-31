
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceInsertHotelInfoRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceInsertHotelInfoRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://property.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressdetial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagcitycode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bagkhoroocode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contactphone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactphone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hotelname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumdistrictcode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceInsertHotelInfoRequestData", propOrder = {
    "addressdetial",
    "aimagcitycode",
    "bagkhoroocode",
    "contactphone1",
    "contactphone2",
    "hotelname",
    "soumdistrictcode"
})
public class ServiceInsertHotelInfoRequestData
    extends ServiceRequest
{

    protected String addressdetial;
    protected int aimagcitycode;
    protected int bagkhoroocode;
    protected String contactphone1;
    protected String contactphone2;
    protected String hotelname;
    protected int soumdistrictcode;

    /**
     * Gets the value of the addressdetial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressdetial() {
        return addressdetial;
    }

    /**
     * Sets the value of the addressdetial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressdetial(String value) {
        this.addressdetial = value;
    }

    /**
     * Gets the value of the aimagcitycode property.
     * 
     */
    public int getAimagcitycode() {
        return aimagcitycode;
    }

    /**
     * Sets the value of the aimagcitycode property.
     * 
     */
    public void setAimagcitycode(int value) {
        this.aimagcitycode = value;
    }

    /**
     * Gets the value of the bagkhoroocode property.
     * 
     */
    public int getBagkhoroocode() {
        return bagkhoroocode;
    }

    /**
     * Sets the value of the bagkhoroocode property.
     * 
     */
    public void setBagkhoroocode(int value) {
        this.bagkhoroocode = value;
    }

    /**
     * Gets the value of the contactphone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactphone1() {
        return contactphone1;
    }

    /**
     * Sets the value of the contactphone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactphone1(String value) {
        this.contactphone1 = value;
    }

    /**
     * Gets the value of the contactphone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactphone2() {
        return contactphone2;
    }

    /**
     * Sets the value of the contactphone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactphone2(String value) {
        this.contactphone2 = value;
    }

    /**
     * Gets the value of the hotelname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelname() {
        return hotelname;
    }

    /**
     * Sets the value of the hotelname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelname(String value) {
        this.hotelname = value;
    }

    /**
     * Gets the value of the soumdistrictcode property.
     * 
     */
    public int getSoumdistrictcode() {
        return soumdistrictcode;
    }

    /**
     * Sets the value of the soumdistrictcode property.
     * 
     */
    public void setSoumdistrictcode(int value) {
        this.soumdistrictcode = value;
    }

}
