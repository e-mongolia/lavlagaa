
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchLegalEntityNameDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchLegalEntityNameDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cprName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="repName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchLegalEntityNameDetailData", propOrder = {
    "cprName",
    "date",
    "repName"
})
public class SearchLegalEntityNameDetailData {

    protected String cprName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected String repName;

    /**
     * Gets the value of the cprName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCprName() {
        return cprName;
    }

    /**
     * Sets the value of the cprName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCprName(String value) {
        this.cprName = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the repName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepName() {
        return repName;
    }

    /**
     * Sets the value of the repName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepName(String value) {
        this.repName = value;
    }

}
