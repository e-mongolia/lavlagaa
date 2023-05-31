
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleBorderPassDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleBorderPassDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleBorderPassDetailData", propOrder = {
    "country",
    "passDate",
    "passDirection",
    "passPort",
    "passTime",
    "trailerNum",
    "transKind",
    "transMark",
    "transModel",
    "transNum",
    "transType"
})
public class VehicleBorderPassDetailData {

    protected String country;
    protected String passDate;
    protected String passDirection;
    protected String passPort;
    protected String passTime;
    protected String trailerNum;
    protected String transKind;
    protected String transMark;
    protected String transModel;
    protected String transNum;
    protected String transType;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the trailerNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerNum() {
        return trailerNum;
    }

    /**
     * Sets the value of the trailerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerNum(String value) {
        this.trailerNum = value;
    }

    /**
     * Gets the value of the transKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransKind() {
        return transKind;
    }

    /**
     * Sets the value of the transKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransKind(String value) {
        this.transKind = value;
    }

    /**
     * Gets the value of the transMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransMark() {
        return transMark;
    }

    /**
     * Sets the value of the transMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransMark(String value) {
        this.transMark = value;
    }

    /**
     * Gets the value of the transModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransModel() {
        return transModel;
    }

    /**
     * Sets the value of the transModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransModel(String value) {
        this.transModel = value;
    }

    /**
     * Gets the value of the transNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransNum() {
        return transNum;
    }

    /**
     * Sets the value of the transNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransNum(String value) {
        this.transNum = value;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

}
