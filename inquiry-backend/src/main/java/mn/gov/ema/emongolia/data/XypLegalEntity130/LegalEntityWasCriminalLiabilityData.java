
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityWasCriminalLiabilityData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityWasCriminalLiabilityData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listData" type="{http://les.xyp.gov.mn/}legalEntityWasCriminalLiabilityDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="punishmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityWasCriminalLiabilityData", propOrder = {
    "listData",
    "punishmentCount"
})
public class LegalEntityWasCriminalLiabilityData {

    @XmlElement(nillable = true)
    protected List<LegalEntityWasCriminalLiabilityDetailData> listData;
    protected int punishmentCount;

    /**
     * Gets the value of the listData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEntityWasCriminalLiabilityDetailData }
     * 
     * 
     */
    public List<LegalEntityWasCriminalLiabilityDetailData> getListData() {
        if (listData == null) {
            listData = new ArrayList<LegalEntityWasCriminalLiabilityDetailData>();
        }
        return this.listData;
    }

    /**
     * Gets the value of the punishmentCount property.
     * 
     */
    public int getPunishmentCount() {
        return punishmentCount;
    }

    /**
     * Sets the value of the punishmentCount property.
     * 
     */
    public void setPunishmentCount(int value) {
        this.punishmentCount = value;
    }

}
