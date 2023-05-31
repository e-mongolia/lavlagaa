package mn.gov.ema.emongolia.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "REFERENCE_TAG", schema= "ITC_EMONGOLIA")

public class ReferenceTag {

    @Id
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "CODE")
    private String code;
    ;

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "STATUS")
    private Long status;

    @Basic
    @Column(name = "TYPE")
    private String type;

    @Basic
    @Column(name = "IS_HIDDEN")
    private Long isHidden;

    @Transient
    private String value;
}
