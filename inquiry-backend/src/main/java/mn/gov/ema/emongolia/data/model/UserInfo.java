package mn.gov.ema.emongolia.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private Long userId;
    private String regNo;
    private String firstname;
    private String lastname;
    private Long orgId;
    private Long parentOrgId;
    private String orgName;
    private String orgPin;
    private Long isOTP;
    private Long roleId;
    private String roleCode;
    private String orgUuid;
    private Long status;
    private Long isKiosk;
}
