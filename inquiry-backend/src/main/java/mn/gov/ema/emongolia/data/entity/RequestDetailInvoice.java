package mn.gov.ema.emongolia.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import mn.gov.ema.emongolia.util.Constants;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "REQUEST_DETAIL_INVOICE", schema= "ITC_EMONGOLIA")
@SequenceGenerator(name = "RequestDetailInvoiceIdGenerator", sequenceName = "SEQ_REQUEST_DETAIL_INVOICE", allocationSize = 1)
public class RequestDetailInvoice implements Serializable {
    @Id
    @GeneratedValue(generator = "RequestDetailInvoiceIdGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "REQUEST_DETAIL_ID")
    private Long requestDetailId;

    @Basic
    @Column(name = "SERVICE_ID")
    private Long serviceId;

    @Basic
    @Column(name = "INVOICE_NO")
    private String invoiceNo;

    @Basic
    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Basic
    @Column(name = "QPAY_CODE")
    private String qpayCode;

    @Basic
    @Column(name = "SOCIAL_PAY_CODE")
    private String socialPayCode;

    @Basic
    @Column(name = "INVOICE_STATUS")
    private Long invoiceStatus;

    @Basic
    @Column(name = "IS_ACTIVE")
    private Long isActive;

    @Basic
    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Basic
    @Column(name = "CREATED_DATE")
    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.MGL_TIME_ZONE)
    private Date createdDate;

    @Basic
    @Column(name = "CHECK_DATE")
    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.MGL_TIME_ZONE)
    private Date checkDate;
}
