
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transportCheckGPSPaymentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transportCheckGPSPaymentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organizationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="payed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recCreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recDeleteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="recStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportCheckGPSPaymentData", propOrder = {
    "organizationId",
    "payed",
    "recCreateDate",
    "recDeleteDate",
    "recStatus",
    "recUpdateDate"
})
public class TransportCheckGPSPaymentData {

    protected int organizationId;
    protected String payed;
    protected String recCreateDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recDeleteDate;
    protected String recStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recUpdateDate;

    /**
     * Gets the value of the organizationId property.
     * 
     */
    public int getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     */
    public void setOrganizationId(int value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the payed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayed() {
        return payed;
    }

    /**
     * Sets the value of the payed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayed(String value) {
        this.payed = value;
    }

    /**
     * Gets the value of the recCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCreateDate() {
        return recCreateDate;
    }

    /**
     * Sets the value of the recCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCreateDate(String value) {
        this.recCreateDate = value;
    }

    /**
     * Gets the value of the recDeleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecDeleteDate() {
        return recDeleteDate;
    }

    /**
     * Sets the value of the recDeleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecDeleteDate(XMLGregorianCalendar value) {
        this.recDeleteDate = value;
    }

    /**
     * Gets the value of the recStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecStatus() {
        return recStatus;
    }

    /**
     * Sets the value of the recStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecStatus(String value) {
        this.recStatus = value;
    }

    /**
     * Gets the value of the recUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecUpdateDate() {
        return recUpdateDate;
    }

    /**
     * Sets the value of the recUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecUpdateDate(XMLGregorianCalendar value) {
        this.recUpdateDate = value;
    }

}
