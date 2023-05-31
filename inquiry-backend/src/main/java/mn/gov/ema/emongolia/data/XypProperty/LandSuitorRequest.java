
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landSuitorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landSuitorRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://property.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suitorRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suitorType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landSuitorRequest", propOrder = {
    "appNo",
    "suitorRegister",
    "suitorType"
})
public class LandSuitorRequest
    extends ServiceRequest
{

    protected String appNo;
    protected String suitorRegister;
    protected int suitorType;

    /**
     * Gets the value of the appNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppNo() {
        return appNo;
    }

    /**
     * Sets the value of the appNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppNo(String value) {
        this.appNo = value;
    }

    /**
     * Gets the value of the suitorRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuitorRegister() {
        return suitorRegister;
    }

    /**
     * Sets the value of the suitorRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuitorRegister(String value) {
        this.suitorRegister = value;
    }

    /**
     * Gets the value of the suitorType property.
     * 
     */
    public int getSuitorType() {
        return suitorType;
    }

    /**
     * Sets the value of the suitorType property.
     * 
     */
    public void setSuitorType(int value) {
        this.suitorType = value;
    }

}
