package mn.gov.ema.emongolia.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "REQUEST_DETAIL", schema= "ITC_EMONGOLIA")
@SequenceGenerator(name = "RequestDetailIdGenerator", sequenceName = "SEQ_REQUEST_DETAIL", allocationSize = 1)
public class RequestDetail implements Serializable {
    @Id
    @GeneratedValue(generator = "RequestDetailIdGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "REQUEST_ID")
    private Long requestId;

    @Basic
    @Column(name = "SERVICE_ID")
    private Long serviceId;

    @Basic
    @Column(name = "RESPONSE_LINK")
    private String responseLink;

    @Basic
    @Column(name = "STATUS")
    private Long status;

    @Basic
    @Column(name = "RESPONSE_BODY")
    private String responseBody;

}
