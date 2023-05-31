
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleTaxInfoDataDetial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleTaxInfoDataDetial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airPollAmount_c2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ataxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount_c2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trafficAmount_c2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleTaxInfoDataDetial", propOrder = {
    "airPollAmountC2",
    "ataxId",
    "plateNumber",
    "taxAmountC2",
    "trafficAmountC2",
    "year"
})
public class VehicleTaxInfoDataDetial {

    @XmlElement(name = "airPollAmount_c2")
    protected String airPollAmountC2;
    protected String ataxId;
    protected String plateNumber;
    @XmlElement(name = "taxAmount_c2")
    protected String taxAmountC2;
    @XmlElement(name = "trafficAmount_c2")
    protected String trafficAmountC2;
    protected String year;

    /**
     * Gets the value of the airPollAmountC2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirPollAmountC2() {
        return airPollAmountC2;
    }

    /**
     * Sets the value of the airPollAmountC2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirPollAmountC2(String value) {
        this.airPollAmountC2 = value;
    }

    /**
     * Gets the value of the ataxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtaxId() {
        return ataxId;
    }

    /**
     * Sets the value of the ataxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtaxId(String value) {
        this.ataxId = value;
    }

    /**
     * Gets the value of the plateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * Sets the value of the plateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNumber(String value) {
        this.plateNumber = value;
    }

    /**
     * Gets the value of the taxAmountC2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmountC2() {
        return taxAmountC2;
    }

    /**
     * Sets the value of the taxAmountC2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmountC2(String value) {
        this.taxAmountC2 = value;
    }

    /**
     * Gets the value of the trafficAmountC2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficAmountC2() {
        return trafficAmountC2;
    }

    /**
     * Sets the value of the trafficAmountC2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficAmountC2(String value) {
        this.trafficAmountC2 = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

}
