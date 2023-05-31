
package mn.gov.ema.emongolia.data.XypInsurance;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pregnancyChildbirthCertListDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pregnancyChildbirthCertListDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="benefitDayAverage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="benefitEntitlement" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calculateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calculateInspector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calculatePercentAverage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="checkInspector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="insuranceAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="insuranceDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalCertTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="medicalCertTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalCertnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salaryDetails" type="{http://insurance.xyp.gov.mn/}salaryDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supervisorDoctor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pregnancyChildbirthCertListDetailData", propOrder = {
    "address",
    "aimagCode",
    "aimagName",
    "benefitDayAverage",
    "benefitEntitlement",
    "calculateDate",
    "calculateInspector",
    "calculatePercentAverage",
    "checkInspector",
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
    "insuranceAmount",
    "insuranceDays",
    "lastname",
    "medicalCertTypeId",
    "medicalCertTypeName",
    "medicalCertnumber",
    "orgId",
    "orgName",
    "phone",
    "regnum",
    "requestDate",
    "salaryDetails",
    "startDate",
    "status",
    "statusName",
    "supervisorDoctor",
    "updatedDate"
})
public class PregnancyChildbirthCertListDetailData {

    protected String address;
    protected String aimagCode;
    protected String aimagName;
    protected int benefitDayAverage;
    protected int benefitEntitlement;
    protected String calculateDate;
    protected String calculateInspector;
    protected int calculatePercentAverage;
    protected String checkInspector;
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
    protected int insuranceAmount;
    protected int insuranceDays;
    protected String lastname;
    protected int medicalCertTypeId;
    protected String medicalCertTypeName;
    protected String medicalCertnumber;
    protected String orgId;
    protected String orgName;
    protected String phone;
    protected String regnum;
    protected String requestDate;
    @XmlElement(nillable = true)
    protected List<SalaryDetail> salaryDetails;
    protected String startDate;
    protected int status;
    protected String statusName;
    protected String supervisorDoctor;
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
     * Gets the value of the aimagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagName() {
        return aimagName;
    }

    /**
     * Sets the value of the aimagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagName(String value) {
        this.aimagName = value;
    }

    /**
     * Gets the value of the benefitDayAverage property.
     * 
     */
    public int getBenefitDayAverage() {
        return benefitDayAverage;
    }

    /**
     * Sets the value of the benefitDayAverage property.
     * 
     */
    public void setBenefitDayAverage(int value) {
        this.benefitDayAverage = value;
    }

    /**
     * Gets the value of the benefitEntitlement property.
     * 
     */
    public int getBenefitEntitlement() {
        return benefitEntitlement;
    }

    /**
     * Sets the value of the benefitEntitlement property.
     * 
     */
    public void setBenefitEntitlement(int value) {
        this.benefitEntitlement = value;
    }

    /**
     * Gets the value of the calculateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculateDate() {
        return calculateDate;
    }

    /**
     * Sets the value of the calculateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculateDate(String value) {
        this.calculateDate = value;
    }

    /**
     * Gets the value of the calculateInspector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculateInspector() {
        return calculateInspector;
    }

    /**
     * Sets the value of the calculateInspector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculateInspector(String value) {
        this.calculateInspector = value;
    }

    /**
     * Gets the value of the calculatePercentAverage property.
     * 
     */
    public int getCalculatePercentAverage() {
        return calculatePercentAverage;
    }

    /**
     * Sets the value of the calculatePercentAverage property.
     * 
     */
    public void setCalculatePercentAverage(int value) {
        this.calculatePercentAverage = value;
    }

    /**
     * Gets the value of the checkInspector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInspector() {
        return checkInspector;
    }

    /**
     * Sets the value of the checkInspector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInspector(String value) {
        this.checkInspector = value;
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
     * Gets the value of the insuranceAmount property.
     * 
     */
    public int getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Sets the value of the insuranceAmount property.
     * 
     */
    public void setInsuranceAmount(int value) {
        this.insuranceAmount = value;
    }

    /**
     * Gets the value of the insuranceDays property.
     * 
     */
    public int getInsuranceDays() {
        return insuranceDays;
    }

    /**
     * Sets the value of the insuranceDays property.
     * 
     */
    public void setInsuranceDays(int value) {
        this.insuranceDays = value;
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
     * Gets the value of the medicalCertTypeId property.
     * 
     */
    public int getMedicalCertTypeId() {
        return medicalCertTypeId;
    }

    /**
     * Sets the value of the medicalCertTypeId property.
     * 
     */
    public void setMedicalCertTypeId(int value) {
        this.medicalCertTypeId = value;
    }

    /**
     * Gets the value of the medicalCertTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalCertTypeName() {
        return medicalCertTypeName;
    }

    /**
     * Sets the value of the medicalCertTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalCertTypeName(String value) {
        this.medicalCertTypeName = value;
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
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDate(String value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the salaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalaryDetail }
     * 
     * 
     */
    public List<SalaryDetail> getSalaryDetails() {
        if (salaryDetails == null) {
            salaryDetails = new ArrayList<SalaryDetail>();
        }
        return this.salaryDetails;
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
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the supervisorDoctor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorDoctor() {
        return supervisorDoctor;
    }

    /**
     * Sets the value of the supervisorDoctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorDoctor(String value) {
        this.supervisorDoctor = value;
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
