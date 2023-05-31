
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomsInqData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomsInqData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="companyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customAMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dclrCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dclrTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exciseAMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="formulaAMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="inquiryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listItems" type="{http://les.xyp.gov.mn/}getCustomsInqDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statValueMNT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="statValueUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalAMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vatAMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomsInqData", propOrder = {
    "commission",
    "companyAddress",
    "companyName",
    "companyRegnum",
    "customAMT",
    "dclrCount",
    "dclrTypes",
    "endDate",
    "exciseAMT",
    "formulaAMT",
    "inquiryNumber",
    "listItems",
    "regDate",
    "startDate",
    "statValueMNT",
    "statValueUSD",
    "totalAMT",
    "type",
    "vatAMT"
})
public class GetCustomsInqData {

    protected Double commission;
    protected String companyAddress;
    protected String companyName;
    protected String companyRegnum;
    protected Double customAMT;
    protected String dclrCount;
    protected String dclrTypes;
    protected String endDate;
    protected Double exciseAMT;
    protected Double formulaAMT;
    protected String inquiryNumber;
    @XmlElement(nillable = true)
    protected List<GetCustomsInqDetailData> listItems;
    protected String regDate;
    protected String startDate;
    protected Double statValueMNT;
    protected Double statValueUSD;
    protected Double totalAMT;
    protected String type;
    protected Double vatAMT;

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCommission(Double value) {
        this.commission = value;
    }

    /**
     * Gets the value of the companyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * Sets the value of the companyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddress(String value) {
        this.companyAddress = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the customAMT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomAMT() {
        return customAMT;
    }

    /**
     * Sets the value of the customAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomAMT(Double value) {
        this.customAMT = value;
    }

    /**
     * Gets the value of the dclrCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrCount() {
        return dclrCount;
    }

    /**
     * Sets the value of the dclrCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclrCount(String value) {
        this.dclrCount = value;
    }

    /**
     * Gets the value of the dclrTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrTypes() {
        return dclrTypes;
    }

    /**
     * Sets the value of the dclrTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclrTypes(String value) {
        this.dclrTypes = value;
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
     * Gets the value of the exciseAMT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExciseAMT() {
        return exciseAMT;
    }

    /**
     * Sets the value of the exciseAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExciseAMT(Double value) {
        this.exciseAMT = value;
    }

    /**
     * Gets the value of the formulaAMT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFormulaAMT() {
        return formulaAMT;
    }

    /**
     * Sets the value of the formulaAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFormulaAMT(Double value) {
        this.formulaAMT = value;
    }

    /**
     * Gets the value of the inquiryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryNumber() {
        return inquiryNumber;
    }

    /**
     * Sets the value of the inquiryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryNumber(String value) {
        this.inquiryNumber = value;
    }

    /**
     * Gets the value of the listItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetCustomsInqDetailData }
     * 
     * 
     */
    public List<GetCustomsInqDetailData> getListItems() {
        if (listItems == null) {
            listItems = new ArrayList<GetCustomsInqDetailData>();
        }
        return this.listItems;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the statValueMNT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStatValueMNT() {
        return statValueMNT;
    }

    /**
     * Sets the value of the statValueMNT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStatValueMNT(Double value) {
        this.statValueMNT = value;
    }

    /**
     * Gets the value of the statValueUSD property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStatValueUSD() {
        return statValueUSD;
    }

    /**
     * Sets the value of the statValueUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStatValueUSD(Double value) {
        this.statValueUSD = value;
    }

    /**
     * Gets the value of the totalAMT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAMT() {
        return totalAMT;
    }

    /**
     * Sets the value of the totalAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAMT(Double value) {
        this.totalAMT = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the vatAMT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVatAMT() {
        return vatAMT;
    }

    /**
     * Sets the value of the vatAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVatAMT(Double value) {
        this.vatAMT = value;
    }

}
