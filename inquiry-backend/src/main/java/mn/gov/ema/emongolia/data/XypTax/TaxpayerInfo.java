
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxpayerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxpayerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="business_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="business_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="call_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="call_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dedicate_organisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dedication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deleted_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deleted_reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="document_response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="found_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="headnames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legal_status_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legal_status_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="office_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="office_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="property_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="property_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="suboffice_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suboffice_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "taxpayerInfo", namespace = "http://ws/", propOrder = {
    "address",
    "businessCode",
    "businessName",
    "callDate",
    "callNumber",
    "dedicateOrganisation",
    "dedication",
    "deletedDate",
    "deletedReason",
    "documentResponse",
    "foundDate",
    "headnames",
    "id",
    "legalStatusCode",
    "legalStatusName",
    "name",
    "officeCode",
    "officeName",
    "organisationId",
    "phoneNumber",
    "propertyCode",
    "propertyName",
    "registr",
    "resultCode",
    "subofficeCode",
    "subofficeName",
    "year"
})
public class TaxpayerInfo {

    protected String address;
    @XmlElement(name = "business_code")
    protected String businessCode;
    @XmlElement(name = "business_name")
    protected String businessName;
    @XmlElement(name = "call_date")
    protected String callDate;
    @XmlElement(name = "call_number")
    protected String callNumber;
    @XmlElement(name = "dedicate_organisation")
    protected String dedicateOrganisation;
    protected String dedication;
    @XmlElement(name = "deleted_date")
    protected String deletedDate;
    @XmlElement(name = "deleted_reason")
    protected String deletedReason;
    @XmlElement(name = "document_response")
    protected String documentResponse;
    @XmlElement(name = "found_date")
    protected String foundDate;
    protected String headnames;
    protected String id;
    @XmlElement(name = "legal_status_code")
    protected String legalStatusCode;
    @XmlElement(name = "legal_status_name")
    protected String legalStatusName;
    protected String name;
    @XmlElement(name = "office_code")
    protected String officeCode;
    @XmlElement(name = "office_name")
    protected String officeName;
    @XmlElement(name = "organisation_id")
    protected String organisationId;
    @XmlElement(name = "phone_number")
    protected String phoneNumber;
    @XmlElement(name = "property_code")
    protected String propertyCode;
    @XmlElement(name = "property_name")
    protected String propertyName;
    protected String registr;
    protected int resultCode;
    @XmlElement(name = "suboffice_code")
    protected String subofficeCode;
    @XmlElement(name = "suboffice_name")
    protected String subofficeName;
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
     * Gets the value of the businessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * Sets the value of the businessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCode(String value) {
        this.businessCode = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
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
     * Gets the value of the dedicateOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedicateOrganisation() {
        return dedicateOrganisation;
    }

    /**
     * Sets the value of the dedicateOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedicateOrganisation(String value) {
        this.dedicateOrganisation = value;
    }

    /**
     * Gets the value of the dedication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedication() {
        return dedication;
    }

    /**
     * Sets the value of the dedication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedication(String value) {
        this.dedication = value;
    }

    /**
     * Gets the value of the deletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletedDate() {
        return deletedDate;
    }

    /**
     * Sets the value of the deletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletedDate(String value) {
        this.deletedDate = value;
    }

    /**
     * Gets the value of the deletedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletedReason() {
        return deletedReason;
    }

    /**
     * Sets the value of the deletedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletedReason(String value) {
        this.deletedReason = value;
    }

    /**
     * Gets the value of the documentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentResponse() {
        return documentResponse;
    }

    /**
     * Sets the value of the documentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentResponse(String value) {
        this.documentResponse = value;
    }

    /**
     * Gets the value of the foundDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundDate() {
        return foundDate;
    }

    /**
     * Sets the value of the foundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundDate(String value) {
        this.foundDate = value;
    }

    /**
     * Gets the value of the headnames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadnames() {
        return headnames;
    }

    /**
     * Sets the value of the headnames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadnames(String value) {
        this.headnames = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the legalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatusCode() {
        return legalStatusCode;
    }

    /**
     * Sets the value of the legalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatusCode(String value) {
        this.legalStatusCode = value;
    }

    /**
     * Gets the value of the legalStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatusName() {
        return legalStatusName;
    }

    /**
     * Sets the value of the legalStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatusName(String value) {
        this.legalStatusName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the officeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Sets the value of the officeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeName(String value) {
        this.officeName = value;
    }

    /**
     * Gets the value of the organisationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationId() {
        return organisationId;
    }

    /**
     * Sets the value of the organisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationId(String value) {
        this.organisationId = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the propertyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyCode() {
        return propertyCode;
    }

    /**
     * Sets the value of the propertyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyCode(String value) {
        this.propertyCode = value;
    }

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the registr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistr() {
        return registr;
    }

    /**
     * Sets the value of the registr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistr(String value) {
        this.registr = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the subofficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubofficeCode() {
        return subofficeCode;
    }

    /**
     * Sets the value of the subofficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubofficeCode(String value) {
        this.subofficeCode = value;
    }

    /**
     * Gets the value of the subofficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubofficeName() {
        return subofficeName;
    }

    /**
     * Sets the value of the subofficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubofficeName(String value) {
        this.subofficeName = value;
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
