
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkLandMortgageDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkLandMortgageDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endMortgagePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loanContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="morgagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mortgageContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mortgageStatus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mortgageStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mortgageType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mortgageTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mortgagerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startMortagePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkLandMortgageDetailData", propOrder = {
    "docId",
    "docNumber",
    "endMortgagePeriod",
    "loanContractNumber",
    "morgagerName",
    "mortgageContractNumber",
    "mortgageStatus",
    "mortgageStatusDesc",
    "mortgageType",
    "mortgageTypeDesc",
    "mortgagerType",
    "startMortagePeriod"
})
public class CheckLandMortgageDetailData {

    protected String docId;
    protected String docNumber;
    protected String endMortgagePeriod;
    protected String loanContractNumber;
    protected String morgagerName;
    protected String mortgageContractNumber;
    protected int mortgageStatus;
    protected String mortgageStatusDesc;
    protected int mortgageType;
    protected String mortgageTypeDesc;
    protected String mortgagerType;
    protected String startMortagePeriod;

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the endMortgagePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndMortgagePeriod() {
        return endMortgagePeriod;
    }

    /**
     * Sets the value of the endMortgagePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndMortgagePeriod(String value) {
        this.endMortgagePeriod = value;
    }

    /**
     * Gets the value of the loanContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanContractNumber() {
        return loanContractNumber;
    }

    /**
     * Sets the value of the loanContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanContractNumber(String value) {
        this.loanContractNumber = value;
    }

    /**
     * Gets the value of the morgagerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorgagerName() {
        return morgagerName;
    }

    /**
     * Sets the value of the morgagerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorgagerName(String value) {
        this.morgagerName = value;
    }

    /**
     * Gets the value of the mortgageContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageContractNumber() {
        return mortgageContractNumber;
    }

    /**
     * Sets the value of the mortgageContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageContractNumber(String value) {
        this.mortgageContractNumber = value;
    }

    /**
     * Gets the value of the mortgageStatus property.
     * 
     */
    public int getMortgageStatus() {
        return mortgageStatus;
    }

    /**
     * Sets the value of the mortgageStatus property.
     * 
     */
    public void setMortgageStatus(int value) {
        this.mortgageStatus = value;
    }

    /**
     * Gets the value of the mortgageStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageStatusDesc() {
        return mortgageStatusDesc;
    }

    /**
     * Sets the value of the mortgageStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageStatusDesc(String value) {
        this.mortgageStatusDesc = value;
    }

    /**
     * Gets the value of the mortgageType property.
     * 
     */
    public int getMortgageType() {
        return mortgageType;
    }

    /**
     * Sets the value of the mortgageType property.
     * 
     */
    public void setMortgageType(int value) {
        this.mortgageType = value;
    }

    /**
     * Gets the value of the mortgageTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageTypeDesc() {
        return mortgageTypeDesc;
    }

    /**
     * Sets the value of the mortgageTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageTypeDesc(String value) {
        this.mortgageTypeDesc = value;
    }

    /**
     * Gets the value of the mortgagerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgagerType() {
        return mortgagerType;
    }

    /**
     * Sets the value of the mortgagerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgagerType(String value) {
        this.mortgagerType = value;
    }

    /**
     * Gets the value of the startMortagePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMortagePeriod() {
        return startMortagePeriod;
    }

    /**
     * Sets the value of the startMortagePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMortagePeriod(String value) {
        this.startMortagePeriod = value;
    }

}
