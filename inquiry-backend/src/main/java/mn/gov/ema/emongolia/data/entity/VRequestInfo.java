package mn.gov.ema.emongolia.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import mn.gov.ema.emongolia.util.Constants;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "V_REQUEST_INFO", schema= "ITC_EMONGOLIA")
public class VRequestInfo {

    @Id
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "REQUEST_ID")
    private Long requestId;

    @Basic
    @Column(name = "REQUEST_DATA_ID")
    private String requestDataId;

    @Basic
    @Column(name = "STATUS")
    private Long status;

    @Basic
    @Column(name = "OTP")
    private Long otp;

    @Basic
    @Column(name = "CREATED_DATE")
    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.MGL_TIME_ZONE)
    private Date createdDate;

    @Basic
    @Column(name = "CHECK_DATE")
    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.MGL_TIME_ZONE)
    private Date checkDate;

    @Basic
    @Column(name = "REG_NO")
    private String regNo;

    @Basic
    @Column(name = "ORG_ID")
    private Long orgId;

    @Basic
    @Column(name = "PARENT_ID")
    private Long parentId;

    @Basic
    @Column(name = "ORG_PIN")
    private String orgPin;

    @Basic
    @Column(name = "ORG_NAME")
    private String orgName;

    @Basic
    @Column(name = "BRANCH_NAME")
    private String branchName;

    @Basic
    @Column(name = "USER_ID")
    private Long userId;

    @Basic
    @Column(name = "USERNAME")
    private String username;

    @Basic
    @Column(name = "FIRSTNAME")
    private String firstname;

    @Basic
    @Column(name = "LASTNAME")
    private String lastname;

    @Basic
    @Column(name = "DETAIL_ID")
    private Long detailId;

    @Basic
    @Column(name = "SERVICE_ID")
    private Long serviceId;

    @Basic
    @Column(name = "SERVICE_NAME")
    private String serviceName;

    @Basic
    @Column(name = "RESPONSE_LINK")
    private String responseLink;

    @Basic
    @Column(name = "REQUEST_STATUS")
    private Long requestStatus;

    @Basic
    @Column(name = "REQUEST_STATUS_NAME")
    private String requestStatusName;

    @Basic
    @Column(name = "INVOICE_NO")
    private String invoiceNo;

    @Basic
    @Column(name = "AMOUNT")
    private Long amount;

    @Basic
    @Column(name = "QPAY_CODE")
    private String qPayCode;

    @Basic
    @Column(name = "SOCIAL_PAY_CODE")
    private String socialPayCode;

    @Basic
    @Column(name = "INVOICE_STATUS")
    private Long invoiceStatus;

    @Basic
    @Column(name = "IS_PAY")
    private Long isPay;

    @Basic
    @Column(name = "EMONGOLIA_ID")
    private String emonId;
}
