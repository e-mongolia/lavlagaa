package mn.gov.ema.emongolia.data.model;

import lombok.Data;
import mn.gov.ema.emongolia.data.entity.ReferenceEmon;

import java.util.List;

@Data
public class GetRequestData {
    private Long orgId;
    private String orgName;
    private List<ReferenceEmon> serviceList;
}
