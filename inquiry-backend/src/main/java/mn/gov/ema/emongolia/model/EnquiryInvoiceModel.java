package mn.gov.ema.emongolia.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class EnquiryInvoiceModel implements Serializable {

    private String accountNo;
    private String accountName;
    private String bankCode;
    private String invoiceNo;
    private String regno;
    private String code;

}
