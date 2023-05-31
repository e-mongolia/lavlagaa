
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vehiclePenaltyInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehiclePenaltyInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="barCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="passDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="paymentBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentBankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="plateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qpQRcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sanc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehiclePenaltyInfoDetailData", propOrder = {
    "amount",
    "barCode",
    "localName",
    "paid",
    "passDate",
    "paymentBankAccount",
    "paymentBankAccountName",
    "paymentBankName",
    "paymentDate",
    "plateNumber",
    "qpQRcode",
    "reasonType",
    "reasonTypeCode",
    "sanc"
})
public class VehiclePenaltyInfoDetailData {

    protected int amount;
    protected String barCode;
    protected String localName;
    protected boolean paid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passDate;
    protected String paymentBankAccount;
    protected String paymentBankAccountName;
    protected String paymentBankName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    protected String plateNumber;
    protected String qpQRcode;
    protected String reasonType;
    protected int reasonTypeCode;
    protected String sanc;

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the localName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Gets the value of the paid property.
     * 
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     */
    public void setPaid(boolean value) {
        this.paid = value;
    }

    /**
     * Gets the value of the passDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassDate() {
        return passDate;
    }

    /**
     * Sets the value of the passDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassDate(XMLGregorianCalendar value) {
        this.passDate = value;
    }

    /**
     * Gets the value of the paymentBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBankAccount() {
        return paymentBankAccount;
    }

    /**
     * Sets the value of the paymentBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBankAccount(String value) {
        this.paymentBankAccount = value;
    }

    /**
     * Gets the value of the paymentBankAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBankAccountName() {
        return paymentBankAccountName;
    }

    /**
     * Sets the value of the paymentBankAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBankAccountName(String value) {
        this.paymentBankAccountName = value;
    }

    /**
     * Gets the value of the paymentBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBankName() {
        return paymentBankName;
    }

    /**
     * Sets the value of the paymentBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBankName(String value) {
        this.paymentBankName = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
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
     * Gets the value of the qpQRcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQpQRcode() {
        return qpQRcode;
    }

    /**
     * Sets the value of the qpQRcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQpQRcode(String value) {
        this.qpQRcode = value;
    }

    /**
     * Gets the value of the reasonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonType() {
        return reasonType;
    }

    /**
     * Sets the value of the reasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonType(String value) {
        this.reasonType = value;
    }

    /**
     * Gets the value of the reasonTypeCode property.
     * 
     */
    public int getReasonTypeCode() {
        return reasonTypeCode;
    }

    /**
     * Sets the value of the reasonTypeCode property.
     * 
     */
    public void setReasonTypeCode(int value) {
        this.reasonTypeCode = value;
    }

    /**
     * Gets the value of the sanc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanc() {
        return sanc;
    }

    /**
     * Sets the value of the sanc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanc(String value) {
        this.sanc = value;
    }

}
