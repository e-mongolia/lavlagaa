
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insuranceCitizenRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insuranceCitizenRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://insurance.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceCitizenRequestData", propOrder = {
    "endYear",
    "regnum",
    "startYear"
})
public class InsuranceCitizenRequestData
    extends ServiceRequest
{

    protected int endYear;
    protected String regnum;
    protected int startYear;

    /**
     * Gets the value of the endYear property.
     * 
     */
    public int getEndYear() {
        return endYear;
    }

    /**
     * Sets the value of the endYear property.
     * 
     */
    public void setEndYear(int value) {
        this.endYear = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

    /**
     * Gets the value of the startYear property.
     * 
     */
    public int getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     */
    public void setStartYear(int value) {
        this.startYear = value;
    }

}
