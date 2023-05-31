
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getItemExpandDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItemExpandDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="downloadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hsItemTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hsItemTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hsQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hsQtyUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importExportFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemDedication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemExpandDetailData", propOrder = {
    "downloadDate",
    "hsItemTypeId",
    "hsItemTypeName",
    "hsQty",
    "hsQtyUnit",
    "importExportFlag",
    "itemDedication",
    "itemModel",
    "itemName",
    "measure",
    "month",
    "statDate",
    "value",
    "year"
})
public class GetItemExpandDetailData {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar downloadDate;
    protected String hsItemTypeId;
    protected String hsItemTypeName;
    protected String hsQty;
    protected String hsQtyUnit;
    protected String importExportFlag;
    protected String itemDedication;
    protected String itemModel;
    protected String itemName;
    protected String measure;
    protected String month;
    protected String statDate;
    protected String value;
    protected String year;

    /**
     * Gets the value of the downloadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDownloadDate() {
        return downloadDate;
    }

    /**
     * Sets the value of the downloadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDownloadDate(XMLGregorianCalendar value) {
        this.downloadDate = value;
    }

    /**
     * Gets the value of the hsItemTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsItemTypeId() {
        return hsItemTypeId;
    }

    /**
     * Sets the value of the hsItemTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsItemTypeId(String value) {
        this.hsItemTypeId = value;
    }

    /**
     * Gets the value of the hsItemTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsItemTypeName() {
        return hsItemTypeName;
    }

    /**
     * Sets the value of the hsItemTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsItemTypeName(String value) {
        this.hsItemTypeName = value;
    }

    /**
     * Gets the value of the hsQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsQty() {
        return hsQty;
    }

    /**
     * Sets the value of the hsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsQty(String value) {
        this.hsQty = value;
    }

    /**
     * Gets the value of the hsQtyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsQtyUnit() {
        return hsQtyUnit;
    }

    /**
     * Sets the value of the hsQtyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsQtyUnit(String value) {
        this.hsQtyUnit = value;
    }

    /**
     * Gets the value of the importExportFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportExportFlag() {
        return importExportFlag;
    }

    /**
     * Sets the value of the importExportFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportExportFlag(String value) {
        this.importExportFlag = value;
    }

    /**
     * Gets the value of the itemDedication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDedication() {
        return itemDedication;
    }

    /**
     * Sets the value of the itemDedication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDedication(String value) {
        this.itemDedication = value;
    }

    /**
     * Gets the value of the itemModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemModel() {
        return itemModel;
    }

    /**
     * Sets the value of the itemModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemModel(String value) {
        this.itemModel = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasure(String value) {
        this.measure = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the statDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatDate() {
        return statDate;
    }

    /**
     * Sets the value of the statDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatDate(String value) {
        this.statDate = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

}
