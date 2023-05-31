
package mn.gov.ema.emongolia.data.XypTransport;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permittedVehiclesListDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="permittedVehiclesListDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="avaible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boomt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boomtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="builtDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carError" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="checkedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkinsRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkinsSetRegisterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkinsSetRegisterUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdUserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="daats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverError" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="driverExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverProfessionalExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fueltype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="importDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isContainer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPassed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ishave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organizationError" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="orgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgregister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgtypeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgtypename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerAddress" type="{http://transport.xyp.gov.mn/}permittedVehiclesAddressData" minOccurs="0"/&gt;
 *         &lt;element name="ownerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerHandphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="premissionReqStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recCreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recCreateUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recDeleteDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recDeleteUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recUpdateUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestError" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="seatCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerError" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trailerExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehiclenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wheelPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fTConflictError" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nDError" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permittedVehiclesListDetailData", propOrder = {
    "avaible",
    "boomt",
    "boomtId",
    "builtDate",
    "cabinNumber",
    "carError",
    "checkedDate",
    "checkinsRegister",
    "checkinsSetRegisterDate",
    "checkinsSetRegisterUserId",
    "color",
    "comment",
    "countryName",
    "createdName",
    "createdUserid",
    "daats",
    "driverError",
    "driverExpireDate",
    "driverFirstname",
    "driverId",
    "driverLastname",
    "driverProfessionalExpireDate",
    "driverRegister",
    "expireDate",
    "fueltype",
    "id",
    "importDate",
    "isContainer",
    "isPassed",
    "ishave",
    "mark",
    "model",
    "motorNumber",
    "oldId",
    "organizationError",
    "orgid",
    "orgname",
    "orgregister",
    "orgtypeid",
    "orgtypename",
    "ownerAddress",
    "ownerCountry",
    "ownerFirstname",
    "ownerHandphone",
    "ownerLastname",
    "ownerType",
    "premissionReqStatus",
    "recCreateDate",
    "recCreateUserId",
    "recDeleteDate",
    "recDeleteUserId",
    "recStatus",
    "recUpdateDate",
    "recUpdateUserId",
    "requestError",
    "seatCount",
    "trailerError",
    "trailerExpireDate",
    "trailerId",
    "trailerId2",
    "trailerNumber",
    "trailerNumber2",
    "trailerType",
    "vehiclenumber",
    "wheelPosition",
    "ftConflictError",
    "ndError"
})
public class PermittedVehiclesListDetailData {

    protected String avaible;
    protected String boomt;
    protected String boomtId;
    protected String builtDate;
    protected String cabinNumber;
    @XmlElement(nillable = true)
    protected List<String> carError;
    protected String checkedDate;
    protected String checkinsRegister;
    protected String checkinsSetRegisterDate;
    protected String checkinsSetRegisterUserId;
    protected String color;
    protected String comment;
    protected String countryName;
    protected String createdName;
    protected String createdUserid;
    protected String daats;
    @XmlElement(nillable = true)
    protected List<String> driverError;
    protected String driverExpireDate;
    protected String driverFirstname;
    protected String driverId;
    protected String driverLastname;
    protected String driverProfessionalExpireDate;
    protected String driverRegister;
    protected String expireDate;
    protected String fueltype;
    protected int id;
    protected String importDate;
    protected String isContainer;
    protected String isPassed;
    protected String ishave;
    protected String mark;
    protected String model;
    protected String motorNumber;
    protected String oldId;
    @XmlElement(nillable = true)
    protected List<String> organizationError;
    protected String orgid;
    protected String orgname;
    protected String orgregister;
    protected String orgtypeid;
    protected String orgtypename;
    protected PermittedVehiclesAddressData ownerAddress;
    protected String ownerCountry;
    protected String ownerFirstname;
    protected String ownerHandphone;
    protected String ownerLastname;
    protected String ownerType;
    protected String premissionReqStatus;
    protected String recCreateDate;
    protected String recCreateUserId;
    protected String recDeleteDate;
    protected String recDeleteUserId;
    protected String recStatus;
    protected String recUpdateDate;
    protected String recUpdateUserId;
    @XmlElement(nillable = true)
    protected List<String> requestError;
    protected String seatCount;
    @XmlElement(nillable = true)
    protected List<String> trailerError;
    protected String trailerExpireDate;
    protected String trailerId;
    protected String trailerId2;
    protected String trailerNumber;
    protected String trailerNumber2;
    protected String trailerType;
    protected String vehiclenumber;
    protected String wheelPosition;
    @XmlElement(name = "fTConflictError", nillable = true)
    protected List<String> ftConflictError;
    @XmlElement(name = "nDError", nillable = true)
    protected List<String> ndError;

