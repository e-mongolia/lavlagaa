package mn.gov.ema.emongolia.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import mn.gov.ema.emongolia.util.Constants;

import java.io.Serializable;
import java.util.Date;

@Data
public class CreatReceiptResponse implements Serializable {
    private String invoiceNo;
    private String invoiceType;
    @JsonFormat(pattern = Constants.DATE_PATTERN, timezone = Constants.MGL_TIME_ZONE)
    private Date createdDate;
}
