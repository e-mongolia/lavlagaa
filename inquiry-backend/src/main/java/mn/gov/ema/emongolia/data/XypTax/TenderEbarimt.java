
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tenderEbarimt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tenderEbarimt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isConnected" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastSendDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiptSendState" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="receiptSendStateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tenderEbarimt", propOrder = {
    "connectedDate",
    "isConnected",
    "lastSendDate",
    "prYear",
    "receiptSendState",
    "receiptSendStateName",
    "regNo"
})
public class TenderEbarimt {

    protected String connectedDate;
    protected int isConnected;
    protected String lastSendDate;
    protected String prYear;
    protected int receiptSendState;
    protected String receiptSendStateName;
    protected String regNo;

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
     */
    public int getIsConnected() {
        return isConnected;
    }

    /**
     * Sets the value of the isConnected property.
     * 
     */
    public void setIsConnected(int value) {
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
     */
    public int getReceiptSendState() {
        return receiptSendState;
    }

    /**
     * Sets the value of the receiptSendState property.
     * 
     */
    public void setReceiptSendState(int value) {
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
     * Gets the value of the regNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * Sets the value of the regNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNo(String value) {
        this.regNo = value;
    }

}
