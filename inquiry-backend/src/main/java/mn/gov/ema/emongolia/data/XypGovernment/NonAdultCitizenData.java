
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for nonAdultCitizenData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nonAdultCitizenData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="birthAimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="birthHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthNCircle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthPlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthPlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthSoumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthTCircle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthweek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="childRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAlive" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isTwin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isTwinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="momAimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="momAimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="momCivilId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="momFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="momFullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="momLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="momRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="momSoumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="momSoumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nonAdultCitizenData", propOrder = {
    "birthAimagCityCode",
    "birthDate",
    "birthHeight",
    "birthNCircle",
    "birthPlaceCode",
    "birthPlaceName",
    "birthSoumDistrictCode",
    "birthTCircle",
    "birthTime",
    "birthTypeName",
    "birthWeight",
    "birthweek",
    "childRegisterNum",
    "isAlive",
    "isTwin",
    "isTwinName",
    "momAimagCityCode",
    "momAimagCityName",
    "momCivilId",
    "momFirstName",
    "momFullAddress",
    "momLastname",
    "momRegnum",
    "momSoumDistrictCode",
    "momSoumDistrictName",
    "sexCode",
    "sexName"
})
public class NonAdultCitizenData {

    protected String birthAimagCityCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String birthHeight;
    protected String birthNCircle;
    protected String birthPlaceCode;
    protected String birthPlaceName;
    protected String birthSoumDistrictCode;
    protected String birthTCircle;
    protected String birthTime;
    protected String birthTypeName;
    protected String birthWeight;
    protected String birthweek;
    protected String childRegisterNum;
    protected int isAlive;
    protected String isTwin;
    protected String isTwinName;
    protected String momAimagCityCode;
    protected String momAimagCityName;
    protected int momCivilId;
    protected String momFirstName;
    protected String momFullAddress;
    protected String momLastname;
    protected String momRegnum;
    protected String momSoumDistrictCode;
    protected String momSoumDistrictName;
    protected String sexCode;
    protected String sexName;

    /**
     * Gets the value of the birthAimagCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthAimagCityCode() {
        return birthAimagCityCode;
    }

    /**
     * Sets the value of the birthAimagCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthAimagCityCode(String value) {
        this.birthAimagCityCode = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the birthHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthHeight() {
        return birthHeight;
    }

    /**
     * Sets the value of the birthHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthHeight(String value) {
        this.birthHeight = value;
    }

    /**
     * Gets the value of the birthNCircle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthNCircle() {
        return birthNCircle;
    }

    /**
     * Sets the value of the birthNCircle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthNCircle(String value) {
        this.birthNCircle = value;
    }

    /**
     * Gets the value of the birthPlaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    /**
     * Sets the value of the birthPlaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlaceCode(String value) {
        this.birthPlaceCode = value;
    }

    /**
     * Gets the value of the birthPlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlaceName() {
        return birthPlaceName;
    }

    /**
     * Sets the value of the birthPlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlaceName(String value) {
        this.birthPlaceName = value;
    }

    /**
     * Gets the value of the birthSoumDistrictCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthSoumDistrictCode() {
        return birthSoumDistrictCode;
    }

    /**
     * Sets the value of the birthSoumDistrictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthSoumDistrictCode(String value) {
        this.birthSoumDistrictCode = value;
    }

    /**
     * Gets the value of the birthTCircle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthTCircle() {
        return birthTCircle;
    }

    /**
     * Sets the value of the birthTCircle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthTCircle(String value) {
        this.birthTCircle = value;
    }

    /**
     * Gets the value of the birthTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthTime() {
        return birthTime;
    }

    /**
     * Sets the value of the birthTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthTime(String value) {
        this.birthTime = value;
    }

    /**
     * Gets the value of the birthTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthTypeName() {
        return birthTypeName;
    }

    /**
     * Sets the value of the birthTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthTypeName(String value) {
        this.birthTypeName = value;
    }

    /**
     * Gets the value of the birthWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthWeight() {
        return birthWeight;
    }

    /**
     * Sets the value of the birthWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthWeight(String value) {
        this.birthWeight = value;
    }

    /**
     * Gets the value of the birthweek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthweek() {
        return birthweek;
    }

    /**
     * Sets the value of the birthweek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthweek(String value) {
        this.birthweek = value;
    }

    /**
     * Gets the value of the childRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildRegisterNum() {
        return childRegisterNum;
    }

    /**
     * Sets the value of the childRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildRegisterNum(String value) {
        this.childRegisterNum = value;
    }

    /**
     * Gets the value of the isAlive property.
     * 
     */
    public int getIsAlive() {
        return isAlive;
    }

    /**
     * Sets the value of the isAlive property.
     * 
     */
    public void setIsAlive(int value) {
        this.isAlive = value;
    }

    /**
     * Gets the value of the isTwin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTwin() {
        return isTwin;
    }

    /**
     * Sets the value of the isTwin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTwin(String value) {
        this.isTwin = value;
    }

    /**
     * Gets the value of the isTwinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTwinName() {
        return isTwinName;
    }

    /**
     * Sets the value of the isTwinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTwinName(String value) {
        this.isTwinName = value;
    }

    /**
     * Gets the value of the momAimagCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomAimagCityCode() {
        return momAimagCityCode;
    }

    /**
     * Sets the value of the momAimagCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomAimagCityCode(String value) {
        this.momAimagCityCode = value;
    }

    /**
     * Gets the value of the momAimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomAimagCityName() {
        return momAimagCityName;
    }

    /**
     * Sets the value of the momAimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomAimagCityName(String value) {
        this.momAimagCityName = value;
    }

    /**
     * Gets the value of the momCivilId property.
     * 
     */
    public int getMomCivilId() {
        return momCivilId;
    }

    /**
     * Sets the value of the momCivilId property.
     * 
     */
    public void setMomCivilId(int value) {
        this.momCivilId = value;
    }

    /**
     * Gets the value of the momFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomFirstName() {
        return momFirstName;
    }

    /**
     * Sets the value of the momFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomFirstName(String value) {
        this.momFirstName = value;
    }

    /**
     * Gets the value of the momFullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomFullAddress() {
        return momFullAddress;
    }

    /**
     * Sets the value of the momFullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomFullAddress(String value) {
        this.momFullAddress = value;
    }

    /**
     * Gets the value of the momLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomLastname() {
        return momLastname;
    }

    /**
     * Sets the value of the momLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomLastname(String value) {
        this.momLastname = value;
    }

    /**
     * Gets the value of the momRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomRegnum() {
        return momRegnum;
    }

    /**
     * Sets the value of the momRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomRegnum(String value) {
        this.momRegnum = value;
    }

    /**
     * Gets the value of the momSoumDistrictCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomSoumDistrictCode() {
        return momSoumDistrictCode;
    }

    /**
     * Sets the value of the momSoumDistrictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomSoumDistrictCode(String value) {
        this.momSoumDistrictCode = value;
    }

    /**
     * Gets the value of the momSoumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomSoumDistrictName() {
        return momSoumDistrictName;
    }

    /**
     * Sets the value of the momSoumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomSoumDistrictName(String value) {
        this.momSoumDistrictName = value;
    }

    /**
     * Gets the value of the sexCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * Sets the value of the sexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexCode(String value) {
        this.sexCode = value;
    }

    /**
     * Gets the value of the sexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexName() {
        return sexName;
    }

    /**
     * Sets the value of the sexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexName(String value) {
        this.sexName = value;
    }

}
