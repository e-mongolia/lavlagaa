package mn.gov.ema.emongolia.data.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import mn.gov.ema.emongolia.util.Constants;

import java.util.Date;

@Data
public class RefPayableServiceModel {
    private Long id;
    private String serviceOrgName;
    private String serviceName;
    private Long payableAmount;
    private Long bankId;
    private Long branchId;
    private Long subBranchId;
    private String statePin;
    private String stateName;
    private Long payAccountId;
    private String serviceCode;
    private Long createdBy;
    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.MGL_TIME_ZONE)
    private Date createdDate;
    private Long updatedBy;
    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.MGL_TIME_ZONE)
    private Date updatedDate;
    private Long version;
    private Long accessLevel;
    private Long activeFlag;
    private Long actionFlag;
    private Long status;
}
