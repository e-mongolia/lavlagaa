
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landDirectionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landDirectionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://property.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="archiveDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landDirectionRequest", propOrder = {
    "appNo",
    "archiveDir",
    "docTypeCode",
    "docTypeName"
})
public class LandDirectionRequest
    extends ServiceRequest
{

    protected String appNo;
    protected String archiveDir;
    protected String docTypeCode;
    protected String docTypeName;

    /**
     * Gets the value of the appNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppNo() {
        return appNo;
    }

    /**
     * Sets the value of the appNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppNo(String value) {
        this.appNo = value;
    }

    /**
     * Gets the value of the archiveDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveDir() {
        return archiveDir;
    }

    /**
     * Sets the value of the archiveDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveDir(String value) {
        this.archiveDir = value;
    }

    /**
     * Gets the value of the docTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeCode() {
        return docTypeCode;
    }

    /**
     * Sets the value of the docTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeCode(String value) {
        this.docTypeCode = value;
    }

    /**
     * Gets the value of the docTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeName() {
        return docTypeName;
    }

    /**
     * Sets the value of the docTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeName(String value) {
        this.docTypeName = value;
    }

}
