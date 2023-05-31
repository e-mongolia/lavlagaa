package mn.gov.ema.emongolia.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ServResponse {
    private Long status;
    private String message;
    private Object data;
}
