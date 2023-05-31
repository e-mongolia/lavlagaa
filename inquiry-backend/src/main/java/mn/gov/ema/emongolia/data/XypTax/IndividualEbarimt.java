
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for individualEbarimt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="individualEbarimt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isConnected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastSendDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiptSendState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiptSendStateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "individualEbarimt", propOrder = {
    "connectedDate",
    "isConnected",
    "lastSendDate",
    "prYear",
    "receiptSendState",
    "receiptSendStateName",
    "regno"
})
public class IndividualEbarimt {

    protected String connectedDate;
    protected String isConnected;
    protected String lastSendDate;
    protected String prYear;
    protected String receiptSendState;
    protected String receiptSendStateName;
    protected String regno;

    /**
     * Gets the value of the connectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedDate() {
        return connectedDate;
    }

    /**
     * Sets the value of the connectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedDate(String value) {
        this.connectedDate = value;
    }

    /**
     * Gets the value of the isConnected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsConnected() {
        return isConnected;
    }

    /**
     * Sets the value of the isConnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsConnected(String value) {
        this.isConnected = value;
    }

    /**
     * Gets the value of the lastSendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSendDate() {
        return lastSendDate;
    }

    /**
     * Sets the value of the lastSendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSendDate(String value) {
        this.lastSendDate = value;
    }

    /**
     * Gets the value of the prYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrYear() {
        return prYear;
    }

    /**
     * Sets the value of the prYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrYear(String value) {
        this.prYear = value;
    }

    /**
     * Gets the value of the receiptSendState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptSendState() {
        return receiptSendState;
    }

    /**
     * Sets the value of the receiptSendState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptSendState(String value) {
        this.receiptSendState = value;
    }

    /**
     * Gets the value of the receiptSendStateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptSendStateName() {
        return receiptSendStateName;
    }

    /**
     * Sets the value of the receiptSendStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptSendStateName(String value) {
        this.receiptSendStateName = value;
    }

    /**
     * Gets the value of the regno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegno() {
        return regno;
    }

    /**
     * Sets the value of the regno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegno(String value) {
        this.regno = value;
    }

}
