
package mn.gov.ema.emongolia.data.XypTax;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for individualInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="individualInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ebarimt" type="{http://tax.xyp.gov.mn/}individualEbarimt" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listDebt" type="{http://tax.xyp.gov.mn/}individualDebt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listPayment" type="{http://tax.xyp.gov.mn/}individualPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listReturn" type="{http://tax.xyp.gov.mn/}individualReturn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "individualInfoData", propOrder = {
    "address",
    "callDate",
    "callNumber",
    "ebarimt",
    "endDate",
    "forUsage",
    "fullName",
    "listDebt",
    "listPayment",
    "listReturn",
    "regnum",
    "usage",
    "year"
})
public class IndividualInfoData {

    protected String address;
    protected String callDate;
    protected String callNumber;
    protected IndividualEbarimt ebarimt;
    protected String endDate;
    protected String forUsage;
    protected String fullName;
    @XmlElement(nillable = true)
    protected List<IndividualDebt> listDebt;
    @XmlElement(nillable = true)
    protected List<IndividualPayment> listPayment;
    @XmlElement(nillable = true)
    protected List<IndividualReturn> listReturn;
    protected String regnum;
    protected String usage;
    protected String year;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the callDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDate() {
        return callDate;
    }

    /**
     * Sets the value of the callDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDate(String value) {
        this.callDate = value;
    }

    /**
     * Gets the value of the callNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallNumber() {
        return callNumber;
    }

    /**
     * Sets the value of the callNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallNumber(String value) {
        this.callNumber = value;
    }

    /**
     * Gets the value of the ebarimt property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualEbarimt }
     *     
     */
    public IndividualEbarimt getEbarimt() {
        return ebarimt;
    }

    /**
     * Sets the value of the ebarimt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualEbarimt }
     *     
     */
    public void setEbarimt(IndividualEbarimt value) {
        this.ebarimt = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the forUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForUsage() {
        return forUsage;
    }

    /**
     * Sets the value of the forUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForUsage(String value) {
        this.forUsage = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the listDebt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDebt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDebt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualDebt }
     * 
     * 
     */
    public List<IndividualDebt> getListDebt() {
        if (listDebt == null) {
            listDebt = new ArrayList<IndividualDebt>();
        }
        return this.listDebt;
    }

    /**
     * Gets the value of the listPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPayment }
     * 
     * 
     */
    public List<IndividualPayment> getListPayment() {
        if (listPayment == null) {
            listPayment = new ArrayList<IndividualPayment>();
        }
        return this.listPayment;
    }

    /**
     * Gets the value of the listReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualReturn }
     * 
     * 
     */
    public List<IndividualReturn> getListReturn() {
        if (listReturn == null) {
            listReturn = new ArrayList<IndividualReturn>();
        }
        return this.listReturn;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
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
