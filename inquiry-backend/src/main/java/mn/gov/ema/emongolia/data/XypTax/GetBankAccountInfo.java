
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBankAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBankAccountInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="document_response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dedication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dedication_org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="org_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBankAccountInfo", namespace = "http://ws/", propOrder = {
    "tin",
    "year",
    "documentResponse",
    "dedication",
    "dedicationOrg",
    "orgId"
})
public class GetBankAccountInfo {

    protected String tin;
    protected String year;
    @XmlElement(name = "document_response")
    protected String documentResponse;
    protected String dedication;
    @XmlElement(name = "dedication_org")
    protected String dedicationOrg;
    @XmlElement(name = "org_id")
    protected String orgId;

    /**
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTin(String value) {
        this.tin = value;
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
     * Gets the value of the dedicationOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedicationOrg() {
        return dedicationOrg;
    }

    /**
     * Sets the value of the dedicationOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedicationOrg(String value) {
        this.dedicationOrg = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgId(String value) {
        this.orgId = value;
    }

}
