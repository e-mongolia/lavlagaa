
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transportOrganizationCarsDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transportOrganizationCarsDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="builtDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="driverLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fueltype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isContainer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orgTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerHandphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="portId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="portName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="premissionReqStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="recUpdateUserId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="seatCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tounage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="trailerIdSecond" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="trailerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerNumberSecond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wheelPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportOrganizationCarsDetailData", propOrder = {
    "builtDate",
    "cabinNumber",
    "checkedDate",
    "color",
    "countryName",
    "createdName",
    "createdUserId",
    "driverFirstname",
    "driverId",
    "driverLastname",
    "driverRegnum",
    "expireDate",
    "fueltype",
    "importDate",
    "isContainer",
    "mark",
    "model",
    "motorNumber",
    "orgId",
    "orgName",
    "orgRegister",
    "orgTypeId",
    "orgTypeName",
    "ownerAddress",
    "ownerCountry",
    "ownerFirstname",
    "ownerHandphone",
    "ownerLastname",
    "ownerType",
    "passed",
    "portId",
    "portName",
    "premissionReqStatus",
    "recStatus",
    "recUpdateDate",
    "recUpdateUserId",
    "seatCount",
    "status",
    "tounage",
    "trailerId",
    "trailerIdSecond",
    "trailerNumber",
    "trailerNumberSecond",
    "trailerType",
    "vehicleNumber",
    "wheelPosition"
})
public class TransportOrganizationCarsDetailData {

    protected String builtDate;
    protected String cabinNumber;
    protected String checkedDate;
    protected String color;
    protected String countryName;
    protected String createdName;
    protected String createdUserId;
    protected String driverFirstname;
    protected int driverId;
    protected String driverLastname;
    protected String driverRegnum;
    protected String expireDate;
    protected String fueltype;
    protected String importDate;
    protected String isContainer;
    protected String mark;
    protected String model;
    protected String motorNumber;
    protected String orgId;
    protected String orgName;
    protected String orgRegister;
    protected int orgTypeId;
    protected String orgTypeName;
    protected String ownerAddress;
    protected String ownerCountry;
    protected String ownerFirstname;
    protected String ownerHandphone;
    protected String ownerLastname;
    protected String ownerType;
    protected boolean passed;
    protected String portId;
    protected String portName;
    protected String premissionReqStatus;
    protected String recStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recUpdateDate;
    protected int recUpdateUserId;
    protected String seatCount;
    protected String status;
    protected String tounage;
    protected int trailerId;
    protected int trailerIdSecond;
    protected String trailerNumber;
    protected String trailerNumberSecond;
    protected String trailerType;
    protected String vehicleNumber;
    protected String wheelPosition;

