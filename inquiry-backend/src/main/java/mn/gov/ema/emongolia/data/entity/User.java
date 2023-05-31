package mn.gov.ema.emongolia.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "USERS", schema= "ITC_EMONGOLIA")
@SequenceGenerator(name = "SeqUsersGenerator", sequenceName = "SEQ_USERS", allocationSize = 1)
public class User {
    @Id
    @GeneratedValue(generator = "SeqUsersGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "REG_NO")
    @NotNull
    private String regNo;

    @Basic
    @Column(name = "FIRSTNAME")
    @NotNull
    private String firstname;

    @Basic
    @Column(name = "LASTNAME")
    @NotNull
    private String lastname;

    @Basic
    @Column(name = "USERNAME")
    @NotNull
    private String username;

    @Basic
    @Column(name = "PASSWORD")
    @JsonIgnore
    private String password;

    @Basic
    @Column(name = "SALT")
    @JsonIgnore
    private String salt;

//    @Basic
//    @Column(name = "ORG_ID")
//    @NotNull
//    private Long orgId;
//
//    @Basic
//    @Column(name = "ROLE_ID")
//    @NotNull
//    private Long roleId;

    @Basic
    @Column(name = "STATUS")
    private Long status;

    @Basic
    @Column(name = "DEFAULT_PASSWORD")
    @JsonIgnore
    private String defaultPassword;

    @Basic
    @Column(name = "CIVIL_ID")
    private Long civilId;


//    @ManyToOne
//    @JoinColumn(insertable = false, updatable = false, name = "ORG_ID", referencedColumnName = "ID")
//    @NotFound(action = NotFoundAction.IGNORE)
//    private Organization org;

    @Transient
    private String statusName;

    @Transient
    private boolean isActive;

    @Transient
    private Long orgId;

    @Transient
    private Long roleId;

    @Transient
    private String roleCode;

    @Transient
    private Role role;
}
