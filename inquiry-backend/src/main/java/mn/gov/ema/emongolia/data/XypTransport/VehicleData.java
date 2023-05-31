
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vehicleData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleData"&gt;
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
 *         &lt;element name="fueltype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="importDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="intent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="manCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="markName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mass" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerAddress" type="{http://transport.xyp.gov.mn/}addressData" minOccurs="0"/&gt;
 *         &lt;element name="ownerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerHandphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerHomephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerWorkphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transmission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "vehicleData", propOrder = {
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
    "fueltype",
    "height",
    "importDate",
    "intent",
    "length",
    "manCount",
    "markName",
    "mass",
    "modelName",
    "motorNumber",
    "ownerAddress",
    "ownerCountry",
    "ownerFirstname",
    "ownerHandphone",
    "ownerHomephone",
    "ownerLastname",
    "ownerRegnum",
    "ownerType",
    "ownerWorkphone",
    "plateNumber",
    "transmission",
    "type",
    "typeId",
    "weight",
    "wheelPosition",
    "width"
})
public class VehicleData {

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
    protected String fueltype;
    protected float height;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar importDate;
    protected String intent;
    protected float length;
    protected int manCount;
    protected String markName;
    protected float mass;
    protected String modelName;
    protected String motorNumber;
    protected AddressData ownerAddress;
    protected String ownerCountry;
    protected String ownerFirstname;
    protected String ownerHandphone;
    protected String ownerHomephone;
    protected String ownerLastname;
    protected String ownerRegnum;
    protected String ownerType;
    protected String ownerWorkphone;
    protected String plateNumber;
    protected String transmission;
    protected String type;
    protected int typeId;
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
     * Gets the value of the ownerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressData }
     *     
     */
    public AddressData getOwnerAddress() {
        return ownerAddress;
    }

    /**
     * Sets the value of the ownerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressData }
     *     
     */
    public void setOwnerAddress(AddressData value) {
        this.ownerAddress = value;
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
     * Gets the value of the ownerFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerFirstname() {
        return ownerFirstname;
    }

    /**
     * Sets the value of the ownerFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerFirstname(String value) {
        this.ownerFirstname = value;
    }

    /**
     * Gets the value of the ownerHandphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerHandphone() {
        return ownerHandphone;
    }

    /**
     * Sets the value of the ownerHandphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerHandphone(String value) {
        this.ownerHandphone = value;
    }

    /**
     * Gets the value of the ownerHomephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerHomephone() {
        return ownerHomephone;
    }

    /**
     * Sets the value of the ownerHomephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerHomephone(String value) {
        this.ownerHomephone = value;
    }

    /**
     * Gets the value of the ownerLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerLastname() {
        return ownerLastname;
    }

    /**
     * Sets the value of the ownerLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerLastname(String value) {
        this.ownerLastname = value;
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
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerType(String value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the ownerWorkphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerWorkphone() {
        return ownerWorkphone;
    }

    /**
     * Sets the value of the ownerWorkphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerWorkphone(String value) {
        this.ownerWorkphone = value;
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
