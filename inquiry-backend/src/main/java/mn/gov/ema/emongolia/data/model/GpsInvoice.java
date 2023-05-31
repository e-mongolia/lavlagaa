package mn.gov.ema.emongolia.data.model;

import lombok.Data;

import java.util.Date;

@Data
public class GpsInvoice {
    private String qpay;
    private String msg;
    private String socialPay;
    private String invoiceCode;
    private String bankName;
    private String tranId;
    private Date payedDate;
    private String posRno;
    private String lotteryNo;
    private int amount;
    private int vamount;
    private String accountNo;
    private String accountName;
    private int code;
}
