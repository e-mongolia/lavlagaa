package mn.gov.ema.emongolia.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import mn.gov.ema.emongolia.util.Constants;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "USER_ROLE", schema= "ITC_EMONGOLIA")
@SequenceGenerator(name = "SeqUserRoleGenerator", sequenceName = "SEQ_USER_ROLE", allocationSize = 1)
public class UserRole {
    @Id
    @GeneratedValue(generator = "SeqUserRoleGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "USER_ID")
    private Long userId;

    @Basic
    @Column(name = "ROLE_ID")
    private Long roleId;

    @Basic
    @Column(name = "ORG_ID")
    private Long orgId;

    @Basic
    @Column(name = "STATUS")
    private Long status;

    @Basic
    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Basic
    @Column(name = "CREATED_DATE")
    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.MGL_TIME_ZONE)
    private Date createdDate;

    @Basic
    @Column(name = "UPDATED_BY")
    private Long updatedBy;

    @Basic
    @Column(name = "UPDATED_DATE")
    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.MGL_TIME_ZONE)
    private Date updatedDate;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "ROLE_ID", referencedColumnName = "ID")
    @NotFound(action = NotFoundAction.IGNORE)
    private Role role;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "ORG_ID", referencedColumnName = "ID")
    @NotFound(action = NotFoundAction.IGNORE)
    private Organization org;

    @Basic
    @Column(name = "ACTIVE_FLAG")
    private Long activeFlag;

    @Basic
    @Column(name = "VERSION")
    private Long version;
}
