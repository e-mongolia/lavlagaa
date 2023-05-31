package mn.gov.ema.emongolia.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExternaPdf {
    private Long status;
    private byte[] datas;
}
