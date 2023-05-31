package mn.gov.ema.emongolia.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ORGANIZATION", schema= "ITC_EMONGOLIA")
@SequenceGenerator(name = "OrganizationIdGenerator", sequenceName = "SEQ_ORGANIZATION", allocationSize = 1)

public class Organization {
    @Id
    @GeneratedValue(generator = "OrganizationIdGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "ORG_NAME")
    private String orgName;

    @Basic
    @Column(name = "STATUS")
    private Long status;

    @Basic
    @Column(name = "ORG_PIN")
    private String orgPin;

    @Basic
    @Column(name = "ORG_TYPE")
    private Long orgType;

    @Basic
    @Column(name = "UUID")
    private String uuid;

    @Basic
    @Column(name = "ACCESS_TOKEN")
    @JsonIgnore
    private String accessToken;

    @Basic
    @Column(name = "KEY")
    @JsonIgnore
    private String key;

    @Basic
    @Column(name = "IP_ADDRESS")
    private String ipAddress;

    @Basic
    @Lob
    @Column(name = "CERT_FILE")
    @JsonIgnore
    private byte[] certFile;

    @Basic
    @Column(name = "ALIAS")
    @JsonIgnore
    private String alias;

    @Basic
    @Column(name = "IS_KIOSK")
    private Long isKiosk;

    @Basic
    @Column(name = "IS_OTP")
    private Long isOTP;

    @Basic
    @Column(name = "PARENT_ID")
    private Long parentId;

    @Basic
    @Column(name = "ACTIVE_FLAG")
    private Long activeFlag;

    @Basic
    @Column(name = "VERSION")
    private Long version;

    @Transient
    private String statusName;

    @Transient
    private boolean isActive;
}
