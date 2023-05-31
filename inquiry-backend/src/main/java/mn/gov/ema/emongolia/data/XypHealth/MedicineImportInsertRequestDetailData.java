
package mn.gov.ema.emongolia.data.XypHealth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicineImportInsertRequestDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicineImportInsertRequestDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="importedAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="importedBaseAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="importedQty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicineImportInsertRequestDetailData", propOrder = {
    "importedAmount",
    "importedBaseAmount",
    "importedQty",
    "productId"
})
public class MedicineImportInsertRequestDetailData {

    protected int importedAmount;
    protected int importedBaseAmount;
    protected int importedQty;
    protected String productId;

    /**
     * Gets the value of the importedAmount property.
     * 
     */
    public int getImportedAmount() {
        return importedAmount;
    }

    /**
     * Sets the value of the importedAmount property.
     * 
     */
    public void setImportedAmount(int value) {
        this.importedAmount = value;
    }

    /**
     * Gets the value of the importedBaseAmount property.
     * 
     */
    public int getImportedBaseAmount() {
        return importedBaseAmount;
    }

    /**
     * Sets the value of the importedBaseAmount property.
     * 
     */
    public void setImportedBaseAmount(int value) {
        this.importedBaseAmount = value;
    }

    /**
     * Gets the value of the importedQty property.
     * 
     */
    public int getImportedQty() {
        return importedQty;
    }

    /**
     * Sets the value of the importedQty property.
     * 
     */
    public void setImportedQty(int value) {
        this.importedQty = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

}