    /**
     * Gets the value of the avaible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvaible() {
        return avaible;
    }

    /**
     * Sets the value of the avaible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvaible(String value) {
        this.avaible = value;
    }

    /**
     * Gets the value of the boomt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoomt() {
        return boomt;
    }

    /**
     * Sets the value of the boomt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoomt(String value) {
        this.boomt = value;
    }

    /**
     * Gets the value of the boomtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoomtId() {
        return boomtId;
    }

    /**
     * Sets the value of the boomtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoomtId(String value) {
        this.boomtId = value;
    }

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
     * Gets the value of the carError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarError() {
        if (carError == null) {
            carError = new ArrayList<String>();
        }
        return this.carError;
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
     * Gets the value of the checkinsRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckinsRegister() {
        return checkinsRegister;
    }

    /**
     * Sets the value of the checkinsRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckinsRegister(String value) {
        this.checkinsRegister = value;
    }

    /**
     * Gets the value of the checkinsSetRegisterDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckinsSetRegisterDate() {
        return checkinsSetRegisterDate;
    }

    /**
     * Sets the value of the checkinsSetRegisterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckinsSetRegisterDate(String value) {
        this.checkinsSetRegisterDate = value;
    }

    /**
     * Gets the value of the checkinsSetRegisterUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckinsSetRegisterUserId() {
        return checkinsSetRegisterUserId;
    }

    /**
     * Sets the value of the checkinsSetRegisterUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckinsSetRegisterUserId(String value) {
        this.checkinsSetRegisterUserId = value;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
     * Gets the value of the createdUserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedUserid() {
        return createdUserid;
    }

    /**
     * Sets the value of the createdUserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedUserid(String value) {
        this.createdUserid = value;
    }

    /**
     * Gets the value of the daats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaats() {
        return daats;
    }

    /**
     * Sets the value of the daats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaats(String value) {
        this.daats = value;
    }

    /**
     * Gets the value of the driverError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDriverError() {
        if (driverError == null) {
            driverError = new ArrayList<String>();
        }
        return this.driverError;
    }

    /**
     * Gets the value of the driverExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverExpireDate() {
        return driverExpireDate;
    }

    /**
     * Sets the value of the driverExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverExpireDate(String value) {
        this.driverExpireDate = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverId(String value) {
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
     * Gets the value of the driverProfessionalExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverProfessionalExpireDate() {
        return driverProfessionalExpireDate;
    }

    /**
     * Sets the value of the driverProfessionalExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverProfessionalExpireDate(String value) {
        this.driverProfessionalExpireDate = value;
    }

    /**
     * Gets the value of the driverRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverRegister() {
        return driverRegister;
    }

    /**
     * Sets the value of the driverRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverRegister(String value) {
        this.driverRegister = value;
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
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the isPassed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPassed() {
        return isPassed;
    }

    /**
     * Sets the value of the isPassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPassed(String value) {
        this.isPassed = value;
    }

    /**
     * Gets the value of the ishave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIshave() {
        return ishave;
    }

    /**
     * Sets the value of the ishave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIshave(String value) {
        this.ishave = value;
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
     * Gets the value of the oldId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldId() {
        return oldId;
    }

    /**
     * Sets the value of the oldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldId(String value) {
        this.oldId = value;
    }

    /**
     * Gets the value of the organizationError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganizationError() {
        if (organizationError == null) {
            organizationError = new ArrayList<String>();
        }
        return this.organizationError;
    }

    /**
     * Gets the value of the orgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * Sets the value of the orgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgid(String value) {
        this.orgid = value;
    }

    /**
     * Gets the value of the orgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * Sets the value of the orgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgname(String value) {
        this.orgname = value;
    }

    /**
     * Gets the value of the orgregister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgregister() {
        return orgregister;
    }

    /**
     * Sets the value of the orgregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgregister(String value) {
        this.orgregister = value;
    }

    /**
     * Gets the value of the orgtypeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtypeid() {
        return orgtypeid;
    }

    /**
     * Sets the value of the orgtypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgtypeid(String value) {
        this.orgtypeid = value;
    }

    /**
     * Gets the value of the orgtypename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtypename() {
        return orgtypename;
    }

    /**
     * Sets the value of the orgtypename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgtypename(String value) {
        this.orgtypename = value;
    }

    /**
     * Gets the value of the ownerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PermittedVehiclesAddressData }
     *     
     */
    public PermittedVehiclesAddressData getOwnerAddress() {
        return ownerAddress;
    }

