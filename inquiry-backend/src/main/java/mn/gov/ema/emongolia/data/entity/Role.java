package mn.gov.ema.emongolia.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ROLE", schema= "ITC_EMONGOLIA")
@SequenceGenerator(name = "RequestIdGenerator", sequenceName = "SEQ_REQUEST", allocationSize = 1)
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(generator = "RequestIdGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "ROLE")
    private String role;

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "STATUS")
    private Long status;

    @Basic
    @Column(name = "TYPE")
    private String type;

}
