
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mofBudgetedReportDetial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mofBudgetedReportDetial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="budgetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="budgetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changedByWID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changedOnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="createdByWID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdOnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datasourceNumId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deleteFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etlProcWID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grandTotalPayAMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="grandTotalPayAMTByAudit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="grandTotalPayAMTByTax" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="grandTotalPlanAMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="grandTotalRatio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="integrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthPayAMTByAudit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monthPayAMTByTax" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monthRatio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monthlyPayAMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monthlyPlanAMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preYearlyMonthPayAMT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="preYearlyPayGrandTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="reportMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rowWid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="taxMaintypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxMaintypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxSubpurposeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxSubpurposeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tenantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yearlyPlanAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="wUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mofBudgetedReportDetial", propOrder = {
    "budgetCode",
    "budgetName",
    "changedByWID",
    "changedOnDate",
    "createdByWID",
    "createdOnDate",
    "datasourceNumId",
    "deleteFLG",
    "etlProcWID",
    "grandTotalPayAMT",
    "grandTotalPayAMTByAudit",
    "grandTotalPayAMTByTax",
    "grandTotalPlanAMT",
    "grandTotalRatio",
    "integrationId",
    "monthPayAMTByAudit",
    "monthPayAMTByTax",
    "monthRatio",
    "monthlyPayAMT",
    "monthlyPlanAMT",
    "officeCode",
    "officeName",
    "preYearlyMonthPayAMT",
    "preYearlyPayGrandTotal",
    "reportMonth",
    "reportYear",
    "rowWid",
    "taxMaintypeCode",
    "taxMaintypeName",
    "taxSubpurposeCode",
    "taxSubpurposeName",
    "tenantId",
    "yearlyPlanAMT",
    "wInsertDate",
    "wUpdateDate"
})
public class MofBudgetedReportDetial {

    protected String budgetCode;
    protected String budgetName;
    protected String changedByWID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedOnDate;
    protected String createdByWID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOnDate;
    protected String datasourceNumId;
    protected String deleteFLG;
    protected String etlProcWID;
    protected int grandTotalPayAMT;
    protected int grandTotalPayAMTByAudit;
    protected int grandTotalPayAMTByTax;
    protected int grandTotalPlanAMT;
    protected int grandTotalRatio;
    protected String integrationId;
    protected int monthPayAMTByAudit;
    protected int monthPayAMTByTax;
    protected int monthRatio;
    protected int monthlyPayAMT;
    protected int monthlyPlanAMT;
    protected String officeCode;
    protected String officeName;
    protected int preYearlyMonthPayAMT;
    protected int preYearlyPayGrandTotal;
    protected String reportMonth;
    protected String reportYear;
    protected int rowWid;
    protected String taxMaintypeCode;
    protected String taxMaintypeName;
    protected String taxSubpurposeCode;
    protected String taxSubpurposeName;
    protected String tenantId;
    protected String yearlyPlanAMT;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar wInsertDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar wUpdateDate;

