
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceTaxRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceTaxRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tax.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dedication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dedicationOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceTaxRequestData", propOrder = {
    "dedication",
    "dedicationOrg",
    "documentResponse",
    "orgId",
    "tin",
    "year"
})
public class ServiceTaxRequestData
    extends ServiceRequest
{

    protected String dedication;
    protected String dedicationOrg;
    protected String documentResponse;
    protected String orgId;
    protected String tin;
    protected String year;

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

}
