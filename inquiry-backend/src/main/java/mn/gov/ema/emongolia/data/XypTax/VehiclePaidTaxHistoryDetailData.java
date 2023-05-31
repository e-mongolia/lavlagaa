
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehiclePaidTaxHistoryDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehiclePaidTaxHistoryDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airPollAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aptConfirmed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ataxConfirmed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ataxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attsEpaymentChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidAirPollAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidTrafficAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "vehiclePaidTaxHistoryDetailData", propOrder = {
    "airPollAmount",
    "aptConfirmed",
    "ataxConfirmed",
    "ataxId",
    "attsEpaymentChange",
    "paidAirPollAmount",
    "paidDate",
    "paidTaxAmount",
    "paidTrafficAmount",
    "plateNumber",
    "taxAmount",
    "trafficAmount",
    "year"
})
public class VehiclePaidTaxHistoryDetailData {

    protected String airPollAmount;
    protected String aptConfirmed;
    protected String ataxConfirmed;
    protected String ataxId;
    protected String attsEpaymentChange;
    protected String paidAirPollAmount;
    protected String paidDate;
    protected String paidTaxAmount;
    protected String paidTrafficAmount;
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
     * Gets the value of the aptConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAptConfirmed() {
        return aptConfirmed;
    }

    /**
     * Sets the value of the aptConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAptConfirmed(String value) {
        this.aptConfirmed = value;
    }

    /**
     * Gets the value of the ataxConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtaxConfirmed() {
        return ataxConfirmed;
    }

    /**
     * Sets the value of the ataxConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtaxConfirmed(String value) {
        this.ataxConfirmed = value;
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
     * Gets the value of the attsEpaymentChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttsEpaymentChange() {
        return attsEpaymentChange;
    }

    /**
     * Sets the value of the attsEpaymentChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttsEpaymentChange(String value) {
        this.attsEpaymentChange = value;
    }

    /**
     * Gets the value of the paidAirPollAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidAirPollAmount() {
        return paidAirPollAmount;
    }

    /**
     * Sets the value of the paidAirPollAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidAirPollAmount(String value) {
        this.paidAirPollAmount = value;
    }

    /**
     * Gets the value of the paidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidDate() {
        return paidDate;
    }

    /**
     * Sets the value of the paidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidDate(String value) {
        this.paidDate = value;
    }

    /**
     * Gets the value of the paidTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidTaxAmount() {
        return paidTaxAmount;
    }

    /**
     * Sets the value of the paidTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidTaxAmount(String value) {
        this.paidTaxAmount = value;
    }

    /**
     * Gets the value of the paidTrafficAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidTrafficAmount() {
        return paidTrafficAmount;
    }

    /**
     * Sets the value of the paidTrafficAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidTrafficAmount(String value) {
        this.paidTrafficAmount = value;
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
