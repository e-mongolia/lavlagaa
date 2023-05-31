
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for individualDebt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="individualDebt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c2Credit" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="c2Debit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="entId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="payable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="periodId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="periodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prevC2Credit" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="prevC2Debit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="refund" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="taxTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "individualDebt", propOrder = {
    "accountId",
    "branchName",
    "c2Credit",
    "c2Debit",
    "entId",
    "payable",
    "periodId",
    "periodName",
    "prevC2Credit",
    "prevC2Debit",
    "refund",
    "taxTypeName",
    "year"
})
public class IndividualDebt {

    protected int accountId;
    protected String branchName;
    protected double c2Credit;
    protected int c2Debit;
    protected int entId;
    protected int payable;
    protected int periodId;
    protected String periodName;
    protected double prevC2Credit;
    protected int prevC2Debit;
    protected int refund;
    protected String taxTypeName;
    protected int year;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the c2Credit property.
     * 
     */
    public double getC2Credit() {
        return c2Credit;
    }

    /**
     * Sets the value of the c2Credit property.
     * 
     */
    public void setC2Credit(double value) {
        this.c2Credit = value;
    }

    /**
     * Gets the value of the c2Debit property.
     * 
     */
    public int getC2Debit() {
        return c2Debit;
    }

    /**
     * Sets the value of the c2Debit property.
     * 
     */
    public void setC2Debit(int value) {
        this.c2Debit = value;
    }

    /**
     * Gets the value of the entId property.
     * 
     */
    public int getEntId() {
        return entId;
    }

    /**
     * Sets the value of the entId property.
     * 
     */
    public void setEntId(int value) {
        this.entId = value;
    }

    /**
     * Gets the value of the payable property.
     * 
     */
    public int getPayable() {
        return payable;
    }

    /**
     * Sets the value of the payable property.
     * 
     */
    public void setPayable(int value) {
        this.payable = value;
    }

    /**
     * Gets the value of the periodId property.
     * 
     */
    public int getPeriodId() {
        return periodId;
    }

    /**
     * Sets the value of the periodId property.
     * 
     */
    public void setPeriodId(int value) {
        this.periodId = value;
    }

    /**
     * Gets the value of the periodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodName() {
        return periodName;
    }

    /**
     * Sets the value of the periodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodName(String value) {
        this.periodName = value;
    }

    /**
     * Gets the value of the prevC2Credit property.
     * 
     */
    public double getPrevC2Credit() {
        return prevC2Credit;
    }

    /**
     * Sets the value of the prevC2Credit property.
     * 
     */
    public void setPrevC2Credit(double value) {
        this.prevC2Credit = value;
    }

    /**
     * Gets the value of the prevC2Debit property.
     * 
     */
    public int getPrevC2Debit() {
        return prevC2Debit;
    }

    /**
     * Sets the value of the prevC2Debit property.
     * 
     */
    public void setPrevC2Debit(int value) {
        this.prevC2Debit = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     */
    public int getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     */
    public void setRefund(int value) {
        this.refund = value;
    }

    /**
     * Gets the value of the taxTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTypeName() {
        return taxTypeName;
    }

    /**
     * Sets the value of the taxTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTypeName(String value) {
        this.taxTypeName = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
