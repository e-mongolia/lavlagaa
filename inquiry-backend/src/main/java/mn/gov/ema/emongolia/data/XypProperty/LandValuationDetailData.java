
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landValuationDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landValuationDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaM2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auctionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="basePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="basePriceM2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landuseTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="levelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="levelNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="levelType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="levelTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landValuationDetailData", propOrder = {
    "areaM2",
    "auctionAmount",
    "basePrice",
    "basePriceM2",
    "confidence",
    "discountPercent",
    "landuseTypeCode",
    "levelName",
    "levelNo",
    "levelType",
    "levelTypeName"
})
public class LandValuationDetailData {

    protected String areaM2;
    protected String auctionAmount;
    protected String basePrice;
    protected String basePriceM2;
    protected String confidence;
    protected String discountPercent;
    protected int landuseTypeCode;
    protected String levelName;
    protected int levelNo;
    protected int levelType;
    protected String levelTypeName;

    /**
     * Gets the value of the areaM2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaM2() {
        return areaM2;
    }

    /**
     * Sets the value of the areaM2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaM2(String value) {
        this.areaM2 = value;
    }

    /**
     * Gets the value of the auctionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuctionAmount() {
        return auctionAmount;
    }

    /**
     * Sets the value of the auctionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuctionAmount(String value) {
        this.auctionAmount = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the basePriceM2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePriceM2() {
        return basePriceM2;
    }

    /**
     * Sets the value of the basePriceM2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePriceM2(String value) {
        this.basePriceM2 = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidence(String value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercent(String value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the landuseTypeCode property.
     * 
     */
    public int getLanduseTypeCode() {
        return landuseTypeCode;
    }

    /**
     * Sets the value of the landuseTypeCode property.
     * 
     */
    public void setLanduseTypeCode(int value) {
        this.landuseTypeCode = value;
    }

    /**
     * Gets the value of the levelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * Sets the value of the levelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelName(String value) {
        this.levelName = value;
    }

    /**
     * Gets the value of the levelNo property.
     * 
     */
    public int getLevelNo() {
        return levelNo;
    }

    /**
     * Sets the value of the levelNo property.
     * 
     */
    public void setLevelNo(int value) {
        this.levelNo = value;
    }

    /**
     * Gets the value of the levelType property.
     * 
     */
    public int getLevelType() {
        return levelType;
    }

    /**
     * Sets the value of the levelType property.
     * 
     */
    public void setLevelType(int value) {
        this.levelType = value;
    }

    /**
     * Gets the value of the levelTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelTypeName() {
        return levelTypeName;
    }

    /**
     * Sets the value of the levelTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelTypeName(String value) {
        this.levelTypeName = value;
    }

}
