
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vehicleListData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleListData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cabinNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="emissionClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="engineCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fualName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fualTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="holder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="markId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="markName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxLoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purposeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purposeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="vehicleTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vehicleTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehidleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleListData", propOrder = {
    "buildMonth",
    "buildYear",
    "cabinNo",
    "certificateNo",
    "countryId",
    "countryName",
    "createdDate",
    "emissionClass",
    "engineCapacity",
    "fualName",
    "fualTypeId",
    "holder",
    "importDate",
    "markId",
    "markName",
    "maxLoad",
    "modelId",
    "modelName",
    "owner",
    "plateNo",
    "purposeId",
    "purposeName",
    "status",
    "statusName",
    "updatedDate",
    "vehicleTypeId",
    "vehicleTypeName",
    "vehidleId"
})
public class VehicleListData {

    protected String buildMonth;
    protected String buildYear;
    protected String cabinNo;
    protected String certificateNo;
    protected int countryId;
    protected String countryName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String emissionClass;
    protected String engineCapacity;
    protected String fualName;
    protected int fualTypeId;
    protected String holder;
    protected String importDate;
    protected int markId;
    protected String markName;
    protected String maxLoad;
    protected int modelId;
    protected String modelName;
    protected String owner;
    protected String plateNo;
    protected String purposeId;
    protected String purposeName;
    protected String status;
    protected String statusName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    protected int vehicleTypeId;
    protected String vehicleTypeName;
    protected int vehidleId;

    /**
     * Gets the value of the buildMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildMonth() {
        return buildMonth;
    }

    /**
     * Sets the value of the buildMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildMonth(String value) {
        this.buildMonth = value;
    }

    /**
     * Gets the value of the buildYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildYear() {
        return buildYear;
    }

    /**
     * Sets the value of the buildYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildYear(String value) {
        this.buildYear = value;
    }

    /**
     * Gets the value of the cabinNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinNo() {
        return cabinNo;
    }

    /**
     * Sets the value of the cabinNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinNo(String value) {
        this.cabinNo = value;
    }

    /**
     * Gets the value of the certificateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * Sets the value of the certificateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNo(String value) {
        this.certificateNo = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(int value) {
        this.countryId = value;
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
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the emissionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmissionClass() {
        return emissionClass;
    }

    /**
     * Sets the value of the emissionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmissionClass(String value) {
        this.emissionClass = value;
    }

    /**
     * Gets the value of the engineCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * Sets the value of the engineCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineCapacity(String value) {
        this.engineCapacity = value;
    }

    /**
     * Gets the value of the fualName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFualName() {
        return fualName;
    }

    /**
     * Sets the value of the fualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFualName(String value) {
        this.fualName = value;
    }

    /**
     * Gets the value of the fualTypeId property.
     * 
     */
    public int getFualTypeId() {
        return fualTypeId;
    }

    /**
     * Sets the value of the fualTypeId property.
     * 
     */
    public void setFualTypeId(int value) {
        this.fualTypeId = value;
    }

    /**
     * Gets the value of the holder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolder() {
        return holder;
    }

    /**
     * Sets the value of the holder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolder(String value) {
        this.holder = value;
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
     * Gets the value of the markId property.
     * 
     */
    public int getMarkId() {
        return markId;
    }

    /**
     * Sets the value of the markId property.
     * 
     */
    public void setMarkId(int value) {
        this.markId = value;
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
     * Gets the value of the maxLoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLoad() {
        return maxLoad;
    }

    /**
     * Sets the value of the maxLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLoad(String value) {
        this.maxLoad = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     */
    public int getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     */
    public void setModelId(int value) {
        this.modelId = value;
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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the plateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNo() {
        return plateNo;
    }

    /**
     * Sets the value of the plateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNo(String value) {
        this.plateNo = value;
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
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the vehicleTypeId property.
     * 
     */
    public int getVehicleTypeId() {
        return vehicleTypeId;
    }

    /**
     * Sets the value of the vehicleTypeId property.
     * 
     */
    public void setVehicleTypeId(int value) {
        this.vehicleTypeId = value;
    }

    /**
     * Gets the value of the vehicleTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTypeName() {
        return vehicleTypeName;
    }

    /**
     * Sets the value of the vehicleTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTypeName(String value) {
        this.vehicleTypeName = value;
    }

    /**
     * Gets the value of the vehidleId property.
     * 
     */
    public int getVehidleId() {
        return vehidleId;
    }

    /**
     * Sets the value of the vehidleId property.
     * 
     */
    public void setVehidleId(int value) {
        this.vehidleId = value;
    }

}