    /**
     * Gets the value of the budgetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetCode() {
        return budgetCode;
    }

    /**
     * Sets the value of the budgetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetCode(String value) {
        this.budgetCode = value;
    }

    /**
     * Gets the value of the budgetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetName() {
        return budgetName;
    }

    /**
     * Sets the value of the budgetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetName(String value) {
        this.budgetName = value;
    }

    /**
     * Gets the value of the changedByWID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangedByWID() {
        return changedByWID;
    }

    /**
     * Sets the value of the changedByWID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangedByWID(String value) {
        this.changedByWID = value;
    }

    /**
     * Gets the value of the changedOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedOnDate() {
        return changedOnDate;
    }

    /**
     * Sets the value of the changedOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedOnDate(XMLGregorianCalendar value) {
        this.changedOnDate = value;
    }

    /**
     * Gets the value of the createdByWID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByWID() {
        return createdByWID;
    }

    /**
     * Sets the value of the createdByWID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByWID(String value) {
        this.createdByWID = value;
    }

    /**
     * Gets the value of the createdOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOnDate() {
        return createdOnDate;
    }

    /**
     * Sets the value of the createdOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOnDate(XMLGregorianCalendar value) {
        this.createdOnDate = value;
    }

    /**
     * Gets the value of the datasourceNumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasourceNumId() {
        return datasourceNumId;
    }

    /**
     * Sets the value of the datasourceNumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasourceNumId(String value) {
        this.datasourceNumId = value;
    }

    /**
     * Gets the value of the deleteFLG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteFLG() {
        return deleteFLG;
    }

    /**
     * Sets the value of the deleteFLG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteFLG(String value) {
        this.deleteFLG = value;
    }

    /**
     * Gets the value of the etlProcWID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtlProcWID() {
        return etlProcWID;
    }

    /**
     * Sets the value of the etlProcWID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtlProcWID(String value) {
        this.etlProcWID = value;
    }

    /**
     * Gets the value of the grandTotalPayAMT property.
     * 
     */
    public int getGrandTotalPayAMT() {
        return grandTotalPayAMT;
    }

    /**
     * Sets the value of the grandTotalPayAMT property.
     * 
     */
    public void setGrandTotalPayAMT(int value) {
        this.grandTotalPayAMT = value;
    }

    /**
     * Gets the value of the grandTotalPayAMTByAudit property.
     * 
     */
    public int getGrandTotalPayAMTByAudit() {
        return grandTotalPayAMTByAudit;
    }

    /**
     * Sets the value of the grandTotalPayAMTByAudit property.
     * 
     */
    public void setGrandTotalPayAMTByAudit(int value) {
        this.grandTotalPayAMTByAudit = value;
    }

    /**
     * Gets the value of the grandTotalPayAMTByTax property.
     * 
     */
    public int getGrandTotalPayAMTByTax() {
        return grandTotalPayAMTByTax;
    }

    /**
     * Sets the value of the grandTotalPayAMTByTax property.
     * 
     */
    public void setGrandTotalPayAMTByTax(int value) {
        this.grandTotalPayAMTByTax = value;
    }

    /**
     * Gets the value of the grandTotalPlanAMT property.
     * 
     */
    public int getGrandTotalPlanAMT() {
        return grandTotalPlanAMT;
    }

    /**
     * Sets the value of the grandTotalPlanAMT property.
     * 
     */
    public void setGrandTotalPlanAMT(int value) {
        this.grandTotalPlanAMT = value;
    }

    /**
     * Gets the value of the grandTotalRatio property.
     * 
     */
    public int getGrandTotalRatio() {
        return grandTotalRatio;
    }

