package mn.gov.ema.emongolia.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import mn.gov.ema.emongolia.util.Constants;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "REQUEST", schema= "ITC_EMONGOLIA")
@SequenceGenerator(name = "RequestIdGenerator", sequenceName = "SEQ_REQUEST", allocationSize = 1)
public class Request implements Serializable {

    @Id
    @GeneratedValue(generator = "RequestIdGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

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
    @Column(name = "REG_NO")
    private String regNo;

    @Basic
    @Column(name = "ORG_ID")
    private Long orgId;

    @Basic
    @Column(name = "USER_ID")
    private Long userId;

    @Basic
    @Column(name = "URL")
    private String url;

    @Basic
    @Column(name = "REQUEST_BODY")
    private String requestBody;
}
