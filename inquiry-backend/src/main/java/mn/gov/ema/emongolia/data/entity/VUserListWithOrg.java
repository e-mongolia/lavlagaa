package mn.gov.ema.emongolia.data.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "V_USER_LIST_WITH_ORG", schema = "ITC_EMONGOLIA")
public class VUserListWithOrg {
    @Id
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "FIRSTNAME")
    private String firstname;

    @Basic
    @Column(name = "REG_NO")
    private String regNo;

    @Basic
    @Column(name = "STATUS")
    private Long status;

    @Basic
    @Column(name = "USERNAME")
    private String username;

    @Basic
    @Column(name = "PASSWORD")
    private String password;

    @Basic
    @Column(name = "LASTNAME")
    private String lastname;

    @Basic
    @Column(name = "SALT")
    private String salt;

    @Basic
    @Column(name = "DEFAULT_PASSWORD")
    private String defaultPassword;

    @Basic
    @Column(name = "CIVIL_ID")
    private Long civilId;

    @Basic
    @Column(name = "ORG_ID")
    private Long orgId;

    @Basic
    @Column(name = "ORG_NAME")
    private String orgName;

    @Basic
    @Column(name = "BRANCH_NAME")
    private String branchName;

    @Basic
    @Column(name = "ROLE_ID")
    private Long roleId;

    @Basic
    @Column(name = "PARENT_ID")
    private Long parentId;

    @Transient
    private String statusName;

    @Transient
    private boolean isActive;

    @Transient
    private String roleCode;

    @Transient
    private Role role;

}
