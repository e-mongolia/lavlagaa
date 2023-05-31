
package mn.gov.ema.emongolia.data.XypTax;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tenderInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tenderInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ebarimt" type="{http://tax.xyp.gov.mn/}tenderEbarimt" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listDebts" type="{http://tax.xyp.gov.mn/}tenderDebt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listIncomes" type="{http://tax.xyp.gov.mn/}tenderIncomes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tenderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpInfo" type="{http://tax.xyp.gov.mn/}tenderTpInfo" minOccurs="0"/&gt;
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
@XmlType(name = "tenderInfoData", propOrder = {
    "callDate",
    "callNumber",
    "companyRegnum",
    "ebarimt",
    "endDate",
    "listDebts",
    "listIncomes",
    "tenderName",
    "tenderNumber",
    "tpInfo",
    "usage",
    "year"
})
public class TenderInfoData {

    protected String callDate;
    protected String callNumber;
    protected String companyRegnum;
    protected TenderEbarimt ebarimt;
    protected String endDate;
    @XmlElement(nillable = true)
    protected List<TenderDebt> listDebts;
    @XmlElement(nillable = true)
    protected List<TenderIncomes> listIncomes;
    protected String tenderName;
    protected String tenderNumber;
    protected TenderTpInfo tpInfo;
    protected String usage;
    protected String year;

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
     * Gets the value of the companyRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegnum() {
        return companyRegnum;
    }

    /**
     * Sets the value of the companyRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegnum(String value) {
        this.companyRegnum = value;
    }

    /**
     * Gets the value of the ebarimt property.
     * 
     * @return
     *     possible object is
     *     {@link TenderEbarimt }
     *     
     */
    public TenderEbarimt getEbarimt() {
        return ebarimt;
    }

    /**
     * Sets the value of the ebarimt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEbarimt }
     *     
     */
    public void setEbarimt(TenderEbarimt value) {
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
     * Gets the value of the listDebts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDebts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDebts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderDebt }
     * 
     * 
     */
    public List<TenderDebt> getListDebts() {
        if (listDebts == null) {
            listDebts = new ArrayList<TenderDebt>();
        }
        return this.listDebts;
    }

    /**
     * Gets the value of the listIncomes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listIncomes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListIncomes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderIncomes }
     * 
     * 
     */
    public List<TenderIncomes> getListIncomes() {
        if (listIncomes == null) {
            listIncomes = new ArrayList<TenderIncomes>();
        }
        return this.listIncomes;
    }

    /**
     * Gets the value of the tenderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderName() {
        return tenderName;
    }

    /**
     * Sets the value of the tenderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderName(String value) {
        this.tenderName = value;
    }

    /**
     * Gets the value of the tenderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderNumber() {
        return tenderNumber;
    }

    /**
     * Sets the value of the tenderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderNumber(String value) {
        this.tenderNumber = value;
    }

    /**
     * Gets the value of the tpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TenderTpInfo }
     *     
     */
    public TenderTpInfo getTpInfo() {
        return tpInfo;
    }

    /**
     * Sets the value of the tpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderTpInfo }
     *     
     */
    public void setTpInfo(TenderTpInfo value) {
        this.tpInfo = value;
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
