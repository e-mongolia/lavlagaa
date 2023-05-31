
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleTaxPayableInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleTaxPayableInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airPollAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ataxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attaxConfirmOffcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trafficAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "vehicleTaxPayableInfoDetailData", propOrder = {
    "airPollAmount",
    "aptId",
    "ataxId",
    "attaxConfirmOffcode",
    "attsId",
    "plateNumber",
    "taxAmount",
    "trafficAmount",
    "year"
})
public class VehicleTaxPayableInfoDetailData {

    protected String airPollAmount;
    protected String aptId;
    protected String ataxId;
    protected String attaxConfirmOffcode;
    protected String attsId;
    protected String plateNumber;
    protected String taxAmount;
    protected String trafficAmount;
    protected String year;

    /**
     * Gets the value of the airPollAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirPollAmount() {
        return airPollAmount;
    }

    /**
     * Sets the value of the airPollAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirPollAmount(String value) {
        this.airPollAmount = value;
    }

    /**
     * Gets the value of the aptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAptId() {
        return aptId;
    }

    /**
     * Sets the value of the aptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAptId(String value) {
        this.aptId = value;
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
     * Gets the value of the attaxConfirmOffcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttaxConfirmOffcode() {
        return attaxConfirmOffcode;
    }

    /**
     * Sets the value of the attaxConfirmOffcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttaxConfirmOffcode(String value) {
        this.attaxConfirmOffcode = value;
    }

    /**
     * Gets the value of the attsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttsId() {
        return attsId;
    }

    /**
     * Sets the value of the attsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttsId(String value) {
        this.attsId = value;
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
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the trafficAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficAmount() {
        return trafficAmount;
    }

    /**
     * Sets the value of the trafficAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficAmount(String value) {
        this.trafficAmount = value;
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
