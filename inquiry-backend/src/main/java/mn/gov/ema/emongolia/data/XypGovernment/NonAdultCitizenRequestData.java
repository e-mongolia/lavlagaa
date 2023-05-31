
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nonAdultCitizenRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nonAdultCitizenRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://government.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childrenRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="momRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nonAdultCitizenRequestData", propOrder = {
    "childrenRegnum",
    "momRegnum"
})
public class NonAdultCitizenRequestData
    extends ServiceRequest
{

    protected String childrenRegnum;
    protected String momRegnum;

    /**
     * Gets the value of the childrenRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildrenRegnum() {
        return childrenRegnum;
    }

    /**
     * Sets the value of the childrenRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildrenRegnum(String value) {
        this.childrenRegnum = value;
    }

    /**
     * Gets the value of the momRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomRegnum() {
        return momRegnum;
    }

    /**
     * Sets the value of the momRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomRegnum(String value) {
        this.momRegnum = value;
    }

}
