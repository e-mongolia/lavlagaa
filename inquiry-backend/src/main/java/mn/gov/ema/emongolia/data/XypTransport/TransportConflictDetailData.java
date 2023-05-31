
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transportConflictDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transportConflictDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorizedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorizedDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorizedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorizedUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmUserId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="conflict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conflictDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trailerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transportConflictDetailData", propOrder = {
    "authorized",
    "authorizedDate",
    "authorizedDesc",
    "authorizedUser",
    "authorizedUserId",
    "confirmDate",
    "confirmName",
    "confirmUserId",
    "conflict",
    "conflictDate",
    "createdDate",
    "createdName",
    "directionName",
    "orgId",
    "orgName",
    "orgRegister",
    "orgTypeName",
    "recStatus",
    "status",
    "trailerNumber",
    "vehicleNumber"
})
public class TransportConflictDetailData {

    protected String authorized;
    protected String authorizedDate;
    protected String authorizedDesc;
    protected String authorizedUser;
    protected String authorizedUserId;
    protected String confirmDate;
    protected String confirmName;
    protected int confirmUserId;
    protected String conflict;
    protected String conflictDate;
    protected String createdDate;
    protected String createdName;
    protected String directionName;
    protected int orgId;
    protected String orgName;
    protected String orgRegister;
    protected String orgTypeName;
    protected String recStatus;
    protected String status;
    protected String trailerNumber;
    protected String vehicleNumber;

    /**
     * Gets the value of the authorized property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorized() {
        return authorized;
    }

    /**
     * Sets the value of the authorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorized(String value) {
        this.authorized = value;
    }

    /**
     * Gets the value of the authorizedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedDate() {
        return authorizedDate;
    }

    /**
     * Sets the value of the authorizedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedDate(String value) {
        this.authorizedDate = value;
    }

    /**
     * Gets the value of the authorizedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedDesc() {
        return authorizedDesc;
    }

    /**
     * Sets the value of the authorizedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedDesc(String value) {
        this.authorizedDesc = value;
    }

    /**
     * Gets the value of the authorizedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedUser() {
        return authorizedUser;
    }

    /**
     * Sets the value of the authorizedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedUser(String value) {
        this.authorizedUser = value;
    }

    /**
     * Gets the value of the authorizedUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedUserId() {
        return authorizedUserId;
    }

    /**
     * Sets the value of the authorizedUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedUserId(String value) {
        this.authorizedUserId = value;
    }

    /**
     * Gets the value of the confirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmDate() {
        return confirmDate;
    }

    /**
     * Sets the value of the confirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmDate(String value) {
        this.confirmDate = value;
    }

    /**
     * Gets the value of the confirmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmName() {
        return confirmName;
    }

    /**
     * Sets the value of the confirmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmName(String value) {
        this.confirmName = value;
    }

    /**
     * Gets the value of the confirmUserId property.
     * 
     */
    public int getConfirmUserId() {
        return confirmUserId;
    }

    /**
     * Sets the value of the confirmUserId property.
     * 
     */
    public void setConfirmUserId(int value) {
        this.confirmUserId = value;
    }

    /**
     * Gets the value of the conflict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflict() {
        return conflict;
    }

    /**
     * Sets the value of the conflict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflict(String value) {
        this.conflict = value;
    }

    /**
     * Gets the value of the conflictDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictDate() {
        return conflictDate;
    }

    /**
     * Sets the value of the conflictDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictDate(String value) {
        this.conflictDate = value;
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
     * Gets the value of the directionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionName() {
        return directionName;
    }

    /**
     * Sets the value of the directionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionName(String value) {
        this.directionName = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     */
    public int getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     */
    public void setOrgId(int value) {
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

}
