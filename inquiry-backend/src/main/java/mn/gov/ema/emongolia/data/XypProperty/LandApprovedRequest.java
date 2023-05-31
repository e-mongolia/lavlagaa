
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landApprovedRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landApprovedRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landApprovedRequest", propOrder = {
    "appNo",
    "parcelId"
})
public class LandApprovedRequest {

    protected String appNo;
    protected String parcelId;

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
     * Gets the value of the parcelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelId() {
        return parcelId;
    }

    /**
     * Sets the value of the parcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelId(String value) {
        this.parcelId = value;
    }

}
