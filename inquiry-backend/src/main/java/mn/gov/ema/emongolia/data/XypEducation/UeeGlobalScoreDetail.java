
package mn.gov.ema.emongolia.data.XypEducation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ueeGlobalScoreDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ueeGlobalScoreDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="examDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="examDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="examType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lessonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="programExamScore" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="programLessonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scaledCalcScore" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="textCalcScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ueeGlobalScoreDetail", propOrder = {
    "examDate",
    "examDateString",
    "examType",
    "lessonName",
    "programExamScore",
    "programLessonName",
    "programName",
    "scaledCalcScore",
    "textCalcScore"
})
public class UeeGlobalScoreDetail {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar examDate;
    protected String examDateString;
    protected int examType;
    protected String lessonName;
    protected double programExamScore;
    protected String programLessonName;
    protected String programName;
    protected double scaledCalcScore;
    protected String textCalcScore;

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
     * Gets the value of the programExamScore property.
     * 
     */
    public double getProgramExamScore() {
        return programExamScore;
    }

    /**
     * Sets the value of the programExamScore property.
     * 
     */
    public void setProgramExamScore(double value) {
        this.programExamScore = value;
    }

    /**
     * Gets the value of the programLessonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramLessonName() {
        return programLessonName;
    }

    /**
     * Sets the value of the programLessonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramLessonName(String value) {
        this.programLessonName = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the scaledCalcScore property.
     * 
     */
    public double getScaledCalcScore() {
        return scaledCalcScore;
    }

    /**
     * Sets the value of the scaledCalcScore property.
     * 
     */
    public void setScaledCalcScore(double value) {
        this.scaledCalcScore = value;
    }

    /**
     * Gets the value of the textCalcScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextCalcScore() {
        return textCalcScore;
    }

    /**
     * Sets the value of the textCalcScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextCalcScore(String value) {
        this.textCalcScore = value;
    }

}
