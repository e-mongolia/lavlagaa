package mn.gov.ema.emongolia.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import mn.gov.ema.emongolia.data.model.GpsInvoice;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "REFERENCE_EMON", schema= "ITC_EMONGOLIA")
@SequenceGenerator(name = "ReferenceEmonIdGenerator", sequenceName = "SEQ_REFERENCE_EMON", allocationSize = 1)
public class ReferenceEmon {
    @Id
    @GeneratedValue(generator = "ReferenceEmonIdGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name="SERVICE_NAME")
    private String serviceName;;

    @Basic
    @Column(name="ORG_ID")
    private Long orgId;

    @Basic
    @Column(name="XYP_SERVICE_CODE")
    private String xypServiceCode;

    @Basic
    @Column(name="STATUS")
    private Long status;

    @Basic
    @Column(name="SERVICE_TYPE")
    private Long serviceType;

    @Basic
    @Column(name="EMONGOLIA_ID")
    private String eMongoliaId;

    @Basic
    @Column(name="TAGS")
    private String tags;

    @Basic
    @Column(name="IS_PAY")
    private Long isPay;

    @Basic
    @Column(name="AMOUNT")
    private Long amount;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "ORG_ID", referencedColumnName = "ID")
    @NotFound(action = NotFoundAction.IGNORE)
    private Organization organization;

    @Transient
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Ulaanbaatar")
    private Date startDate;

    @Transient
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Ulaanbaatar")
    private Date endDate;

    @Transient
    private String pdfUrl;

    @Transient
    private List<ReferenceTag> refTags;

    @Transient
    private String message;

    @Transient
    private String regNum;

    @Transient
    private GpsInvoice gpsInvoice;

    @Transient
    private Long rdId;
}
