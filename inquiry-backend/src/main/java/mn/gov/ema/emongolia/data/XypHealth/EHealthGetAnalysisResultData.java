
package mn.gov.ema.emongolia.data.XypHealth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eHealthGetAnalysisResultData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eHealthGetAnalysisResultData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="analysisResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eHealthGetAnalysisResultData", propOrder = {
    "analysisResult"
})
public class EHealthGetAnalysisResultData {

    protected byte[] analysisResult;

    /**
     * Gets the value of the analysisResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAnalysisResult() {
        return analysisResult;
    }

    /**
     * Sets the value of the analysisResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAnalysisResult(byte[] value) {
        this.analysisResult = value;
    }

}
