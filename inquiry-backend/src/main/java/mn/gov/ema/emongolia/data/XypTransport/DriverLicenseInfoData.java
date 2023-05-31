
package mn.gov.ema.emongolia.data.XypTransport;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for driverLicenseInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="driverLicenseInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bloodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cellPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cellPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="civilization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classifyList" type="{http://transport.xyp.gov.mn/}driverLicenseClassifyData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customerInfID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverPic" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="driverScore" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="driverType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eyeColorInfID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familyNameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstnameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hairColorInfID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDeaf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isImpairment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastnameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="licenseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="licenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="licenseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lstScoreInfoDtl" type="{http://transport.xyp.gov.mn/}driverScoreDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="motive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="omchlogch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suspendReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="types" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "driverLicenseInfoData", propOrder = {
    "address",
    "birthDate",
    "bloodType",
    "cellPhone1",
    "cellPhone2",
    "civilization",
    "classification",
    "classifyList",
    "customerInfID",
    "driverDate",
    "driverPic",
    "driverScore",
    "driverType",
    "email1",
    "email2",
    "expireDate",
    "eyeColorInfID",
    "familyName",
    "familyNameEng",
    "firstname",
    "firstnameEng",
    "gender",
    "hairColorInfID",
    "height",
    "homePhone",
    "isDeaf",
    "isImpairment",
    "lastname",
    "lastnameEng",
    "licenseDate",
    "licenseNumber",
    "licenseStatus",
    "lstScoreInfoDtl",
    "motive",
    "note",
    "omchlogch",
    "regnum",
    "schoolName",
    "status",
    "statusEng",
    "suspendReason",
    "types",
    "weight"
})
public class DriverLicenseInfoData {

    protected String address;
    protected String birthDate;
    protected String bloodType;
    protected String cellPhone1;
    protected String cellPhone2;
    protected String civilization;
    protected String classification;
    @XmlElement(nillable = true)
    protected List<DriverLicenseClassifyData> classifyList;
    protected String customerInfID;
    protected String driverDate;
    protected byte[] driverPic;
    protected int driverScore;
    protected String driverType;
    protected String email1;
    protected String email2;
    protected String expireDate;
    protected int eyeColorInfID;
    protected String familyName;
    protected String familyNameEng;
    protected String firstname;
    protected String firstnameEng;
    protected String gender;
    protected int hairColorInfID;
    protected int height;
    protected String homePhone;
    protected String isDeaf;
    protected String isImpairment;
    protected String lastname;
    protected String lastnameEng;
    protected String licenseDate;
    protected String licenseNumber;
    protected String licenseStatus;
    @XmlElement(nillable = true)
    protected List<DriverScoreDetailData> lstScoreInfoDtl;
    protected String motive;
    protected String note;
    protected String omchlogch;
    protected String regnum;
    protected String schoolName;
    protected String status;
    protected String statusEng;
    protected String suspendReason;
    protected String types;
    protected String weight;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the bloodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloodType() {
        return bloodType;
    }

    /**
     * Sets the value of the bloodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloodType(String value) {
        this.bloodType = value;
    }

    /**
     * Gets the value of the cellPhone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhone1() {
        return cellPhone1;
    }

    /**
     * Sets the value of the cellPhone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhone1(String value) {
        this.cellPhone1 = value;
    }

    /**
     * Gets the value of the cellPhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhone2() {
        return cellPhone2;
    }

    /**
     * Sets the value of the cellPhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhone2(String value) {
        this.cellPhone2 = value;
    }

    /**
     * Gets the value of the civilization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilization() {
        return civilization;
    }

    /**
     * Sets the value of the civilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilization(String value) {
        this.civilization = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the classifyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classifyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassifyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverLicenseClassifyData }
     * 
     * 
     */
    public List<DriverLicenseClassifyData> getClassifyList() {
        if (classifyList == null) {
            classifyList = new ArrayList<DriverLicenseClassifyData>();
        }
        return this.classifyList;
    }

