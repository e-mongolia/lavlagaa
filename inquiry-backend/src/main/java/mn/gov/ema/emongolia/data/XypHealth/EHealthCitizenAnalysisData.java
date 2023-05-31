
package mn.gov.ema.emongolia.data.XypHealth;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eHealthCitizenAnalysisData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eHealthCitizenAnalysisData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listCitizenAnalisysData" type="{http://health.xyp.gov.mn/}eHealthCitizenAnalysisDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eHealthCitizenAnalysisData", propOrder = {
    "listCitizenAnalisysData"
})
public class EHealthCitizenAnalysisData {

    @XmlElement(nillable = true)
    protected List<EHealthCitizenAnalysisDetailData> listCitizenAnalisysData;

    /**
     * Gets the value of the listCitizenAnalisysData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listCitizenAnalisysData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListCitizenAnalisysData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EHealthCitizenAnalysisDetailData }
     * 
     * 
     */
    public List<EHealthCitizenAnalysisDetailData> getListCitizenAnalisysData() {
        if (listCitizenAnalisysData == null) {
            listCitizenAnalisysData = new ArrayList<EHealthCitizenAnalysisDetailData>();
        }
        return this.listCitizenAnalisysData;
    }

}
