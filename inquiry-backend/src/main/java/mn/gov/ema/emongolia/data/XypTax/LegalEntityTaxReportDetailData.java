
package mn.gov.ema.emongolia.data.XypTax;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityTaxReportDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityTaxReportDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="controlProductCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="notMainCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="productCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="salesIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxBefProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityTaxReportDetailData", propOrder = {
    "companyName",
    "companyRegnum",
    "controlProductCost",
    "notMainCost",
    "productCost",
    "salesIncome",
    "taxBefProfit"
})
public class LegalEntityTaxReportDetailData {

    protected String companyName;
    protected String companyRegnum;
    protected BigDecimal controlProductCost;
    protected BigDecimal notMainCost;
    protected BigDecimal productCost;
    protected BigDecimal salesIncome;
    protected BigDecimal taxBefProfit;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegnum() {
        return companyRegnum;
    }

    /**
     * Sets the value of the companyRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegnum(String value) {
        this.companyRegnum = value;
    }

    /**
     * Gets the value of the controlProductCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getControlProductCost() {
        return controlProductCost;
    }

    /**
     * Sets the value of the controlProductCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setControlProductCost(BigDecimal value) {
        this.controlProductCost = value;
    }

    /**
     * Gets the value of the notMainCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNotMainCost() {
        return notMainCost;
    }

    /**
     * Sets the value of the notMainCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNotMainCost(BigDecimal value) {
        this.notMainCost = value;
    }

    /**
     * Gets the value of the productCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductCost() {
        return productCost;
    }

    /**
     * Sets the value of the productCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductCost(BigDecimal value) {
        this.productCost = value;
    }

    /**
     * Gets the value of the salesIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesIncome() {
        return salesIncome;
    }

    /**
     * Sets the value of the salesIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesIncome(BigDecimal value) {
        this.salesIncome = value;
    }

    /**
     * Gets the value of the taxBefProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxBefProfit() {
        return taxBefProfit;
    }

    /**
     * Sets the value of the taxBefProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxBefProfit(BigDecimal value) {
        this.taxBefProfit = value;
    }

}
