
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for driverLicenseClassifyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="driverLicenseClassifyData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="archiveNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="autoCourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "driverLicenseClassifyData", propOrder = {
    "archiveNo",
    "autoCourseName",
    "beginDate",
    "classify"
})
public class DriverLicenseClassifyData {

    protected String archiveNo;
    protected String autoCourseName;
    protected String beginDate;
    protected String classify;

    /**
     * Gets the value of the archiveNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveNo() {
        return archiveNo;
    }

    /**
     * Sets the value of the archiveNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveNo(String value) {
        this.archiveNo = value;
    }

    /**
     * Gets the value of the autoCourseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoCourseName() {
        return autoCourseName;
    }

    /**
     * Sets the value of the autoCourseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoCourseName(String value) {
        this.autoCourseName = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(String value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the classify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassify() {
        return classify;
    }

    /**
     * Sets the value of the classify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassify(String value) {
        this.classify = value;
    }

}
