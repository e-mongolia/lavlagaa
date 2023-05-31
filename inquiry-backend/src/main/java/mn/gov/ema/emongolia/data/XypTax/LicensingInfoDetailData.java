
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for licensingInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="licensingInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alcoholEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="alcoholOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alcoholPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="alcoholStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="contractStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directorRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="founderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="founderRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationLat" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="locationLng" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="operationCourse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tobaccoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tobaccoOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tobaccoPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tobaccoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "licensingInfoDetailData", propOrder = {
    "address",
    "alcoholEndDate",
    "alcoholOrganization",
    "alcoholPermission",
    "alcoholStartDate",
    "contractStatus",
    "directorName",
    "directorRegnum",
    "founderName",
    "founderRegnum",
    "id",
    "lastname",
    "locationLat",
    "locationLng",
    "operationCourse",
    "operationStatus",
    "orgRegnum",
    "tobaccoEndDate",
    "tobaccoOrganization",
    "tobaccoPermission",
    "tobaccoStartDate"
})
public class LicensingInfoDetailData {

    protected String address;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alcoholEndDate;
    protected String alcoholOrganization;
    protected boolean alcoholPermission;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alcoholStartDate;
    protected String contractStatus;
    protected String directorName;
    protected String directorRegnum;
    protected String founderName;
    protected String founderRegnum;
    protected String id;
    protected String lastname;
    protected int locationLat;
    protected int locationLng;
    protected String operationCourse;
    protected String operationStatus;
    protected String orgRegnum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tobaccoEndDate;
    protected String tobaccoOrganization;
    protected boolean tobaccoPermission;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tobaccoStartDate;

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
     * Gets the value of the alcoholEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlcoholEndDate() {
        return alcoholEndDate;
    }

    /**
     * Sets the value of the alcoholEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlcoholEndDate(XMLGregorianCalendar value) {
        this.alcoholEndDate = value;
    }

    /**
     * Gets the value of the alcoholOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlcoholOrganization() {
        return alcoholOrganization;
    }

    /**
     * Sets the value of the alcoholOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlcoholOrganization(String value) {
        this.alcoholOrganization = value;
    }

    /**
     * Gets the value of the alcoholPermission property.
     * 
     */
    public boolean isAlcoholPermission() {
        return alcoholPermission;
    }

    /**
     * Sets the value of the alcoholPermission property.
     * 
     */
    public void setAlcoholPermission(boolean value) {
        this.alcoholPermission = value;
    }

    /**
     * Gets the value of the alcoholStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlcoholStartDate() {
        return alcoholStartDate;
    }

    /**
     * Sets the value of the alcoholStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlcoholStartDate(XMLGregorianCalendar value) {
        this.alcoholStartDate = value;
    }

    /**
     * Gets the value of the contractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStatus(String value) {
        this.contractStatus = value;
    }

    /**
     * Gets the value of the directorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorName() {
        return directorName;
    }

    /**
     * Sets the value of the directorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorName(String value) {
        this.directorName = value;
    }

    /**
     * Gets the value of the directorRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorRegnum() {
        return directorRegnum;
    }

    /**
     * Sets the value of the directorRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorRegnum(String value) {
        this.directorRegnum = value;
    }

    /**
     * Gets the value of the founderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounderName() {
        return founderName;
    }

    /**
     * Sets the value of the founderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounderName(String value) {
        this.founderName = value;
    }

    /**
     * Gets the value of the founderRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounderRegnum() {
        return founderRegnum;
    }

    /**
     * Sets the value of the founderRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounderRegnum(String value) {
        this.founderRegnum = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the locationLat property.
     * 
     */
    public int getLocationLat() {
        return locationLat;
    }

    /**
     * Sets the value of the locationLat property.
     * 
     */
    public void setLocationLat(int value) {
        this.locationLat = value;
    }

    /**
     * Gets the value of the locationLng property.
     * 
     */
    public int getLocationLng() {
        return locationLng;
    }

    /**
     * Sets the value of the locationLng property.
     * 
     */
    public void setLocationLng(int value) {
        this.locationLng = value;
    }

    /**
     * Gets the value of the operationCourse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationCourse() {
        return operationCourse;
    }

    /**
     * Sets the value of the operationCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationCourse(String value) {
        this.operationCourse = value;
    }

    /**
     * Gets the value of the operationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationStatus() {
        return operationStatus;
    }

    /**
     * Sets the value of the operationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationStatus(String value) {
        this.operationStatus = value;
    }

    /**
     * Gets the value of the orgRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegnum() {
        return orgRegnum;
    }

    /**
     * Sets the value of the orgRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegnum(String value) {
        this.orgRegnum = value;
    }

    /**
     * Gets the value of the tobaccoEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTobaccoEndDate() {
        return tobaccoEndDate;
    }

    /**
     * Sets the value of the tobaccoEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTobaccoEndDate(XMLGregorianCalendar value) {
        this.tobaccoEndDate = value;
    }

    /**
     * Gets the value of the tobaccoOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTobaccoOrganization() {
        return tobaccoOrganization;
    }

    /**
     * Sets the value of the tobaccoOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTobaccoOrganization(String value) {
        this.tobaccoOrganization = value;
    }

    /**
     * Gets the value of the tobaccoPermission property.
     * 
     */
    public boolean isTobaccoPermission() {
        return tobaccoPermission;
    }

    /**
     * Sets the value of the tobaccoPermission property.
     * 
     */
    public void setTobaccoPermission(boolean value) {
        this.tobaccoPermission = value;
    }

    /**
     * Gets the value of the tobaccoStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTobaccoStartDate() {
        return tobaccoStartDate;
    }

    /**
     * Sets the value of the tobaccoStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTobaccoStartDate(XMLGregorianCalendar value) {
        this.tobaccoStartDate = value;
    }

}
