package mn.gov.ema.emongolia.model;

import lombok.Data;

@Data
public class CreateBranchModel {
    private Long parentId;
    private Long branchId;
    private String branchName;
    private Long status;
}
