
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vehicleImportDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleImportDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="breakInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carMile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cstmCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cstmDutySumAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dclrTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impExpDclrNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importerAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importerNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importerRgNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inspctorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moreImpormation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="regUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="sendReadyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="teamMgrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="teamMgrInspctDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="vehCargoCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehEngineCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehEngineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehModelNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yearModifyInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleImportDetailData", propOrder = {
    "breakInfo",
    "buildDate",
    "carAdditionalInfo",
    "carMile",
    "changeMode",
    "cstmCd",
    "cstmDutySumAmt",
    "dclrTypeCd",
    "impExpDclrNo",
    "importerAddr",
    "importerNm",
    "importerPhone",
    "importerRgNo",
    "inspctorId",
    "moreImpormation",
    "regDate",
    "regUserId",
    "sendDate",
    "sendReadyFlag",
    "teamMgrId",
    "teamMgrInspctDate",
    "vehCargoCapacity",
    "vehEngineCapacity",
    "vehEngineNo",
    "vehMark",
    "vehModelNo",
    "yearModifyInfo"
})
public class VehicleImportDetailData {

    protected String breakInfo;
    protected String buildDate;
    protected String carAdditionalInfo;
    protected String carMile;
    protected String changeMode;
    protected String cstmCd;
    protected String cstmDutySumAmt;
    protected String dclrTypeCd;
    protected String impExpDclrNo;
    protected String importerAddr;
    protected String importerNm;
    protected String importerPhone;
    protected String importerRgNo;
    protected String inspctorId;
    protected String moreImpormation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDate;
    protected String regUserId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDate;
    protected String sendReadyFlag;
    protected String teamMgrId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar teamMgrInspctDate;
    protected String vehCargoCapacity;
    protected String vehEngineCapacity;
    protected String vehEngineNo;
    protected String vehMark;
    protected String vehModelNo;
    protected String yearModifyInfo;

    /**
     * Gets the value of the breakInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakInfo() {
        return breakInfo;
    }

    /**
     * Sets the value of the breakInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakInfo(String value) {
        this.breakInfo = value;
    }

    /**
     * Gets the value of the buildDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * Sets the value of the buildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildDate(String value) {
        this.buildDate = value;
    }

    /**
     * Gets the value of the carAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarAdditionalInfo() {
        return carAdditionalInfo;
    }

    /**
     * Sets the value of the carAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarAdditionalInfo(String value) {
        this.carAdditionalInfo = value;
    }

    /**
     * Gets the value of the carMile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarMile() {
        return carMile;
    }

    /**
     * Sets the value of the carMile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarMile(String value) {
        this.carMile = value;
    }

    /**
     * Gets the value of the changeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeMode() {
        return changeMode;
    }

    /**
     * Sets the value of the changeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeMode(String value) {
        this.changeMode = value;
    }

    /**
     * Gets the value of the cstmCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmCd() {
        return cstmCd;
    }

    /**
     * Sets the value of the cstmCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmCd(String value) {
        this.cstmCd = value;
    }

    /**
     * Gets the value of the cstmDutySumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmDutySumAmt() {
        return cstmDutySumAmt;
    }

    /**
     * Sets the value of the cstmDutySumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmDutySumAmt(String value) {
        this.cstmDutySumAmt = value;
    }

    /**
     * Gets the value of the dclrTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrTypeCd() {
        return dclrTypeCd;
    }

    /**
     * Sets the value of the dclrTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclrTypeCd(String value) {
        this.dclrTypeCd = value;
    }

    /**
     * Gets the value of the impExpDclrNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpExpDclrNo() {
        return impExpDclrNo;
    }

    /**
     * Sets the value of the impExpDclrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpExpDclrNo(String value) {
        this.impExpDclrNo = value;
    }

    /**
     * Gets the value of the importerAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporterAddr() {
        return importerAddr;
    }

    /**
     * Sets the value of the importerAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporterAddr(String value) {
        this.importerAddr = value;
    }

    /**
     * Gets the value of the importerNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporterNm() {
        return importerNm;
    }

    /**
     * Sets the value of the importerNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporterNm(String value) {
        this.importerNm = value;
    }

    /**
     * Gets the value of the importerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporterPhone() {
        return importerPhone;
    }

    /**
     * Sets the value of the importerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporterPhone(String value) {
        this.importerPhone = value;
    }

    /**
     * Gets the value of the importerRgNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporterRgNo() {
        return importerRgNo;
    }

    /**
     * Sets the value of the importerRgNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporterRgNo(String value) {
        this.importerRgNo = value;
    }

    /**
     * Gets the value of the inspctorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspctorId() {
        return inspctorId;
    }

    /**
     * Sets the value of the inspctorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspctorId(String value) {
        this.inspctorId = value;
    }

    /**
     * Gets the value of the moreImpormation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreImpormation() {
        return moreImpormation;
    }

    /**
     * Sets the value of the moreImpormation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreImpormation(String value) {
        this.moreImpormation = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the regUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegUserId() {
        return regUserId;
    }

    /**
     * Sets the value of the regUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegUserId(String value) {
        this.regUserId = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDate(XMLGregorianCalendar value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the sendReadyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendReadyFlag() {
        return sendReadyFlag;
    }

    /**
     * Sets the value of the sendReadyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendReadyFlag(String value) {
        this.sendReadyFlag = value;
    }

    /**
     * Gets the value of the teamMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMgrId() {
        return teamMgrId;
    }

    /**
     * Sets the value of the teamMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMgrId(String value) {
        this.teamMgrId = value;
    }

    /**
     * Gets the value of the teamMgrInspctDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTeamMgrInspctDate() {
        return teamMgrInspctDate;
    }

    /**
     * Sets the value of the teamMgrInspctDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTeamMgrInspctDate(XMLGregorianCalendar value) {
        this.teamMgrInspctDate = value;
    }

    /**
     * Gets the value of the vehCargoCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehCargoCapacity() {
        return vehCargoCapacity;
    }

    /**
     * Sets the value of the vehCargoCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehCargoCapacity(String value) {
        this.vehCargoCapacity = value;
    }

    /**
     * Gets the value of the vehEngineCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehEngineCapacity() {
        return vehEngineCapacity;
    }

    /**
     * Sets the value of the vehEngineCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehEngineCapacity(String value) {
        this.vehEngineCapacity = value;
    }

    /**
     * Gets the value of the vehEngineNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehEngineNo() {
        return vehEngineNo;
    }

    /**
     * Sets the value of the vehEngineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehEngineNo(String value) {
        this.vehEngineNo = value;
    }

    /**
     * Gets the value of the vehMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehMark() {
        return vehMark;
    }

    /**
     * Sets the value of the vehMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehMark(String value) {
        this.vehMark = value;
    }

    /**
     * Gets the value of the vehModelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehModelNo() {
        return vehModelNo;
    }

    /**
     * Sets the value of the vehModelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehModelNo(String value) {
        this.vehModelNo = value;
    }

    /**
     * Gets the value of the yearModifyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearModifyInfo() {
        return yearModifyInfo;
    }

    /**
     * Sets the value of the yearModifyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearModifyInfo(String value) {
        this.yearModifyInfo = value;
    }

}
