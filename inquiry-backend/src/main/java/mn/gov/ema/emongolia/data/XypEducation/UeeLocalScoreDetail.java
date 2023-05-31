
package mn.gov.ema.emongolia.data.XypEducation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ueeLocalScoreDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ueeLocalScoreDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="achiScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actualScore" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="examDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="examDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="examType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lessonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentCore" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="scaleScore" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ueeLocalScoreDetail", propOrder = {
    "achiScore",
    "actualScore",
    "examDate",
    "examDateString",
    "examType",
    "lessonName",
    "percentCore",
    "scaleScore"
})
public class UeeLocalScoreDetail {

    protected String achiScore;
    protected double actualScore;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar examDate;
    protected String examDateString;
    protected int examType;
    protected String lessonName;
    protected double percentCore;
    protected double scaleScore;

    /**
     * Gets the value of the achiScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchiScore() {
        return achiScore;
    }

    /**
     * Sets the value of the achiScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchiScore(String value) {
        this.achiScore = value;
    }

    /**
     * Gets the value of the actualScore property.
     * 
     */
    public double getActualScore() {
        return actualScore;
    }

    /**
     * Sets the value of the actualScore property.
     * 
     */
    public void setActualScore(double value) {
        this.actualScore = value;
    }

    /**
     * Gets the value of the examDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExamDate() {
        return examDate;
    }

    /**
     * Sets the value of the examDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExamDate(XMLGregorianCalendar value) {
        this.examDate = value;
    }

    /**
     * Gets the value of the examDateString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamDateString() {
        return examDateString;
    }

    /**
     * Sets the value of the examDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamDateString(String value) {
        this.examDateString = value;
    }

    /**
     * Gets the value of the examType property.
     * 
     */
    public int getExamType() {
        return examType;
    }

    /**
     * Sets the value of the examType property.
     * 
     */
    public void setExamType(int value) {
        this.examType = value;
    }

    /**
     * Gets the value of the lessonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLessonName() {
        return lessonName;
    }

    /**
     * Sets the value of the lessonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLessonName(String value) {
        this.lessonName = value;
    }

    /**
     * Gets the value of the percentCore property.
     * 
     */
    public double getPercentCore() {
        return percentCore;
    }

    /**
     * Sets the value of the percentCore property.
     * 
     */
    public void setPercentCore(double value) {
        this.percentCore = value;
    }

    /**
     * Gets the value of the scaleScore property.
     * 
     */
    public double getScaleScore() {
        return scaleScore;
    }

    /**
     * Sets the value of the scaleScore property.
     * 
     */
    public void setScaleScore(double value) {
        this.scaleScore = value;
    }

}
