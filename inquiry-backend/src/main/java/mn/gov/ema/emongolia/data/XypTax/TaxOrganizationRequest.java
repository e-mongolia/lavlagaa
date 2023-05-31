
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxOrganizationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxOrganizationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tax.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beginNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "taxOrganizationRequest", propOrder = {
    "beginNumber",
    "endNumber",
    "period",
    "year"
})
public class TaxOrganizationRequest
    extends ServiceRequest
{

    protected int beginNumber;
    protected int endNumber;
    protected int period;
    protected String year;

    /**
     * Gets the value of the beginNumber property.
     * 
     */
    public int getBeginNumber() {
        return beginNumber;
    }

    /**
     * Sets the value of the beginNumber property.
     * 
     */
    public void setBeginNumber(int value) {
        this.beginNumber = value;
    }

    /**
     * Gets the value of the endNumber property.
     * 
     */
    public int getEndNumber() {
        return endNumber;
    }

    /**
     * Sets the value of the endNumber property.
     * 
     */
    public void setEndNumber(int value) {
        this.endNumber = value;
    }

    /**
     * Gets the value of the period property.
     * 
     */
    public int getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     */
    public void setPeriod(int value) {
        this.period = value;
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
