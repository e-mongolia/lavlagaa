
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for privateTaxPayerDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="privateTaxPayerDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="econEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="econTpenSoffCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="econTpenSoffOffCo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="econTren" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rnum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "privateTaxPayerDetail", propOrder = {
    "econEntityName",
    "econTpenSoffCode",
    "econTpenSoffOffCo",
    "econTren",
    "rnum",
    "typeName"
})
public class PrivateTaxPayerDetail {

    protected String econEntityName;
    protected int econTpenSoffCode;
    protected int econTpenSoffOffCo;
    protected String econTren;
    protected int rnum;
    protected String typeName;

    /**
     * Gets the value of the econEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconEntityName() {
        return econEntityName;
    }

    /**
     * Sets the value of the econEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconEntityName(String value) {
        this.econEntityName = value;
    }

    /**
     * Gets the value of the econTpenSoffCode property.
     * 
     */
    public int getEconTpenSoffCode() {
        return econTpenSoffCode;
    }

    /**
     * Sets the value of the econTpenSoffCode property.
     * 
     */
    public void setEconTpenSoffCode(int value) {
        this.econTpenSoffCode = value;
    }

    /**
     * Gets the value of the econTpenSoffOffCo property.
     * 
     */
    public int getEconTpenSoffOffCo() {
        return econTpenSoffOffCo;
    }

    /**
     * Sets the value of the econTpenSoffOffCo property.
     * 
     */
    public void setEconTpenSoffOffCo(int value) {
        this.econTpenSoffOffCo = value;
    }

    /**
     * Gets the value of the econTren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconTren() {
        return econTren;
    }

    /**
     * Sets the value of the econTren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconTren(String value) {
        this.econTren = value;
    }

    /**
     * Gets the value of the rnum property.
     * 
     */
    public int getRnum() {
        return rnum;
    }

    /**
     * Sets the value of the rnum property.
     * 
     */
    public void setRnum(int value) {
        this.rnum = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

}
