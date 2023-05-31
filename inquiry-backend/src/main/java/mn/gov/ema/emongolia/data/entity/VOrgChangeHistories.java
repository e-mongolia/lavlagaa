package mn.gov.ema.emongolia.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import mn.gov.ema.emongolia.util.Constants;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "V_ORG_CHANGE_HISTORIES", schema = "ITC_EMONGOLIA")
public class VOrgChangeHistories {

    @Id
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "CREATED_DATE")
    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.MGL_TIME_ZONE)
    private Date createdDate;

    @Basic
    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Basic
    @Column(name = "ORG_NAME")
    private String orgName;

    @Basic
    @Column(name = "BRANCH_NAME")
    private String branchName;

    @Basic
    @Column(name = "FIRSTNAME")
    private String firstName;

    @Basic
    @Column(name = "USER_ID")
    private Long userId;
}