    /**
     * Sets the value of the ownerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedVehiclesAddressData }
     *     
     */
    public void setOwnerAddress(PermittedVehiclesAddressData value) {
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
     * Gets the value of the recCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCreateDate() {
        return recCreateDate;
    }

    /**
     * Sets the value of the recCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCreateDate(String value) {
        this.recCreateDate = value;
    }

    /**
     * Gets the value of the recCreateUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCreateUserId() {
        return recCreateUserId;
    }

    /**
     * Sets the value of the recCreateUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCreateUserId(String value) {
        this.recCreateUserId = value;
    }

    /**
     * Gets the value of the recDeleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecDeleteDate() {
        return recDeleteDate;
    }

    /**
     * Sets the value of the recDeleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecDeleteDate(String value) {
        this.recDeleteDate = value;
    }

    /**
     * Gets the value of the recDeleteUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecDeleteUserId() {
        return recDeleteUserId;
    }

    /**
     * Sets the value of the recDeleteUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecDeleteUserId(String value) {
        this.recDeleteUserId = value;
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
     *     {@link String }
     *     
     */
    public String getRecUpdateDate() {
        return recUpdateDate;
    }

    /**
     * Sets the value of the recUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecUpdateDate(String value) {
        this.recUpdateDate = value;
    }

    /**
     * Gets the value of the recUpdateUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecUpdateUserId() {
        return recUpdateUserId;
    }

    /**
     * Sets the value of the recUpdateUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecUpdateUserId(String value) {
        this.recUpdateUserId = value;
    }

    /**
     * Gets the value of the requestError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestError() {
        if (requestError == null) {
            requestError = new ArrayList<String>();
        }
        return this.requestError;
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
     * Gets the value of the trailerError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trailerError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrailerError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrailerError() {
        if (trailerError == null) {
            trailerError = new ArrayList<String>();
        }
        return this.trailerError;
    }

    /**
     * Gets the value of the trailerExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerExpireDate() {
        return trailerExpireDate;
    }

    /**
     * Sets the value of the trailerExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerExpireDate(String value) {
        this.trailerExpireDate = value;
    }

    /**
     * Gets the value of the trailerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerId() {
        return trailerId;
    }

    /**
     * Sets the value of the trailerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerId(String value) {
        this.trailerId = value;
    }

    /**
     * Gets the value of the trailerId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerId2() {
        return trailerId2;
    }

    /**
     * Sets the value of the trailerId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerId2(String value) {
        this.trailerId2 = value;
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
     * Gets the value of the trailerNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerNumber2() {
        return trailerNumber2;
    }

    /**
     * Sets the value of the trailerNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerNumber2(String value) {
        this.trailerNumber2 = value;
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
     * Gets the value of the vehiclenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiclenumber() {
        return vehiclenumber;
    }

    /**
     * Sets the value of the vehiclenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiclenumber(String value) {
        this.vehiclenumber = value;
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
     * Gets the value of the ftConflictError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ftConflictError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFTConflictError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFTConflictError() {
        if (ftConflictError == null) {
            ftConflictError = new ArrayList<String>();
        }
        return this.ftConflictError;
    }

    /**
     * Gets the value of the ndError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ndError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNDError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNDError() {
        if (ndError == null) {
            ndError = new ArrayList<String>();
        }
        return this.ndError;
    }

}
