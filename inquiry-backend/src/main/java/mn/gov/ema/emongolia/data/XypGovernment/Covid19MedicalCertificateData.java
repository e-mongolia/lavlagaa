
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for covid19MedicalCertificateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="covid19MedicalCertificateData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="aimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagKhoroo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="careHumanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diagnosisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dianosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doctor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="generalDoctor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hospitalizedBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hospitalizedEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalCertificateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalCertificateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalHistory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="professionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="professionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qrData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workPlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workPlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "covid19MedicalCertificateData", propOrder = {
    "age",
    "aimagCityCode",
    "aimagCityName",
    "bagKhoroo",
    "careHumanName",
    "diagnosisName",
    "dianosisCode",
    "doctor",
    "firstname",
    "generalDoctor",
    "hospitalizedBeginDate",
    "hospitalizedEndDate",
    "lastname",
    "medicalCertificateCode",
    "medicalCertificateName",
    "medicalHistory",
    "medicalName",
    "professionCode",
    "professionName",
    "qrData",
    "reasonCode",
    "reasonName",
    "regnum",
    "sex",
    "soumDistrictCode",
    "soumDistrictName",
    "workPlaceCode",
    "workPlaceName"
})
public class Covid19MedicalCertificateData {

    protected int age;
    protected String aimagCityCode;
    protected String aimagCityName;
    protected String bagKhoroo;
    protected String careHumanName;
    protected String diagnosisName;
    protected String dianosisCode;
    protected String doctor;
    protected String firstname;
    protected String generalDoctor;
    protected String hospitalizedBeginDate;
    protected String hospitalizedEndDate;
    protected String lastname;
    protected String medicalCertificateCode;
    protected String medicalCertificateName;
    protected String medicalHistory;
    protected String medicalName;
    protected String professionCode;
    protected String professionName;
    protected String qrData;
    protected String reasonCode;
    protected String reasonName;
    protected String regnum;
    protected String sex;
    protected String soumDistrictCode;
    protected String soumDistrictName;
    protected String workPlaceCode;
    protected String workPlaceName;

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the aimagCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCityCode() {
        return aimagCityCode;
    }

    /**
     * Sets the value of the aimagCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCityCode(String value) {
        this.aimagCityCode = value;
    }

    /**
     * Gets the value of the aimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCityName() {
        return aimagCityName;
    }

    /**
     * Sets the value of the aimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCityName(String value) {
        this.aimagCityName = value;
    }

    /**
     * Gets the value of the bagKhoroo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagKhoroo() {
        return bagKhoroo;
    }

    /**
     * Sets the value of the bagKhoroo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagKhoroo(String value) {
        this.bagKhoroo = value;
    }

    /**
     * Gets the value of the careHumanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareHumanName() {
        return careHumanName;
    }

    /**
     * Sets the value of the careHumanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareHumanName(String value) {
        this.careHumanName = value;
    }

    /**
     * Gets the value of the diagnosisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosisName() {
        return diagnosisName;
    }

    /**
     * Sets the value of the diagnosisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosisName(String value) {
        this.diagnosisName = value;
    }

    /**
     * Gets the value of the dianosisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDianosisCode() {
        return dianosisCode;
    }

    /**
     * Sets the value of the dianosisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDianosisCode(String value) {
        this.dianosisCode = value;
    }

    /**
     * Gets the value of the doctor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctor() {
        return doctor;
    }

    /**
     * Sets the value of the doctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctor(String value) {
        this.doctor = value;
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
     * Gets the value of the generalDoctor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralDoctor() {
        return generalDoctor;
    }

    /**
     * Sets the value of the generalDoctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralDoctor(String value) {
        this.generalDoctor = value;
    }

    /**
     * Gets the value of the hospitalizedBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalizedBeginDate() {
        return hospitalizedBeginDate;
    }

    /**
     * Sets the value of the hospitalizedBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalizedBeginDate(String value) {
        this.hospitalizedBeginDate = value;
    }

    /**
     * Gets the value of the hospitalizedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalizedEndDate() {
        return hospitalizedEndDate;
    }

    /**
     * Sets the value of the hospitalizedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalizedEndDate(String value) {
        this.hospitalizedEndDate = value;
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
     * Gets the value of the medicalCertificateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalCertificateCode() {
        return medicalCertificateCode;
    }

    /**
     * Sets the value of the medicalCertificateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalCertificateCode(String value) {
        this.medicalCertificateCode = value;
    }

    /**
     * Gets the value of the medicalCertificateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalCertificateName() {
        return medicalCertificateName;
    }

    /**
     * Sets the value of the medicalCertificateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalCertificateName(String value) {
        this.medicalCertificateName = value;
    }

    /**
     * Gets the value of the medicalHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalHistory() {
        return medicalHistory;
    }

    /**
     * Sets the value of the medicalHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalHistory(String value) {
        this.medicalHistory = value;
    }

    /**
     * Gets the value of the medicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalName() {
        return medicalName;
    }

    /**
     * Sets the value of the medicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalName(String value) {
        this.medicalName = value;
    }

    /**
     * Gets the value of the professionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionCode() {
        return professionCode;
    }

    /**
     * Sets the value of the professionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionCode(String value) {
        this.professionCode = value;
    }

    /**
     * Gets the value of the professionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionName() {
        return professionName;
    }

    /**
     * Sets the value of the professionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionName(String value) {
        this.professionName = value;
    }

    /**
     * Gets the value of the qrData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrData() {
        return qrData;
    }

    /**
     * Sets the value of the qrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrData(String value) {
        this.qrData = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
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
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the soumDistrictCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumDistrictCode() {
        return soumDistrictCode;
    }

    /**
     * Sets the value of the soumDistrictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumDistrictCode(String value) {
        this.soumDistrictCode = value;
    }

    /**
     * Gets the value of the soumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumDistrictName() {
        return soumDistrictName;
    }

    /**
     * Sets the value of the soumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumDistrictName(String value) {
        this.soumDistrictName = value;
    }

    /**
     * Gets the value of the workPlaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPlaceCode() {
        return workPlaceCode;
    }

    /**
     * Sets the value of the workPlaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPlaceCode(String value) {
        this.workPlaceCode = value;
    }

    /**
     * Gets the value of the workPlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPlaceName() {
        return workPlaceName;
    }

    /**
     * Sets the value of the workPlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPlaceName(String value) {
        this.workPlaceName = value;
    }

}
