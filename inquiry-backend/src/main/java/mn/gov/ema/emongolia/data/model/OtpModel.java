package mn.gov.ema.emongolia.data.model;

import lombok.Data;

@Data
public class OtpModel {
    private String regnum;
    private Integer isSms;
    private Integer isApp;
    private Integer isEmail;
    private Integer isKiosk;
    private String jsonWSList;
    private String orgUuid;
    private Integer phoneNum;
}
