
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vehicleLegalEntityInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleLegalEntityInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="archiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="archiveFirstNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="archiveNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="axleCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="buildYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="certificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="colorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="declarationNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fueltype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="holderAddress" type="{http://transport.xyp.gov.mn/}addressData" minOccurs="0"/&gt;
 *         &lt;element name="holderCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holderDevisionUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holderFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holderHandphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holderHomephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holderLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holderRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holderWorkphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="inspAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inspVat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="manCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="markName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mass" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerApartmentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerCellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerDevisionUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerDoorNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerMicroDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purposeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purposeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rfidTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transmission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vehicleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="wheelPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleLegalEntityInfoDetailData", propOrder = {
    "archiveDate",
    "archiveFirstNumber",
    "archiveNumber",
    "axleCount",
    "buildYear",
    "cabinNumber",
    "capacity",
    "certificateNumber",
    "className",
    "colorName",
    "countryName",
    "declarationNum",
    "fueltype",
    "height",
    "holderAddress",
    "holderCountry",
    "holderDevisionUnitName",
    "holderFirstname",
    "holderHandphone",
    "holderHomephone",
    "holderId",
    "holderLastname",
    "holderRegnum",
    "holderType",
    "holderWorkphone",
    "importDate",
    "inspAmount",
    "inspVat",
    "intent",
    "length",
    "manCount",
    "markName",
    "mass",
    "modelName",
    "modificaceName",
    "motorNumber",
    "ownerApartmentNo",
    "ownerCellPhone",
    "ownerCountry",
    "ownerDevisionUnitName",
    "ownerDistrict",
    "ownerDoorNo",
    "ownerFirstName",
    "ownerHomePhone",
    "ownerLastName",
    "ownerMicroDistrictName",
    "ownerProvince",
    "ownerRegnum",
    "ownerStreet",
    "ownerTypeName",
    "ownerWorkPhone",
    "plateNumber",
    "purposeId",
    "purposeName",
    "rfidTag",
    "startDate",
    "transmission",
    "type",
    "typeId",
    "vehicleId",
    "weight",
    "wheelPosition",
    "width"
})
public class VehicleLegalEntityInfoDetailData {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar archiveDate;
    protected String archiveFirstNumber;
    protected String archiveNumber;
    protected int axleCount;
    protected int buildYear;
    protected String cabinNumber;
    protected float capacity;
    protected String certificateNumber;
    protected String className;
    protected String colorName;
    protected String countryName;
    protected String declarationNum;
    protected String fueltype;
    protected float height;
    protected AddressData holderAddress;
    protected String holderCountry;
    protected String holderDevisionUnitName;
    protected String holderFirstname;
    protected String holderHandphone;
    protected String holderHomephone;
    protected String holderId;
    protected String holderLastname;
    protected String holderRegnum;
    protected String holderType;
    protected String holderWorkphone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar importDate;
    protected String inspAmount;
    protected String inspVat;
    protected String intent;
    protected float length;
    protected int manCount;
    protected String markName;
    protected float mass;
    protected String modelName;
    protected String modificaceName;
    protected String motorNumber;
    protected String ownerApartmentNo;
    protected String ownerCellPhone;
    protected String ownerCountry;
    protected String ownerDevisionUnitName;
    protected String ownerDistrict;
    protected String ownerDoorNo;
    protected String ownerFirstName;
    protected String ownerHomePhone;
    protected String ownerLastName;
    protected String ownerMicroDistrictName;
    protected String ownerProvince;
    protected String ownerRegnum;
    protected String ownerStreet;
    protected String ownerTypeName;
    protected String ownerWorkPhone;
    protected String plateNumber;
    protected String purposeId;
    protected String purposeName;
    protected String rfidTag;
    protected String startDate;
    protected String transmission;
    protected String type;
    protected int typeId;
    protected String vehicleId;
    protected float weight;
    protected String wheelPosition;
    protected float width;

    /**
     * Gets the value of the archiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveDate() {
        return archiveDate;
    }

    /**
     * Sets the value of the archiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArchiveDate(XMLGregorianCalendar value) {
        this.archiveDate = value;
    }

    /**
     * Gets the value of the archiveFirstNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveFirstNumber() {
        return archiveFirstNumber;
    }

    /**
     * Sets the value of the archiveFirstNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveFirstNumber(String value) {
        this.archiveFirstNumber = value;
    }

    /**
     * Gets the value of the archiveNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveNumber() {
        return archiveNumber;
    }

    /**
     * Sets the value of the archiveNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveNumber(String value) {
        this.archiveNumber = value;
    }

    /**
     * Gets the value of the axleCount property.
     * 
     */
    public int getAxleCount() {
        return axleCount;
    }

    /**
     * Sets the value of the axleCount property.
     * 
     */
    public void setAxleCount(int value) {
        this.axleCount = value;
    }

