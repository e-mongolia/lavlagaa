
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landCadastreQRData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landCadastreQRData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stringQr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landCadastreQRData", propOrder = {
    "stringQr"
})
public class LandCadastreQRData {

    protected String stringQr;

    /**
     * Gets the value of the stringQr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringQr() {
        return stringQr;
    }

    /**
     * Sets the value of the stringQr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringQr(String value) {
        this.stringQr = value;
    }

}
