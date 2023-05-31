
package mn.gov.ema.emongolia.data.XypProperty;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landSettlementActData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landSettlementActData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="approvedDuration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="certificateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feeDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impositionBody" type="{http://property.xyp.gov.mn/}impositionBodyDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ownerLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelLanduse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalFee" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalPaidYearAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalPlusAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalYearAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landSettlementActData", propOrder = {
    "approvedDuration",
    "certificateNo",
    "contractId",
    "contractNo",
    "decisionDate",
    "decisionLevel",
    "decisionNo",
    "feeDueDate",
    "impositionBody",
    "ownerLegalName",
    "parcelAddress",
    "parcelArea",
    "parcelId",
    "parcelLanduse",
    "personMobilePhone",
    "personPhone",
    "propertyNo",
    "totalAmount",
    "totalFee",
    "totalPaidAmount",
    "totalPaidYearAmount",
    "totalPlusAmount",
    "totalYearAmount"
})
public class LandSettlementActData {

    protected int approvedDuration;
    protected String certificateNo;
    protected int contractId;
    protected String contractNo;
    protected String decisionDate;
    protected String decisionLevel;
    protected String decisionNo;
    protected String feeDueDate;
    @XmlElement(nillable = true)
    protected List<ImpositionBodyDetail> impositionBody;
    protected String ownerLegalName;
    protected String parcelAddress;
    protected String parcelArea;
    protected String parcelId;
    protected String parcelLanduse;
    protected String personMobilePhone;
    protected String personPhone;
    protected String propertyNo;
    protected double totalAmount;
    protected int totalFee;
    protected double totalPaidAmount;
    protected double totalPaidYearAmount;
    protected double totalPlusAmount;
    protected String totalYearAmount;

    /**
     * Gets the value of the approvedDuration property.
     * 
     */
    public int getApprovedDuration() {
        return approvedDuration;
    }

    /**
     * Sets the value of the approvedDuration property.
     * 
     */
    public void setApprovedDuration(int value) {
        this.approvedDuration = value;
    }

    /**
     * Gets the value of the certificateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * Sets the value of the certificateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNo(String value) {
        this.certificateNo = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     */
    public int getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(int value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

    /**
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionDate(String value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the decisionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionLevel() {
        return decisionLevel;
    }

    /**
     * Sets the value of the decisionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionLevel(String value) {
        this.decisionLevel = value;
    }

    /**
     * Gets the value of the decisionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNo() {
        return decisionNo;
    }

    /**
     * Sets the value of the decisionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNo(String value) {
        this.decisionNo = value;
    }

    /**
     * Gets the value of the feeDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeDueDate() {
        return feeDueDate;
    }

    /**
     * Sets the value of the feeDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeDueDate(String value) {
        this.feeDueDate = value;
    }

    /**
     * Gets the value of the impositionBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impositionBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpositionBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpositionBodyDetail }
     * 
     * 
     */
    public List<ImpositionBodyDetail> getImpositionBody() {
        if (impositionBody == null) {
            impositionBody = new ArrayList<ImpositionBodyDetail>();
        }
        return this.impositionBody;
    }

    /**
     * Gets the value of the ownerLegalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerLegalName() {
        return ownerLegalName;
    }

    /**
     * Sets the value of the ownerLegalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerLegalName(String value) {
        this.ownerLegalName = value;
    }

    /**
     * Gets the value of the parcelAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelAddress() {
        return parcelAddress;
    }

    /**
     * Sets the value of the parcelAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelAddress(String value) {
        this.parcelAddress = value;
    }

    /**
     * Gets the value of the parcelArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelArea() {
        return parcelArea;
    }

    /**
     * Sets the value of the parcelArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelArea(String value) {
        this.parcelArea = value;
    }

    /**
     * Gets the value of the parcelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelId() {
        return parcelId;
    }

    /**
     * Sets the value of the parcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelId(String value) {
        this.parcelId = value;
    }

    /**
     * Gets the value of the parcelLanduse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelLanduse() {
        return parcelLanduse;
    }

    /**
     * Sets the value of the parcelLanduse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelLanduse(String value) {
        this.parcelLanduse = value;
    }

    /**
     * Gets the value of the personMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonMobilePhone() {
        return personMobilePhone;
    }

    /**
     * Sets the value of the personMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonMobilePhone(String value) {
        this.personMobilePhone = value;
    }

    /**
     * Gets the value of the personPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonPhone() {
        return personPhone;
    }

    /**
     * Sets the value of the personPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonPhone(String value) {
        this.personPhone = value;
    }

    /**
     * Gets the value of the propertyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyNo() {
        return propertyNo;
    }

    /**
     * Sets the value of the propertyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyNo(String value) {
        this.propertyNo = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(double value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalFee property.
     * 
     */
    public int getTotalFee() {
        return totalFee;
    }

    /**
     * Sets the value of the totalFee property.
     * 
     */
    public void setTotalFee(int value) {
        this.totalFee = value;
    }

    /**
     * Gets the value of the totalPaidAmount property.
     * 
     */
    public double getTotalPaidAmount() {
        return totalPaidAmount;
    }

    /**
     * Sets the value of the totalPaidAmount property.
     * 
     */
    public void setTotalPaidAmount(double value) {
        this.totalPaidAmount = value;
    }

    /**
     * Gets the value of the totalPaidYearAmount property.
     * 
     */
    public double getTotalPaidYearAmount() {
        return totalPaidYearAmount;
    }

    /**
     * Sets the value of the totalPaidYearAmount property.
     * 
     */
    public void setTotalPaidYearAmount(double value) {
        this.totalPaidYearAmount = value;
    }

    /**
     * Gets the value of the totalPlusAmount property.
     * 
     */
    public double getTotalPlusAmount() {
        return totalPlusAmount;
    }

    /**
     * Sets the value of the totalPlusAmount property.
     * 
     */
    public void setTotalPlusAmount(double value) {
        this.totalPlusAmount = value;
    }

    /**
     * Gets the value of the totalYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalYearAmount() {
        return totalYearAmount;
    }

    /**
     * Sets the value of the totalYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalYearAmount(String value) {
        this.totalYearAmount = value;
    }

}