    /**
     * Gets the value of the buildYear property.
     * 
     */
    public int getBuildYear() {
        return buildYear;
    }

    /**
     * Sets the value of the buildYear property.
     * 
     */
    public void setBuildYear(int value) {
        this.buildYear = value;
    }

    /**
     * Gets the value of the cabinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinNumber() {
        return cabinNumber;
    }

    /**
     * Sets the value of the cabinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinNumber(String value) {
        this.cabinNumber = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     */
    public float getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(float value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the declarationNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationNum() {
        return declarationNum;
    }

    /**
     * Sets the value of the declarationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationNum(String value) {
        this.declarationNum = value;
    }

    /**
     * Gets the value of the fueltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFueltype() {
        return fueltype;
    }

    /**
     * Sets the value of the fueltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFueltype(String value) {
        this.fueltype = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(float value) {
        this.height = value;
    }

    /**
     * Gets the value of the holderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressData }
     *     
     */
    public AddressData getHolderAddress() {
        return holderAddress;
    }

    /**
     * Sets the value of the holderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressData }
     *     
     */
    public void setHolderAddress(AddressData value) {
        this.holderAddress = value;
    }

    /**
     * Gets the value of the holderCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderCountry() {
        return holderCountry;
    }

    /**
     * Sets the value of the holderCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderCountry(String value) {
        this.holderCountry = value;
    }

    /**
     * Gets the value of the holderDevisionUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderDevisionUnitName() {
        return holderDevisionUnitName;
    }

    /**
     * Sets the value of the holderDevisionUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderDevisionUnitName(String value) {
        this.holderDevisionUnitName = value;
    }

    /**
     * Gets the value of the holderFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderFirstname() {
        return holderFirstname;
    }

    /**
     * Sets the value of the holderFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderFirstname(String value) {
        this.holderFirstname = value;
    }

    /**
     * Gets the value of the holderHandphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderHandphone() {
        return holderHandphone;
    }

    /**
     * Sets the value of the holderHandphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderHandphone(String value) {
        this.holderHandphone = value;
    }

    /**
     * Gets the value of the holderHomephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderHomephone() {
        return holderHomephone;
    }

    /**
     * Sets the value of the holderHomephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderHomephone(String value) {
        this.holderHomephone = value;
    }

    /**
     * Gets the value of the holderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderId() {
        return holderId;
    }

    /**
     * Sets the value of the holderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderId(String value) {
        this.holderId = value;
    }

    /**
     * Gets the value of the holderLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderLastname() {
        return holderLastname;
    }

    /**
     * Sets the value of the holderLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderLastname(String value) {
        this.holderLastname = value;
    }

    /**
     * Gets the value of the holderRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderRegnum() {
        return holderRegnum;
    }

    /**
     * Sets the value of the holderRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderRegnum(String value) {
        this.holderRegnum = value;
    }

    /**
     * Gets the value of the holderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderType() {
        return holderType;
    }

    /**
     * Sets the value of the holderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderType(String value) {
        this.holderType = value;
    }

    /**
     * Gets the value of the holderWorkphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderWorkphone() {
        return holderWorkphone;
    }

    /**
     * Sets the value of the holderWorkphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderWorkphone(String value) {
        this.holderWorkphone = value;
    }

    /**
     * Gets the value of the importDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImportDate() {
        return importDate;
    }

    /**
     * Sets the value of the importDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImportDate(XMLGregorianCalendar value) {
        this.importDate = value;
    }

    /**
     * Gets the value of the inspAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspAmount() {
        return inspAmount;
    }

    /**
     * Sets the value of the inspAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspAmount(String value) {
        this.inspAmount = value;
    }

    /**
     * Gets the value of the inspVat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspVat() {
        return inspVat;
    }

    /**
     * Sets the value of the inspVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspVat(String value) {
        this.inspVat = value;
    }

    /**
     * Gets the value of the intent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntent() {
        return intent;
    }

    /**
     * Sets the value of the intent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntent(String value) {
        this.intent = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public float getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(float value) {
        this.length = value;
    }

    /**
     * Gets the value of the manCount property.
     * 
     */
    public int getManCount() {
        return manCount;
    }

    /**
     * Sets the value of the manCount property.
     * 
     */
    public void setManCount(int value) {
        this.manCount = value;
    }

    /**
     * Gets the value of the markName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkName() {
        return markName;
    }

    /**
     * Sets the value of the markName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkName(String value) {
        this.markName = value;
    }

    /**
     * Gets the value of the mass property.
     * 
     */
    public float getMass() {
        return mass;
    }

    /**
     * Sets the value of the mass property.
     * 
     */
    public void setMass(float value) {
        this.mass = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the modificaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificaceName() {
        return modificaceName;
    }

    /**
     * Sets the value of the modificaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificaceName(String value) {
        this.modificaceName = value;
    }

    /**
     * Gets the value of the motorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotorNumber() {
        return motorNumber;
    }

    /**
     * Sets the value of the motorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotorNumber(String value) {
        this.motorNumber = value;
    }

    /**
     * Gets the value of the ownerApartmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerApartmentNo() {
        return ownerApartmentNo;
    }

    /**
     * Sets the value of the ownerApartmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerApartmentNo(String value) {
        this.ownerApartmentNo = value;
    }

    /**
     * Gets the value of the ownerCellPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCellPhone() {
        return ownerCellPhone;
    }

    /**
     * Sets the value of the ownerCellPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCellPhone(String value) {
        this.ownerCellPhone = value;
    }

    /**
     * Gets the value of the ownerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCountry() {
        return ownerCountry;
    }

    /**
     * Sets the value of the ownerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCountry(String value) {
        this.ownerCountry = value;
    }

    /**
     * Gets the value of the ownerDevisionUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerDevisionUnitName() {
        return ownerDevisionUnitName;
    }

    /**
     * Sets the value of the ownerDevisionUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerDevisionUnitName(String value) {
        this.ownerDevisionUnitName = value;
    }

    /**
     * Gets the value of the ownerDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerDistrict() {
        return ownerDistrict;
    }

    /**
     * Sets the value of the ownerDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerDistrict(String value) {
        this.ownerDistrict = value;
    }

    /**
     * Gets the value of the ownerDoorNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerDoorNo() {
        return ownerDoorNo;
    }

    /**
     * Sets the value of the ownerDoorNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerDoorNo(String value) {
        this.ownerDoorNo = value;
    }

    /**
     * Gets the value of the ownerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    /**
     * Sets the value of the ownerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerFirstName(String value) {
        this.ownerFirstName = value;
    }

    /**
     * Gets the value of the ownerHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerHomePhone() {
        return ownerHomePhone;
    }

    /**
     * Sets the value of the ownerHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerHomePhone(String value) {
        this.ownerHomePhone = value;
    }

    /**
     * Gets the value of the ownerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerLastName() {
        return ownerLastName;
    }

    /**
     * Sets the value of the ownerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerLastName(String value) {
        this.ownerLastName = value;
    }

    /**
     * Gets the value of the ownerMicroDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerMicroDistrictName() {
        return ownerMicroDistrictName;
    }

    /**
     * Sets the value of the ownerMicroDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerMicroDistrictName(String value) {
        this.ownerMicroDistrictName = value;
    }

    /**
     * Gets the value of the ownerProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerProvince() {
        return ownerProvince;
    }

    /**
     * Sets the value of the ownerProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerProvince(String value) {
        this.ownerProvince = value;
    }

    /**
     * Gets the value of the ownerRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerRegnum() {
        return ownerRegnum;
    }

    /**
     * Sets the value of the ownerRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerRegnum(String value) {
        this.ownerRegnum = value;
    }

    /**
     * Gets the value of the ownerStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerStreet() {
        return ownerStreet;
    }

    /**
     * Sets the value of the ownerStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerStreet(String value) {
        this.ownerStreet = value;
    }

    /**
     * Gets the value of the ownerTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerTypeName() {
        return ownerTypeName;
    }

    /**
     * Sets the value of the ownerTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerTypeName(String value) {
        this.ownerTypeName = value;
    }

    /**
     * Gets the value of the ownerWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerWorkPhone() {
        return ownerWorkPhone;
    }

    /**
     * Sets the value of the ownerWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerWorkPhone(String value) {
        this.ownerWorkPhone = value;
    }

    /**
     * Gets the value of the plateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * Sets the value of the plateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNumber(String value) {
        this.plateNumber = value;
    }

    /**
     * Gets the value of the purposeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeId() {
        return purposeId;
    }

    /**
     * Sets the value of the purposeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeId(String value) {
        this.purposeId = value;
    }

    /**
     * Gets the value of the purposeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeName() {
        return purposeName;
    }

    /**
     * Sets the value of the purposeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeName(String value) {
        this.purposeName = value;
    }

    /**
     * Gets the value of the rfidTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfidTag() {
        return rfidTag;
    }

    /**
     * Sets the value of the rfidTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfidTag(String value) {
        this.rfidTag = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the transmission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmission() {
        return transmission;
    }

    /**
     * Sets the value of the transmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmission(String value) {
        this.transmission = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(int value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleId(String value) {
        this.vehicleId = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the wheelPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWheelPosition() {
        return wheelPosition;
    }

    /**
     * Sets the value of the wheelPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWheelPosition(String value) {
        this.wheelPosition = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(float value) {
        this.width = value;
    }

}
