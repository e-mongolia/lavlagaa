package mn.gov.ema.emongolia.data.model;

import lombok.Data;
import mn.gov.ema.emongolia.data.entity.ReferenceEmon;

import java.util.List;

@Data
public class RequestModel {
    private Long requestId;
    private Long orgRegNo;
    private String regNo;
    private List<ReferenceEmon> requestWS;
}