    /**
     * Gets the value of the customerInfID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerInfID() {
        return customerInfID;
    }

    /**
     * Sets the value of the customerInfID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerInfID(String value) {
        this.customerInfID = value;
    }

    /**
     * Gets the value of the driverDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverDate() {
        return driverDate;
    }

    /**
     * Sets the value of the driverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverDate(String value) {
        this.driverDate = value;
    }

    /**
     * Gets the value of the driverPic property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDriverPic() {
        return driverPic;
    }

    /**
     * Sets the value of the driverPic property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDriverPic(byte[] value) {
        this.driverPic = value;
    }

    /**
     * Gets the value of the driverScore property.
     * 
     */
    public int getDriverScore() {
        return driverScore;
    }

    /**
     * Sets the value of the driverScore property.
     * 
     */
    public void setDriverScore(int value) {
        this.driverScore = value;
    }

    /**
     * Gets the value of the driverType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverType() {
        return driverType;
    }

    /**
     * Sets the value of the driverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverType(String value) {
        this.driverType = value;
    }

    /**
     * Gets the value of the email1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail1() {
        return email1;
    }

    /**
     * Sets the value of the email1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail1(String value) {
        this.email1 = value;
    }

    /**
     * Gets the value of the email2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail2() {
        return email2;
    }

    /**
     * Sets the value of the email2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail2(String value) {
        this.email2 = value;
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
     * Gets the value of the eyeColorInfID property.
     * 
     */
    public int getEyeColorInfID() {
        return eyeColorInfID;
    }

    /**
     * Sets the value of the eyeColorInfID property.
     * 
     */
    public void setEyeColorInfID(int value) {
        this.eyeColorInfID = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the familyNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyNameEng() {
        return familyNameEng;
    }

    /**
     * Sets the value of the familyNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyNameEng(String value) {
        this.familyNameEng = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the firstnameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstnameEng() {
        return firstnameEng;
    }

    /**
     * Sets the value of the firstnameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstnameEng(String value) {
        this.firstnameEng = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the hairColorInfID property.
     * 
     */
    public int getHairColorInfID() {
        return hairColorInfID;
    }

    /**
     * Sets the value of the hairColorInfID property.
     * 
     */
    public void setHairColorInfID(int value) {
        this.hairColorInfID = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the isDeaf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDeaf() {
        return isDeaf;
    }

    /**
     * Sets the value of the isDeaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDeaf(String value) {
        this.isDeaf = value;
    }

    /**
     * Gets the value of the isImpairment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsImpairment() {
        return isImpairment;
    }

    /**
     * Sets the value of the isImpairment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsImpairment(String value) {
        this.isImpairment = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the lastnameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameEng() {
        return lastnameEng;
    }

    /**
     * Sets the value of the lastnameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameEng(String value) {
        this.lastnameEng = value;
    }

    /**
     * Gets the value of the licenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseDate() {
        return licenseDate;
    }

    /**
     * Sets the value of the licenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseDate(String value) {
        this.licenseDate = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the licenseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseStatus() {
        return licenseStatus;
    }

    /**
     * Sets the value of the licenseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseStatus(String value) {
        this.licenseStatus = value;
    }

    /**
     * Gets the value of the lstScoreInfoDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstScoreInfoDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstScoreInfoDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverScoreDetailData }
     * 
     * 
     */
    public List<DriverScoreDetailData> getLstScoreInfoDtl() {
        if (lstScoreInfoDtl == null) {
            lstScoreInfoDtl = new ArrayList<DriverScoreDetailData>();
        }
        return this.lstScoreInfoDtl;
    }

    /**
     * Gets the value of the motive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotive() {
        return motive;
    }

    /**
     * Sets the value of the motive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotive(String value) {
        this.motive = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the omchlogch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmchlogch() {
        return omchlogch;
    }

    /**
     * Sets the value of the omchlogch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmchlogch(String value) {
        this.omchlogch = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
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
     * Gets the value of the statusEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusEng() {
        return statusEng;
    }

    /**
     * Sets the value of the statusEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusEng(String value) {
        this.statusEng = value;
    }

    /**
     * Gets the value of the suspendReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendReason() {
        return suspendReason;
    }

    /**
     * Sets the value of the suspendReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendReason(String value) {
        this.suspendReason = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypes(String value) {
        this.types = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

}
