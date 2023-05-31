
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landCadastreVicinityDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landCadastreVicinityDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressKhashaa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressStreetname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="areaM2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boundaryColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="boundaryWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fillColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="geom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landuse" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="oldParcelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="textGeometry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="utmGeom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validTill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landCadastreVicinityDetailData", propOrder = {
    "addressKhashaa",
    "addressStreetname",
    "areaM2",
    "blockNo",
    "boundaryColor",
    "boundaryWidth",
    "description",
    "fillColor",
    "geom",
    "landuse",
    "oldParcelId",
    "parcelId",
    "textGeometry",
    "utmGeom",
    "validFrom",
    "validTill"
})
public class LandCadastreVicinityDetailData {

    protected String addressKhashaa;
    protected String addressStreetname;
    protected String areaM2;
    protected String blockNo;
    protected String boundaryColor;
    protected String boundaryWidth;
    protected String description;
    protected String fillColor;
    protected String geom;
    protected int landuse;
    protected String oldParcelId;
    protected String parcelId;
    protected String textGeometry;
    protected String utmGeom;
    protected String validFrom;
    protected String validTill;

    /**
     * Gets the value of the addressKhashaa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressKhashaa() {
        return addressKhashaa;
    }

    /**
     * Sets the value of the addressKhashaa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressKhashaa(String value) {
        this.addressKhashaa = value;
    }

    /**
     * Gets the value of the addressStreetname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreetname() {
        return addressStreetname;
    }

    /**
     * Sets the value of the addressStreetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreetname(String value) {
        this.addressStreetname = value;
    }

    /**
     * Gets the value of the areaM2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaM2() {
        return areaM2;
    }

    /**
     * Sets the value of the areaM2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaM2(String value) {
        this.areaM2 = value;
    }

    /**
     * Gets the value of the blockNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockNo() {
        return blockNo;
    }

    /**
     * Sets the value of the blockNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockNo(String value) {
        this.blockNo = value;
    }

    /**
     * Gets the value of the boundaryColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundaryColor() {
        return boundaryColor;
    }

    /**
     * Sets the value of the boundaryColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundaryColor(String value) {
        this.boundaryColor = value;
    }

    /**
     * Gets the value of the boundaryWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundaryWidth() {
        return boundaryWidth;
    }

    /**
     * Sets the value of the boundaryWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundaryWidth(String value) {
        this.boundaryWidth = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fillColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillColor() {
        return fillColor;
    }

    /**
     * Sets the value of the fillColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillColor(String value) {
        this.fillColor = value;
    }

    /**
     * Gets the value of the geom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeom() {
        return geom;
    }

    /**
     * Sets the value of the geom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeom(String value) {
        this.geom = value;
    }

    /**
     * Gets the value of the landuse property.
     * 
     */
    public int getLanduse() {
        return landuse;
    }

    /**
     * Sets the value of the landuse property.
     * 
     */
    public void setLanduse(int value) {
        this.landuse = value;
    }

    /**
     * Gets the value of the oldParcelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldParcelId() {
        return oldParcelId;
    }

    /**
     * Sets the value of the oldParcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldParcelId(String value) {
        this.oldParcelId = value;
    }

    /**
     * Gets the value of the parcelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelId() {
        return parcelId;
    }

    /**
     * Sets the value of the parcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelId(String value) {
        this.parcelId = value;
    }

    /**
     * Gets the value of the textGeometry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextGeometry() {
        return textGeometry;
    }

    /**
     * Sets the value of the textGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextGeometry(String value) {
        this.textGeometry = value;
    }

    /**
     * Gets the value of the utmGeom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtmGeom() {
        return utmGeom;
    }

    /**
     * Sets the value of the utmGeom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtmGeom(String value) {
        this.utmGeom = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTill() {
        return validTill;
    }

    /**
     * Sets the value of the validTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTill(String value) {
        this.validTill = value;
    }

}
