
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomsOffnsDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomsOffnsDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fineAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offnsLaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offnsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offnsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomsOffnsDetailData", propOrder = {
    "fineAmt",
    "offDesc",
    "offndDate",
    "offnsLaw",
    "offnsNumber",
    "offnsType"
})
public class GetCustomsOffnsDetailData {

    protected String fineAmt;
    protected String offDesc;
    protected String offndDate;
    protected String offnsLaw;
    protected String offnsNumber;
    protected String offnsType;

    /**
     * Gets the value of the fineAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFineAmt() {
        return fineAmt;
    }

    /**
     * Sets the value of the fineAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFineAmt(String value) {
        this.fineAmt = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffDesc(String value) {
        this.offDesc = value;
    }

    /**
     * Gets the value of the offndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffndDate() {
        return offndDate;
    }

    /**
     * Sets the value of the offndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffndDate(String value) {
        this.offndDate = value;
    }

    /**
     * Gets the value of the offnsLaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffnsLaw() {
        return offnsLaw;
    }

    /**
     * Sets the value of the offnsLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffnsLaw(String value) {
        this.offnsLaw = value;
    }

    /**
     * Gets the value of the offnsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffnsNumber() {
        return offnsNumber;
    }

    /**
     * Sets the value of the offnsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffnsNumber(String value) {
        this.offnsNumber = value;
    }

    /**
     * Gets the value of the offnsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffnsType() {
        return offnsType;
    }

    /**
     * Sets the value of the offnsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffnsType(String value) {
        this.offnsType = value;
    }

}
