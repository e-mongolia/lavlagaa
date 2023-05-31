
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityLiquidationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityLiquidationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indutyTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lesNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sttemntDe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sttemntInstt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityLiquidationData", propOrder = {
    "companyTitle",
    "indutyCode",
    "indutyTitle",
    "lesNumber",
    "regDate",
    "sttemntDe",
    "sttemntInstt"
})
public class LegalEntityLiquidationData {

    protected String companyTitle;
    protected String indutyCode;
    protected String indutyTitle;
    protected int lesNumber;
    protected String regDate;
    protected String sttemntDe;
    protected String sttemntInstt;

    /**
     * Gets the value of the companyTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyTitle() {
        return companyTitle;
    }

    /**
     * Sets the value of the companyTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyTitle(String value) {
        this.companyTitle = value;
    }

    /**
     * Gets the value of the indutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndutyCode() {
        return indutyCode;
    }

    /**
     * Sets the value of the indutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndutyCode(String value) {
        this.indutyCode = value;
    }

    /**
     * Gets the value of the indutyTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndutyTitle() {
        return indutyTitle;
    }

    /**
     * Sets the value of the indutyTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndutyTitle(String value) {
        this.indutyTitle = value;
    }

    /**
     * Gets the value of the lesNumber property.
     * 
     */
    public int getLesNumber() {
        return lesNumber;
    }

    /**
     * Sets the value of the lesNumber property.
     * 
     */
    public void setLesNumber(int value) {
        this.lesNumber = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the sttemntDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttemntDe() {
        return sttemntDe;
    }

    /**
     * Sets the value of the sttemntDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttemntDe(String value) {
        this.sttemntDe = value;
    }

    /**
     * Gets the value of the sttemntInstt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttemntInstt() {
        return sttemntInstt;
    }

    /**
     * Sets the value of the sttemntInstt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttemntInstt(String value) {
        this.sttemntInstt = value;
    }

}
