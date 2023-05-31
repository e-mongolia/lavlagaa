
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for landOfficialLetterDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landOfficialLetterDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appStatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="appStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="appTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="decisionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="decisionLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decisionLevelCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="decisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rightDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rightType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tmpParcel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landOfficialLetterDetailData", propOrder = {
    "appStatusCode",
    "appStatusDesc",
    "appTypeCode",
    "appTypeDesc",
    "createdDate",
    "decisionDate",
    "decisionId",
    "decisionLevel",
    "decisionLevelCode",
    "decisionNumber",
    "docId",
    "docNumber",
    "parcel",
    "rightDesc",
    "rightType",
    "tmpParcel"
})
public class LandOfficialLetterDetailData {

    protected int appStatusCode;
    protected String appStatusDesc;
    protected int appTypeCode;
    protected String appTypeDesc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar decisionDate;
    protected int decisionId;
    protected String decisionLevel;
    protected int decisionLevelCode;
    protected String decisionNumber;
    protected int docId;
    protected String docNumber;
    protected String parcel;
    protected String rightDesc;
    protected int rightType;
    protected String tmpParcel;

    /**
     * Gets the value of the appStatusCode property.
     * 
     */
    public int getAppStatusCode() {
        return appStatusCode;
    }

    /**
     * Sets the value of the appStatusCode property.
     * 
     */
    public void setAppStatusCode(int value) {
        this.appStatusCode = value;
    }

    /**
     * Gets the value of the appStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStatusDesc() {
        return appStatusDesc;
    }

    /**
     * Sets the value of the appStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStatusDesc(String value) {
        this.appStatusDesc = value;
    }

    /**
     * Gets the value of the appTypeCode property.
     * 
     */
    public int getAppTypeCode() {
        return appTypeCode;
    }

    /**
     * Sets the value of the appTypeCode property.
     * 
     */
    public void setAppTypeCode(int value) {
        this.appTypeCode = value;
    }

    /**
     * Gets the value of the appTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppTypeDesc() {
        return appTypeDesc;
    }

    /**
     * Sets the value of the appTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppTypeDesc(String value) {
        this.appTypeDesc = value;
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
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the decisionId property.
     * 
     */
    public int getDecisionId() {
        return decisionId;
    }

    /**
     * Sets the value of the decisionId property.
     * 
     */
    public void setDecisionId(int value) {
        this.decisionId = value;
    }

    /**
     * Gets the value of the decisionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionLevel() {
        return decisionLevel;
    }

    /**
     * Sets the value of the decisionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionLevel(String value) {
        this.decisionLevel = value;
    }

    /**
     * Gets the value of the decisionLevelCode property.
     * 
     */
    public int getDecisionLevelCode() {
        return decisionLevelCode;
    }

    /**
     * Sets the value of the decisionLevelCode property.
     * 
     */
    public void setDecisionLevelCode(int value) {
        this.decisionLevelCode = value;
    }

    /**
     * Gets the value of the decisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNumber() {
        return decisionNumber;
    }

    /**
     * Sets the value of the decisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNumber(String value) {
        this.decisionNumber = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     */
    public int getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     */
    public void setDocId(int value) {
        this.docId = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the parcel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcel() {
        return parcel;
    }

    /**
     * Sets the value of the parcel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcel(String value) {
        this.parcel = value;
    }

    /**
     * Gets the value of the rightDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightDesc() {
        return rightDesc;
    }

    /**
     * Sets the value of the rightDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightDesc(String value) {
        this.rightDesc = value;
    }

    /**
     * Gets the value of the rightType property.
     * 
     */
    public int getRightType() {
        return rightType;
    }

    /**
     * Sets the value of the rightType property.
     * 
     */
    public void setRightType(int value) {
        this.rightType = value;
    }

    /**
     * Gets the value of the tmpParcel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpParcel() {
        return tmpParcel;
    }

    /**
     * Sets the value of the tmpParcel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpParcel(String value) {
        this.tmpParcel = value;
    }

}
