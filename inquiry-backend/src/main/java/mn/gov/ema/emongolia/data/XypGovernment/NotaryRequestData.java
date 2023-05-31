
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notaryRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notaryRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regNumberA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regNumberB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vinCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notaryRequestData", propOrder = {
    "offset",
    "pageSize",
    "regNumberA",
    "regNumberB",
    "vinCode"
})
public class NotaryRequestData {

    protected String offset;
    protected String pageSize;
    protected String regNumberA;
    protected String regNumberB;
    protected String vinCode;

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageSize(String value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the regNumberA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumberA() {
        return regNumberA;
    }

    /**
     * Sets the value of the regNumberA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumberA(String value) {
        this.regNumberA = value;
    }

    /**
     * Gets the value of the regNumberB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumberB() {
        return regNumberB;
    }

    /**
     * Sets the value of the regNumberB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumberB(String value) {
        this.regNumberB = value;
    }

    /**
     * Gets the value of the vinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinCode() {
        return vinCode;
    }

    /**
     * Sets the value of the vinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinCode(String value) {
        this.vinCode = value;
    }

}
