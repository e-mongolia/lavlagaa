
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityIndustryDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityIndustryDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="industryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="industryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="industryNameDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="patentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityIndustryDetailData", propOrder = {
    "industryCode",
    "industryName",
    "industryNameDesc",
    "isLicense",
    "patentId"
})
public class LegalEntityIndustryDetailData {

    protected String industryCode;
    protected String industryName;
    protected String industryNameDesc;
    protected String isLicense;
    protected String patentId;

    /**
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCode(String value) {
        this.industryCode = value;
    }

    /**
     * Gets the value of the industryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryName() {
        return industryName;
    }

    /**
     * Sets the value of the industryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryName(String value) {
        this.industryName = value;
    }

    /**
     * Gets the value of the industryNameDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryNameDesc() {
        return industryNameDesc;
    }

    /**
     * Sets the value of the industryNameDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryNameDesc(String value) {
        this.industryNameDesc = value;
    }

    /**
     * Gets the value of the isLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLicense() {
        return isLicense;
    }

    /**
     * Sets the value of the isLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLicense(String value) {
        this.isLicense = value;
    }

    /**
     * Gets the value of the patentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatentId() {
        return patentId;
    }

    /**
     * Sets the value of the patentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatentId(String value) {
        this.patentId = value;
    }

}
