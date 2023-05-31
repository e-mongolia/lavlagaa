
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notaryTrustDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notaryTrustDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bookId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bookNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bookYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="physicalPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="privilegeTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stateRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wfmStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notaryTrustDetailData", propOrder = {
    "bookDate",
    "bookId",
    "bookNumber",
    "bookYear",
    "employeeName",
    "itemName",
    "physicalPath",
    "privilegeTypeName",
    "stateRegNumber",
    "validDuration",
    "wfmStatusName"
})
public class NotaryTrustDetailData {

    protected String bookDate;
    protected String bookId;
    protected String bookNumber;
    protected String bookYear;
    protected String employeeName;
    protected String itemName;
    protected String physicalPath;
    protected String privilegeTypeName;
    protected String stateRegNumber;
    protected String validDuration;
    protected String wfmStatusName;

    /**
     * Gets the value of the bookDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookDate() {
        return bookDate;
    }

    /**
     * Sets the value of the bookDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookDate(String value) {
        this.bookDate = value;
    }

    /**
     * Gets the value of the bookId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * Sets the value of the bookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookId(String value) {
        this.bookId = value;
    }

    /**
     * Gets the value of the bookNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookNumber() {
        return bookNumber;
    }

    /**
     * Sets the value of the bookNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookNumber(String value) {
        this.bookNumber = value;
    }

    /**
     * Gets the value of the bookYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookYear() {
        return bookYear;
    }

    /**
     * Sets the value of the bookYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookYear(String value) {
        this.bookYear = value;
    }

    /**
     * Gets the value of the employeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets the value of the employeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeName(String value) {
        this.employeeName = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the physicalPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalPath() {
        return physicalPath;
    }

    /**
     * Sets the value of the physicalPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalPath(String value) {
        this.physicalPath = value;
    }

    /**
     * Gets the value of the privilegeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivilegeTypeName() {
        return privilegeTypeName;
    }

    /**
     * Sets the value of the privilegeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivilegeTypeName(String value) {
        this.privilegeTypeName = value;
    }

    /**
     * Gets the value of the stateRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegNumber() {
        return stateRegNumber;
    }

    /**
     * Sets the value of the stateRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegNumber(String value) {
        this.stateRegNumber = value;
    }

    /**
     * Gets the value of the validDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDuration() {
        return validDuration;
    }

    /**
     * Sets the value of the validDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDuration(String value) {
        this.validDuration = value;
    }

    /**
     * Gets the value of the wfmStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWfmStatusName() {
        return wfmStatusName;
    }

    /**
     * Sets the value of the wfmStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWfmStatusName(String value) {
        this.wfmStatusName = value;
    }

}
