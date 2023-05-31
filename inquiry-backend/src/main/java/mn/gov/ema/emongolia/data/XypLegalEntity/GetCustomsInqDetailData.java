
package mn.gov.ema.emongolia.data.XypLegalEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomsInqDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomsInqDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="customAMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dclrDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dclrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dclrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exciseAMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="formulaAMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="goodsMakeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goodsModelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hsQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="hscd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inquiryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statValueMNT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="statValueUSD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalAMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vatAMT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomsInqDetailData", propOrder = {
    "commission",
    "customAMT",
    "dclrDate",
    "dclrNumber",
    "dclrType",
    "exciseAMT",
    "formulaAMT",
    "goodsMakeYear",
    "goodsModelNumber",
    "goodsName",
    "hsQTY",
    "hscd",
    "inquiryNumber",
    "itemNumber",
    "originCenter",
    "statValueMNT",
    "statValueUSD",
    "totalAMT",
    "unit",
    "vatAMT"
})
public class GetCustomsInqDetailData {

    protected Double commission;
    protected Double customAMT;
    protected String dclrDate;
    protected String dclrNumber;
    protected String dclrType;
    protected Double exciseAMT;
    protected Double formulaAMT;
    protected String goodsMakeYear;
    protected String goodsModelNumber;
    protected String goodsName;
    protected Double hsQTY;
    protected String hscd;
    protected String inquiryNumber;
    protected String itemNumber;
    protected String originCenter;
    protected Double statValueMNT;
    protected Double statValueUSD;
    protected Double totalAMT;
    protected String unit;
    protected Double vatAMT;

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCommission(Double value) {
        this.commission = value;
    }

    /**
     * Gets the value of the customAMT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomAMT() {
        return customAMT;
    }

    /**
     * Sets the value of the customAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomAMT(Double value) {
        this.customAMT = value;
    }

    /**
     * Gets the value of the dclrDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrDate() {
        return dclrDate;
    }

    /**
     * Sets the value of the dclrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclrDate(String value) {
        this.dclrDate = value;
    }

    /**
     * Gets the value of the dclrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrNumber() {
        return dclrNumber;
    }

    /**
     * Sets the value of the dclrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclrNumber(String value) {
        this.dclrNumber = value;
    }

    /**
     * Gets the value of the dclrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrType() {
        return dclrType;
    }

    /**
     * Sets the value of the dclrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclrType(String value) {
        this.dclrType = value;
    }

    /**
     * Gets the value of the exciseAMT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExciseAMT() {
        return exciseAMT;
    }

    /**
     * Sets the value of the exciseAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExciseAMT(Double value) {
        this.exciseAMT = value;
    }

    /**
     * Gets the value of the formulaAMT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFormulaAMT() {
        return formulaAMT;
    }

    /**
     * Sets the value of the formulaAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFormulaAMT(Double value) {
        this.formulaAMT = value;
    }

    /**
     * Gets the value of the goodsMakeYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsMakeYear() {
        return goodsMakeYear;
    }

    /**
     * Sets the value of the goodsMakeYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsMakeYear(String value) {
        this.goodsMakeYear = value;
    }

    /**
     * Gets the value of the goodsModelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsModelNumber() {
        return goodsModelNumber;
    }

    /**
     * Sets the value of the goodsModelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsModelNumber(String value) {
        this.goodsModelNumber = value;
    }

    /**
     * Gets the value of the goodsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * Sets the value of the goodsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsName(String value) {
        this.goodsName = value;
    }

    /**
     * Gets the value of the hsQTY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHsQTY() {
        return hsQTY;
    }

    /**
     * Sets the value of the hsQTY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHsQTY(Double value) {
        this.hsQTY = value;
    }

    /**
     * Gets the value of the hscd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHscd() {
        return hscd;
    }

    /**
     * Sets the value of the hscd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHscd(String value) {
        this.hscd = value;
    }

    /**
     * Gets the value of the inquiryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryNumber() {
        return inquiryNumber;
    }

    /**
     * Sets the value of the inquiryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryNumber(String value) {
        this.inquiryNumber = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the originCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCenter() {
        return originCenter;
    }

    /**
     * Sets the value of the originCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCenter(String value) {
        this.originCenter = value;
    }

    /**
     * Gets the value of the statValueMNT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStatValueMNT() {
        return statValueMNT;
    }

    /**
     * Sets the value of the statValueMNT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStatValueMNT(Double value) {
        this.statValueMNT = value;
    }

    /**
     * Gets the value of the statValueUSD property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStatValueUSD() {
        return statValueUSD;
    }

    /**
     * Sets the value of the statValueUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStatValueUSD(Double value) {
        this.statValueUSD = value;
    }

    /**
     * Gets the value of the totalAMT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAMT() {
        return totalAMT;
    }

    /**
     * Sets the value of the totalAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAMT(Double value) {
        this.totalAMT = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the vatAMT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVatAMT() {
        return vatAMT;
    }

    /**
     * Sets the value of the vatAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVatAMT(Double value) {
        this.vatAMT = value;
    }

}
