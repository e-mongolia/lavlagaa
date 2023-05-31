
package mn.gov.ema.emongolia.data.XypEducation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ueeReferenceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ueeReferenceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="globalResultList" type="{http://education.xyp.gov.mn/}ueeGlobalScoreDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monTestResult" type="{http://education.xyp.gov.mn/}ueeLocalScoreDetail" minOccurs="0"/&gt;
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ueeResultList" type="{http://education.xyp.gov.mn/}ueeLocalScoreDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ueeReferenceData", propOrder = {
    "firstname",
    "globalResultList",
    "lastname",
    "monTestResult",
    "referenceId",
    "regnum",
    "ueeResultList"
})
public class UeeReferenceData {

    protected String firstname;
    @XmlElement(nillable = true)
    protected List<UeeGlobalScoreDetail> globalResultList;
    protected String lastname;
    protected UeeLocalScoreDetail monTestResult;
    protected String referenceId;
    protected String regnum;
    @XmlElement(nillable = true)
    protected List<UeeLocalScoreDetail> ueeResultList;

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
     * Gets the value of the globalResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UeeGlobalScoreDetail }
     * 
     * 
     */
    public List<UeeGlobalScoreDetail> getGlobalResultList() {
        if (globalResultList == null) {
            globalResultList = new ArrayList<UeeGlobalScoreDetail>();
        }
        return this.globalResultList;
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
     * Gets the value of the monTestResult property.
     * 
     * @return
     *     possible object is
     *     {@link UeeLocalScoreDetail }
     *     
     */
    public UeeLocalScoreDetail getMonTestResult() {
        return monTestResult;
    }

    /**
     * Sets the value of the monTestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UeeLocalScoreDetail }
     *     
     */
    public void setMonTestResult(UeeLocalScoreDetail value) {
        this.monTestResult = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
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
     * Gets the value of the ueeResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ueeResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUeeResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UeeLocalScoreDetail }
     * 
     * 
     */
    public List<UeeLocalScoreDetail> getUeeResultList() {
        if (ueeResultList == null) {
            ueeResultList = new ArrayList<UeeLocalScoreDetail>();
        }
        return this.ueeResultList;
    }

}
