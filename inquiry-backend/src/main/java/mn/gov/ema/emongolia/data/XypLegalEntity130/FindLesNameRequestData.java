
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findLesNameRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findLesNameRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://les.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lesname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findLesNameRequestData", propOrder = {
    "lesname",
    "type"
})
public class FindLesNameRequestData
    extends ServiceRequest
{

    protected String lesname;
    protected String type;

    /**
     * Gets the value of the lesname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLesname() {
        return lesname;
    }

    /**
     * Sets the value of the lesname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLesname(String value) {
        this.lesname = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
