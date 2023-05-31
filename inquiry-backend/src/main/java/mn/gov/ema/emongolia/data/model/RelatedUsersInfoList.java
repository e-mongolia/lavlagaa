package mn.gov.ema.emongolia.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RelatedUsersInfoList {
    private List<RelatedUsersInfo> listData;
}
