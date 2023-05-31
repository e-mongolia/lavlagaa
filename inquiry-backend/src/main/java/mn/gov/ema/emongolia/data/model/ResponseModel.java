package mn.gov.ema.emongolia.data.model;

import lombok.Data;

@Data
public class ResponseModel {
    private String serviceId;
    private String serviceRequestId;
    private Long xypResultCode;
    private Object xypData;
    private String createdDate;
    private Object citizen;
}