    /**
     * Gets the value of the builtDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuiltDate() {
        return builtDate;
    }

    /**
     * Sets the value of the builtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuiltDate(String value) {
        this.builtDate = value;
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
     * Gets the value of the checkedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckedDate() {
        return checkedDate;
    }

    /**
     * Sets the value of the checkedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckedDate(String value) {
        this.checkedDate = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
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
     * Gets the value of the createdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedName() {
        return createdName;
    }

    /**
     * Sets the value of the createdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedName(String value) {
        this.createdName = value;
    }

    /**
     * Gets the value of the createdUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * Sets the value of the createdUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedUserId(String value) {
        this.createdUserId = value;
    }

    /**
     * Gets the value of the driverFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverFirstname() {
        return driverFirstname;
    }

    /**
     * Sets the value of the driverFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverFirstname(String value) {
        this.driverFirstname = value;
    }

    /**
     * Gets the value of the driverId property.
     * 
     */
    public int getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     */
    public void setDriverId(int value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the driverLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverLastname() {
        return driverLastname;
    }

    /**
     * Sets the value of the driverLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverLastname(String value) {
        this.driverLastname = value;
    }

    /**
     * Gets the value of the driverRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverRegnum() {
        return driverRegnum;
    }

    /**
     * Sets the value of the driverRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverRegnum(String value) {
        this.driverRegnum = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
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
     * Gets the value of the importDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportDate() {
        return importDate;
    }

    /**
     * Sets the value of the importDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportDate(String value) {
        this.importDate = value;
    }

    /**
     * Gets the value of the isContainer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsContainer() {
        return isContainer;
    }

    /**
     * Sets the value of the isContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsContainer(String value) {
        this.isContainer = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMark(String value) {
        this.mark = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
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
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgId(String value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the orgRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegister() {
        return orgRegister;
    }

    /**
     * Sets the value of the orgRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegister(String value) {
        this.orgRegister = value;
    }

    /**
     * Gets the value of the orgTypeId property.
     * 
     */
    public int getOrgTypeId() {
        return orgTypeId;
    }

    /**
     * Sets the value of the orgTypeId property.
     * 
     */
    public void setOrgTypeId(int value) {
        this.orgTypeId = value;
    }

    /**
     * Gets the value of the orgTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgTypeName() {
        return orgTypeName;
    }

    /**
     * Sets the value of the orgTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgTypeName(String value) {
        this.orgTypeName = value;
    }

    /**
     * Gets the value of the ownerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAddress() {
        return ownerAddress;
    }

    /**
     * Sets the value of the ownerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAddress(String value) {
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
     * Gets the value of the passed property.
     * 
     */
    public boolean isPassed() {
        return passed;
    }

    /**
     * Sets the value of the passed property.
     * 
     */
    public void setPassed(boolean value) {
        this.passed = value;
    }

    /**
     * Gets the value of the portId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortId() {
        return portId;
    }

    /**
     * Sets the value of the portId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortId(String value) {
        this.portId = value;
    }

    /**
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortName(String value) {
        this.portName = value;
    }

    /**
     * Gets the value of the premissionReqStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremissionReqStatus() {
        return premissionReqStatus;
    }

    /**
     * Sets the value of the premissionReqStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremissionReqStatus(String value) {
        this.premissionReqStatus = value;
    }

    /**
     * Gets the value of the recStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecStatus() {
        return recStatus;
    }

    /**
     * Sets the value of the recStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecStatus(String value) {
        this.recStatus = value;
    }

    /**
     * Gets the value of the recUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecUpdateDate() {
        return recUpdateDate;
    }

    /**
     * Sets the value of the recUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecUpdateDate(XMLGregorianCalendar value) {
        this.recUpdateDate = value;
    }

    /**
     * Gets the value of the recUpdateUserId property.
     * 
     */
    public int getRecUpdateUserId() {
        return recUpdateUserId;
    }

    /**
     * Sets the value of the recUpdateUserId property.
     * 
     */
    public void setRecUpdateUserId(int value) {
        this.recUpdateUserId = value;
    }

    /**
     * Gets the value of the seatCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatCount() {
        return seatCount;
    }

    /**
     * Sets the value of the seatCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatCount(String value) {
        this.seatCount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the tounage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTounage() {
        return tounage;
    }

    /**
     * Sets the value of the tounage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTounage(String value) {
        this.tounage = value;
    }

    /**
     * Gets the value of the trailerId property.
     * 
     */
    public int getTrailerId() {
        return trailerId;
    }

    /**
     * Sets the value of the trailerId property.
     * 
     */
    public void setTrailerId(int value) {
        this.trailerId = value;
    }

    /**
     * Gets the value of the trailerIdSecond property.
     * 
     */
    public int getTrailerIdSecond() {
        return trailerIdSecond;
    }

    /**
     * Sets the value of the trailerIdSecond property.
     * 
     */
    public void setTrailerIdSecond(int value) {
        this.trailerIdSecond = value;
    }

    /**
     * Gets the value of the trailerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerNumber() {
        return trailerNumber;
    }

    /**
     * Sets the value of the trailerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerNumber(String value) {
        this.trailerNumber = value;
    }

    /**
     * Gets the value of the trailerNumberSecond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerNumberSecond() {
        return trailerNumberSecond;
    }

    /**
     * Sets the value of the trailerNumberSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerNumberSecond(String value) {
        this.trailerNumberSecond = value;
    }

    /**
     * Gets the value of the trailerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerType() {
        return trailerType;
    }

    /**
     * Sets the value of the trailerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerType(String value) {
        this.trailerType = value;
    }

    /**
     * Gets the value of the vehicleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    /**
     * Sets the value of the vehicleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleNumber(String value) {
        this.vehicleNumber = value;
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

}
