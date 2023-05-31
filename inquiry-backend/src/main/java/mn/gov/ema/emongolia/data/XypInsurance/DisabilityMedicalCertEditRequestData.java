
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disabilityMedicalCertEditRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disabilityMedicalCertEditRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://insurance.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="confirmDoctorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmDoctorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firsthname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="generalDoctorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="generalDoctorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hospitalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hospitalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="icdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalCertnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="reasonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="treatedDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="treatedId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="treatedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disabilityMedicalCertEditRequestData", propOrder = {
    "address",
    "aimagCode",
    "companyId",
    "confirmDoctorId",
    "confirmDoctorName",
    "createdDate",
    "endDate",
    "firsthname",
    "generalDoctorId",
    "generalDoctorName",
    "hospitalId",
    "hospitalName",
    "icdCode",
    "lastname",
    "medicalCertnumber",
    "orgId",
    "phone",
    "reasonId",
    "reasonName",
    "regnum",
    "startDate",
    "treatedDays",
    "treatedId",
    "treatedName",
    "updatedDate"
})
public class DisabilityMedicalCertEditRequestData
    extends ServiceRequest
{

    protected String address;
    protected String aimagCode;
    protected int companyId;
    protected String confirmDoctorId;
    protected String confirmDoctorName;
    protected String createdDate;
    protected String endDate;
    protected String firsthname;
    protected String generalDoctorId;
    protected String generalDoctorName;
    protected String hospitalId;
    protected String hospitalName;
    protected String icdCode;
    protected String lastname;
    protected String medicalCertnumber;
    protected String orgId;
    protected String phone;
    protected int reasonId;
    protected String reasonName;
    protected String regnum;
    protected String startDate;
    protected int treatedDays;
    protected int treatedId;
    protected String treatedName;
    protected String updatedDate;

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
     * Gets the value of the aimagCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCode() {
        return aimagCode;
    }

    /**
     * Sets the value of the aimagCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCode(String value) {
        this.aimagCode = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     */
    public int getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     */
    public void setCompanyId(int value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the confirmDoctorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmDoctorId() {
        return confirmDoctorId;
    }

    /**
     * Sets the value of the confirmDoctorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmDoctorId(String value) {
        this.confirmDoctorId = value;
    }

    /**
     * Gets the value of the confirmDoctorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmDoctorName() {
        return confirmDoctorName;
    }

    /**
     * Sets the value of the confirmDoctorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmDoctorName(String value) {
        this.confirmDoctorName = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the firsthname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirsthname() {
        return firsthname;
    }

    /**
     * Sets the value of the firsthname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirsthname(String value) {
        this.firsthname = value;
    }

    /**
     * Gets the value of the generalDoctorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralDoctorId() {
        return generalDoctorId;
    }

    /**
     * Sets the value of the generalDoctorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralDoctorId(String value) {
        this.generalDoctorId = value;
    }

    /**
     * Gets the value of the generalDoctorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralDoctorName() {
        return generalDoctorName;
    }

    /**
     * Sets the value of the generalDoctorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralDoctorName(String value) {
        this.generalDoctorName = value;
    }

    /**
     * Gets the value of the hospitalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalId() {
        return hospitalId;
    }

    /**
     * Sets the value of the hospitalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalId(String value) {
        this.hospitalId = value;
    }

    /**
     * Gets the value of the hospitalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * Sets the value of the hospitalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalName(String value) {
        this.hospitalName = value;
    }

    /**
     * Gets the value of the icdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcdCode() {
        return icdCode;
    }

    /**
     * Sets the value of the icdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcdCode(String value) {
        this.icdCode = value;
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
     * Gets the value of the medicalCertnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalCertnumber() {
        return medicalCertnumber;
    }

    /**
     * Sets the value of the medicalCertnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalCertnumber(String value) {
        this.medicalCertnumber = value;
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
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the reasonId property.
     * 
     */
    public int getReasonId() {
        return reasonId;
    }

    /**
     * Sets the value of the reasonId property.
     * 
     */
    public void setReasonId(int value) {
        this.reasonId = value;
    }

    /**
     * Gets the value of the reasonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonName() {
        return reasonName;
    }

    /**
     * Sets the value of the reasonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonName(String value) {
        this.reasonName = value;
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
     * Gets the value of the treatedDays property.
     * 
     */
    public int getTreatedDays() {
        return treatedDays;
    }

    /**
     * Sets the value of the treatedDays property.
     * 
     */
    public void setTreatedDays(int value) {
        this.treatedDays = value;
    }

    /**
     * Gets the value of the treatedId property.
     * 
     */
    public int getTreatedId() {
        return treatedId;
    }

    /**
     * Sets the value of the treatedId property.
     * 
     */
    public void setTreatedId(int value) {
        this.treatedId = value;
    }

    /**
     * Gets the value of the treatedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatedName() {
        return treatedName;
    }

    /**
     * Sets the value of the treatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatedName(String value) {
        this.treatedName = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedDate(String value) {
        this.updatedDate = value;
    }

}
