
package mn.gov.ema.emongolia.data.XypLegalEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityGeneralData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityGeneralData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyFounderCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descriptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="founderDecisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="founderDecisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="founderDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownershipTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownershipTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regulationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stateRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityGeneralData", propOrder = {
    "companyFounderCount",
    "companyName",
    "companyRegnum",
    "contractDate",
    "createdDate",
    "createdUserName",
    "decisionDate",
    "decisionNumber",
    "departmentName",
    "description",
    "descriptionCode",
    "founderDecisionName",
    "founderDecisionNumber",
    "founderDocumentName",
    "ownershipTypeCode",
    "ownershipTypeName",
    "profitTypeName",
    "regulationDate",
    "stateRegnum"
})
public class LegalEntityGeneralData {

    protected int companyFounderCount;
    protected String companyName;
    protected String companyRegnum;
    protected String contractDate;
    protected String createdDate;
    protected String createdUserName;
    protected String decisionDate;
    protected String decisionNumber;
    protected String departmentName;
    protected String description;
    protected String descriptionCode;
    protected String founderDecisionName;
    protected String founderDecisionNumber;
    protected String founderDocumentName;
    protected String ownershipTypeCode;
    protected String ownershipTypeName;
    protected String profitTypeName;
    protected String regulationDate;
    protected String stateRegnum;

    /**
     * Gets the value of the companyFounderCount property.
     * 
     */
    public int getCompanyFounderCount() {
        return companyFounderCount;
    }

    /**
     * Sets the value of the companyFounderCount property.
     * 
     */
    public void setCompanyFounderCount(int value) {
        this.companyFounderCount = value;
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
     * Gets the value of the contractDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractDate(String value) {
        this.contractDate = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the createdUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    /**
     * Sets the value of the createdUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedUserName(String value) {
        this.createdUserName = value;
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
     * Gets the value of the decisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNumber() {
        return decisionNumber;
    }

    /**
     * Sets the value of the decisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNumber(String value) {
        this.decisionNumber = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * Sets the value of the descriptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionCode(String value) {
        this.descriptionCode = value;
    }

    /**
     * Gets the value of the founderDecisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounderDecisionName() {
        return founderDecisionName;
    }

    /**
     * Sets the value of the founderDecisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounderDecisionName(String value) {
        this.founderDecisionName = value;
    }

    /**
     * Gets the value of the founderDecisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounderDecisionNumber() {
        return founderDecisionNumber;
    }

    /**
     * Sets the value of the founderDecisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounderDecisionNumber(String value) {
        this.founderDecisionNumber = value;
    }

    /**
     * Gets the value of the founderDocumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounderDocumentName() {
        return founderDocumentName;
    }

    /**
     * Sets the value of the founderDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounderDocumentName(String value) {
        this.founderDocumentName = value;
    }

    /**
     * Gets the value of the ownershipTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipTypeCode() {
        return ownershipTypeCode;
    }

    /**
     * Sets the value of the ownershipTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipTypeCode(String value) {
        this.ownershipTypeCode = value;
    }

    /**
     * Gets the value of the ownershipTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipTypeName() {
        return ownershipTypeName;
    }

    /**
     * Sets the value of the ownershipTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipTypeName(String value) {
        this.ownershipTypeName = value;
    }

    /**
     * Gets the value of the profitTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitTypeName() {
        return profitTypeName;
    }

    /**
     * Sets the value of the profitTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitTypeName(String value) {
        this.profitTypeName = value;
    }

    /**
     * Gets the value of the regulationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDate() {
        return regulationDate;
    }

    /**
     * Sets the value of the regulationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDate(String value) {
        this.regulationDate = value;
    }

    /**
     * Gets the value of the stateRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegnum() {
        return stateRegnum;
    }

    /**
     * Sets the value of the stateRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegnum(String value) {
        this.stateRegnum = value;
    }

}
