
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceDeptLogData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceDeptLogData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="desc_call_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_dept_debt_c2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_dept_dtyp_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_dept_dtyp_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_dept_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_dept_tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_dept_tmtype_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_dept_tmtype_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceDeptLogData", namespace = "http://ws/", propOrder = {
    "descCallNumber",
    "descDeptDebtC2",
    "descDeptDtypCode",
    "descDeptDtypName",
    "descDeptId",
    "descDeptTin",
    "descDeptTmtypeCode",
    "descDeptTmtypeName",
    "resultCode"
})
public class ServiceDeptLogData {

    @XmlElement(name = "desc_call_number")
    protected String descCallNumber;
    @XmlElement(name = "desc_dept_debt_c2")
    protected String descDeptDebtC2;
    @XmlElement(name = "desc_dept_dtyp_code")
    protected String descDeptDtypCode;
    @XmlElement(name = "desc_dept_dtyp_name")
    protected String descDeptDtypName;
    @XmlElement(name = "desc_dept_id")
    protected String descDeptId;
    @XmlElement(name = "desc_dept_tin")
    protected String descDeptTin;
    @XmlElement(name = "desc_dept_tmtype_code")
    protected String descDeptTmtypeCode;
    @XmlElement(name = "desc_dept_tmtype_name")
    protected String descDeptTmtypeName;
    protected int resultCode;

    /**
     * Gets the value of the descCallNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCallNumber() {
        return descCallNumber;
    }

    /**
     * Sets the value of the descCallNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCallNumber(String value) {
        this.descCallNumber = value;
    }

    /**
     * Gets the value of the descDeptDebtC2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDeptDebtC2() {
        return descDeptDebtC2;
    }

    /**
     * Sets the value of the descDeptDebtC2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDeptDebtC2(String value) {
        this.descDeptDebtC2 = value;
    }

    /**
     * Gets the value of the descDeptDtypCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDeptDtypCode() {
        return descDeptDtypCode;
    }

    /**
     * Sets the value of the descDeptDtypCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDeptDtypCode(String value) {
        this.descDeptDtypCode = value;
    }

    /**
     * Gets the value of the descDeptDtypName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDeptDtypName() {
        return descDeptDtypName;
    }

    /**
     * Sets the value of the descDeptDtypName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDeptDtypName(String value) {
        this.descDeptDtypName = value;
    }

    /**
     * Gets the value of the descDeptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDeptId() {
        return descDeptId;
    }

    /**
     * Sets the value of the descDeptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDeptId(String value) {
        this.descDeptId = value;
    }

    /**
     * Gets the value of the descDeptTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDeptTin() {
        return descDeptTin;
    }

    /**
     * Sets the value of the descDeptTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDeptTin(String value) {
        this.descDeptTin = value;
    }

    /**
     * Gets the value of the descDeptTmtypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDeptTmtypeCode() {
        return descDeptTmtypeCode;
    }

    /**
     * Sets the value of the descDeptTmtypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDeptTmtypeCode(String value) {
        this.descDeptTmtypeCode = value;
    }

    /**
     * Gets the value of the descDeptTmtypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDeptTmtypeName() {
        return descDeptTmtypeName;
    }

    /**
     * Sets the value of the descDeptTmtypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDeptTmtypeName(String value) {
        this.descDeptTmtypeName = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

}
