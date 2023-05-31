
package mn.gov.ema.emongolia.data.XypLegalEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://les.xyp.gov.mn/}address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="branch" type="{http://les.xyp.gov.mn/}branch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="capital" type="{http://les.xyp.gov.mn/}capital" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="changeFond" type="{http://les.xyp.gov.mn/}changeFond" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="changeName" type="{http://les.xyp.gov.mn/}changeName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="founder" type="{http://les.xyp.gov.mn/}founder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="general" type="{http://les.xyp.gov.mn/}general" minOccurs="0"/&gt;
 *         &lt;element name="generalR" type="{http://les.xyp.gov.mn/}generalR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="induty" type="{http://les.xyp.gov.mn/}induty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="liquidation" type="{http://les.xyp.gov.mn/}liquidationData" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shareHolders" type="{http://les.xyp.gov.mn/}shareHolder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="stakeHolders" type="{http://les.xyp.gov.mn/}stakeHolder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityData", propOrder = {
    "address",
    "branch",
    "capital",
    "changeFond",
    "changeName",
    "firstName",
    "founder",
    "general",
    "generalR",
    "induty",
    "lastName",
    "liquidation",
    "regnum",
    "shareHolders",
    "stakeHolders",
    "surname"
})
public class LegalEntityData {

    @XmlElement(nillable = true)
    protected List<Address> address;
    @XmlElement(nillable = true)
    protected List<Branch> branch;
    @XmlElement(nillable = true)
    protected List<Capital> capital;
    @XmlElement(nillable = true)
    protected List<ChangeFond> changeFond;
    @XmlElement(nillable = true)
    protected List<ChangeName> changeName;
    protected String firstName;
    @XmlElement(nillable = true)
    protected List<Founder> founder;
    protected General general;
    @XmlElement(nillable = true)
    protected List<GeneralR> generalR;
    @XmlElement(nillable = true)
    protected List<Induty> induty;
    protected String lastName;
    protected LiquidationData liquidation;
    protected String regnum;
    @XmlElement(nillable = true)
    protected List<ShareHolder> shareHolders;
    @XmlElement(nillable = true)
    protected List<StakeHolder> stakeHolders;
    protected String surname;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the branch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Branch }
     * 
     * 
     */
    public List<Branch> getBranch() {
        if (branch == null) {
            branch = new ArrayList<Branch>();
        }
        return this.branch;
    }

    /**
     * Gets the value of the capital property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capital property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapital().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Capital }
     * 
     * 
     */
    public List<Capital> getCapital() {
        if (capital == null) {
            capital = new ArrayList<Capital>();
        }
        return this.capital;
    }

    /**
     * Gets the value of the changeFond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeFond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeFond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeFond }
     * 
     * 
     */
    public List<ChangeFond> getChangeFond() {
        if (changeFond == null) {
            changeFond = new ArrayList<ChangeFond>();
        }
        return this.changeFond;
    }

    /**
     * Gets the value of the changeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeName }
     * 
     * 
     */
    public List<ChangeName> getChangeName() {
        if (changeName == null) {
            changeName = new ArrayList<ChangeName>();
        }
        return this.changeName;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the founder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the founder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFounder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Founder }
     * 
     * 
     */
    public List<Founder> getFounder() {
        if (founder == null) {
            founder = new ArrayList<Founder>();
        }
        return this.founder;
    }

    /**
     * Gets the value of the general property.
     * 
     * @return
     *     possible object is
     *     {@link General }
     *     
     */
    public General getGeneral() {
        return general;
    }

    /**
     * Sets the value of the general property.
     * 
     * @param value
     *     allowed object is
     *     {@link General }
     *     
     */
    public void setGeneral(General value) {
        this.general = value;
    }

    /**
     * Gets the value of the generalR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralR }
     * 
     * 
     */
    public List<GeneralR> getGeneralR() {
        if (generalR == null) {
            generalR = new ArrayList<GeneralR>();
        }
        return this.generalR;
    }

    /**
     * Gets the value of the induty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the induty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInduty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Induty }
     * 
     * 
     */
    public List<Induty> getInduty() {
        if (induty == null) {
            induty = new ArrayList<Induty>();
        }
        return this.induty;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the liquidation property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidationData }
     *     
     */
    public LiquidationData getLiquidation() {
        return liquidation;
    }

    /**
     * Sets the value of the liquidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidationData }
     *     
     */
    public void setLiquidation(LiquidationData value) {
        this.liquidation = value;
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
     * Gets the value of the shareHolders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareHolders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareHolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareHolder }
     * 
     * 
     */
    public List<ShareHolder> getShareHolders() {
        if (shareHolders == null) {
            shareHolders = new ArrayList<ShareHolder>();
        }
        return this.shareHolders;
    }

    /**
     * Gets the value of the stakeHolders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stakeHolders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStakeHolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StakeHolder }
     * 
     * 
     */
    public List<StakeHolder> getStakeHolders() {
        if (stakeHolders == null) {
            stakeHolders = new ArrayList<StakeHolder>();
        }
        return this.stakeHolders;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

}
