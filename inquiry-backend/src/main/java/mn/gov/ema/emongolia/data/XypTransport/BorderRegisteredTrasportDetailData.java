
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for borderRegisteredTrasportDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="borderRegisteredTrasportDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasTrailer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportCabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tripNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tripRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borderRegisteredTrasportDetailData", propOrder = {
    "countryName",
    "hasTrailer",
    "passDate",
    "passDirection",
    "passPort",
    "passTime",
    "trailerColor",
    "trailerMark",
    "trailerNumber",
    "transport",
    "transportCabinNumber",
    "transportColor",
    "transportMark",
    "transportModel",
    "transportType",
    "tripNumber",
    "tripRoute"
})
public class BorderRegisteredTrasportDetailData {

    protected String countryName;
    protected String hasTrailer;
    protected String passDate;
    protected String passDirection;
    protected String passPort;
    protected String passTime;
    protected String trailerColor;
    protected String trailerMark;
    protected String trailerNumber;
    protected String transport;
    protected String transportCabinNumber;
    protected String transportColor;
    protected String transportMark;
    protected String transportModel;
    protected String transportType;
    protected String tripNumber;
    protected String tripRoute;

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the hasTrailer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasTrailer() {
        return hasTrailer;
    }

    /**
     * Sets the value of the hasTrailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasTrailer(String value) {
        this.hasTrailer = value;
    }

    /**
     * Gets the value of the passDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassDate() {
        return passDate;
    }

    /**
     * Sets the value of the passDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassDate(String value) {
        this.passDate = value;
    }

    /**
     * Gets the value of the passDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassDirection() {
        return passDirection;
    }

    /**
     * Sets the value of the passDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassDirection(String value) {
        this.passDirection = value;
    }

    /**
     * Gets the value of the passPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassPort() {
        return passPort;
    }

    /**
     * Sets the value of the passPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassPort(String value) {
        this.passPort = value;
    }

    /**
     * Gets the value of the passTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassTime() {
        return passTime;
    }

    /**
     * Sets the value of the passTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassTime(String value) {
        this.passTime = value;
    }

    /**
     * Gets the value of the trailerColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerColor() {
        return trailerColor;
    }

    /**
     * Sets the value of the trailerColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerColor(String value) {
        this.trailerColor = value;
    }

    /**
     * Gets the value of the trailerMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerMark() {
        return trailerMark;
    }

    /**
     * Sets the value of the trailerMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerMark(String value) {
        this.trailerMark = value;
    }

    /**
     * Gets the value of the trailerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerNumber() {
        return trailerNumber;
    }

    /**
     * Sets the value of the trailerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerNumber(String value) {
        this.trailerNumber = value;
    }

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransport(String value) {
        this.transport = value;
    }

    /**
     * Gets the value of the transportCabinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportCabinNumber() {
        return transportCabinNumber;
    }

    /**
     * Sets the value of the transportCabinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportCabinNumber(String value) {
        this.transportCabinNumber = value;
    }

    /**
     * Gets the value of the transportColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportColor() {
        return transportColor;
    }

    /**
     * Sets the value of the transportColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportColor(String value) {
        this.transportColor = value;
    }

    /**
     * Gets the value of the transportMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMark() {
        return transportMark;
    }

    /**
     * Sets the value of the transportMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMark(String value) {
        this.transportMark = value;
    }

    /**
     * Gets the value of the transportModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportModel() {
        return transportModel;
    }

    /**
     * Sets the value of the transportModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportModel(String value) {
        this.transportModel = value;
    }

    /**
     * Gets the value of the transportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportType() {
        return transportType;
    }

    /**
     * Sets the value of the transportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportType(String value) {
        this.transportType = value;
    }

    /**
     * Gets the value of the tripNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNumber() {
        return tripNumber;
    }

    /**
     * Sets the value of the tripNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripNumber(String value) {
        this.tripNumber = value;
    }

    /**
     * Gets the value of the tripRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripRoute() {
        return tripRoute;
    }

    /**
     * Sets the value of the tripRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripRoute(String value) {
        this.tripRoute = value;
    }

}
