
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getServiceLogTender complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceLogTender"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="p_tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="p_dedicate_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dedicate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="p_dedicate_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "getServiceLogTender", namespace = "http://ws/", propOrder = {
    "pTin",
    "pDedicateNumber",
    "dedicate",
    "pDedicateDate",
    "orgId"
})
public class GetServiceLogTender {

    @XmlElement(name = "p_tin")
    protected String pTin;
    @XmlElement(name = "p_dedicate_number")
    protected String pDedicateNumber;
    protected String dedicate;
    @XmlElement(name = "p_dedicate_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pDedicateDate;
    @XmlElement(name = "org_id")
    protected String orgId;

    /**
     * Gets the value of the pTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTin() {
        return pTin;
    }

    /**
     * Sets the value of the pTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTin(String value) {
        this.pTin = value;
    }

    /**
     * Gets the value of the pDedicateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDedicateNumber() {
        return pDedicateNumber;
    }

    /**
     * Sets the value of the pDedicateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDedicateNumber(String value) {
        this.pDedicateNumber = value;
    }

    /**
     * Gets the value of the dedicate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedicate() {
        return dedicate;
    }

    /**
     * Sets the value of the dedicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedicate(String value) {
        this.dedicate = value;
    }

    /**
     * Gets the value of the pDedicateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPDedicateDate() {
        return pDedicateDate;
    }

    /**
     * Sets the value of the pDedicateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPDedicateDate(XMLGregorianCalendar value) {
        this.pDedicateDate = value;
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