    /**
     * Sets the value of the grandTotalRatio property.
     * 
     */
    public void setGrandTotalRatio(int value) {
        this.grandTotalRatio = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the monthPayAMTByAudit property.
     * 
     */
    public int getMonthPayAMTByAudit() {
        return monthPayAMTByAudit;
    }

    /**
     * Sets the value of the monthPayAMTByAudit property.
     * 
     */
    public void setMonthPayAMTByAudit(int value) {
        this.monthPayAMTByAudit = value;
    }

    /**
     * Gets the value of the monthPayAMTByTax property.
     * 
     */
    public int getMonthPayAMTByTax() {
        return monthPayAMTByTax;
    }

    /**
     * Sets the value of the monthPayAMTByTax property.
     * 
     */
    public void setMonthPayAMTByTax(int value) {
        this.monthPayAMTByTax = value;
    }

    /**
     * Gets the value of the monthRatio property.
     * 
     */
    public int getMonthRatio() {
        return monthRatio;
    }

    /**
     * Sets the value of the monthRatio property.
     * 
     */
    public void setMonthRatio(int value) {
        this.monthRatio = value;
    }

    /**
     * Gets the value of the monthlyPayAMT property.
     * 
     */
    public int getMonthlyPayAMT() {
        return monthlyPayAMT;
    }

    /**
     * Sets the value of the monthlyPayAMT property.
     * 
     */
    public void setMonthlyPayAMT(int value) {
        this.monthlyPayAMT = value;
    }

    /**
     * Gets the value of the monthlyPlanAMT property.
     * 
     */
    public int getMonthlyPlanAMT() {
        return monthlyPlanAMT;
    }

    /**
     * Sets the value of the monthlyPlanAMT property.
     * 
     */
    public void setMonthlyPlanAMT(int value) {
        this.monthlyPlanAMT = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the officeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Sets the value of the officeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeName(String value) {
        this.officeName = value;
    }

    /**
     * Gets the value of the preYearlyMonthPayAMT property.
     * 
     */
    public int getPreYearlyMonthPayAMT() {
        return preYearlyMonthPayAMT;
    }

    /**
     * Sets the value of the preYearlyMonthPayAMT property.
     * 
     */
    public void setPreYearlyMonthPayAMT(int value) {
        this.preYearlyMonthPayAMT = value;
    }

    /**
     * Gets the value of the preYearlyPayGrandTotal property.
     * 
     */
    public int getPreYearlyPayGrandTotal() {
        return preYearlyPayGrandTotal;
    }

    /**
     * Sets the value of the preYearlyPayGrandTotal property.
     * 
     */
    public void setPreYearlyPayGrandTotal(int value) {
        this.preYearlyPayGrandTotal = value;
    }

    /**
     * Gets the value of the reportMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportMonth() {
        return reportMonth;
    }

    /**
     * Sets the value of the reportMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportMonth(String value) {
        this.reportMonth = value;
    }

    /**
     * Gets the value of the reportYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportYear() {
        return reportYear;
    }

    /**
     * Sets the value of the reportYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportYear(String value) {
        this.reportYear = value;
    }

    /**
     * Gets the value of the rowWid property.
     * 
     */
    public int getRowWid() {
        return rowWid;
    }

    /**
     * Sets the value of the rowWid property.
     * 
     */
    public void setRowWid(int value) {
        this.rowWid = value;
    }

    /**
     * Gets the value of the taxMaintypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMaintypeCode() {
        return taxMaintypeCode;
    }

    /**
     * Sets the value of the taxMaintypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMaintypeCode(String value) {
        this.taxMaintypeCode = value;
    }

    /**
     * Gets the value of the taxMaintypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMaintypeName() {
        return taxMaintypeName;
    }

    /**
     * Sets the value of the taxMaintypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMaintypeName(String value) {
        this.taxMaintypeName = value;
    }

    /**
     * Gets the value of the taxSubpurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxSubpurposeCode() {
        return taxSubpurposeCode;
    }

    /**
     * Sets the value of the taxSubpurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxSubpurposeCode(String value) {
        this.taxSubpurposeCode = value;
    }

    /**
     * Gets the value of the taxSubpurposeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxSubpurposeName() {
        return taxSubpurposeName;
    }

    /**
     * Sets the value of the taxSubpurposeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxSubpurposeName(String value) {
        this.taxSubpurposeName = value;
    }

    /**
     * Gets the value of the tenantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Sets the value of the tenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantId(String value) {
        this.tenantId = value;
    }

    /**
     * Gets the value of the yearlyPlanAMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearlyPlanAMT() {
        return yearlyPlanAMT;
    }

    /**
     * Sets the value of the yearlyPlanAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearlyPlanAMT(String value) {
        this.yearlyPlanAMT = value;
    }

    /**
     * Gets the value of the wInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWInsertDate() {
        return wInsertDate;
    }

    /**
     * Sets the value of the wInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWInsertDate(XMLGregorianCalendar value) {
        this.wInsertDate = value;
    }

    /**
     * Gets the value of the wUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWUpdateDate() {
        return wUpdateDate;
    }

    /**
     * Sets the value of the wUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWUpdateDate(XMLGregorianCalendar value) {
        this.wUpdateDate = value;
    }

}
