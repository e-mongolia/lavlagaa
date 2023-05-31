package mn.gov.ema.emongolia.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created by Ochirpurev Davaajav /Д.Очирпүрэв/
 * Date: 2018/02/07 7:49 PM
 */
@Data
public class CreateReceiptReg implements Serializable {
    //@NotNull
    @Pattern(regexp = "(^[А-ЯЁӨҮ]{2}[0-9]{8}$)|(^\\d{7}$)|(^9911\\d{4}$)", message = "pin талбар буруу байна. Иргэний регистр эсвэл 7 оронтой тоон утга оруулна уу.")
    private String pin;

    @NotNull
    @Pattern(regexp = "(^[А-ЯЁӨҮ]{2}[0-9]{8}$)|(^\\d{7}$)|(^9911\\d{4}$)", message = "authorityPin талбар буруу байна. Иргэний регистр эсвэл 7 оронтой тоон утга оруулна уу.")
    private String authorityPin;

    @NotNull
    @Pattern(regexp = "^[12]$", message = "type талбар буруу байна. 11 эсвэл 14 оронтой тоон утга байна.")
    private String type;
    @Pattern(regexp = "^\\d{6,9}$", message = "taxTypeCode талбар буруу байна")
    private String taxTypeCode;
    @Pattern(regexp = "^\\d{1,100}$", message = "stateAccount талбар буруу байна.")
    private String stateAccount;


    @Pattern(regexp = "^\\d{2}$", message = "branchCode талбар буруу байна")
    private String branchCode;
    @Pattern(regexp = "^\\d{2,4}$", message = "subBranchCode талбар буруу байна")
    private String subBranchCode;
    @NotNull
    @Pattern(regexp = "^([1-9]\\d{0,15}|[0])\\.\\d{2}$", message = "amount талбар буруу байна. Таслалаас хойш 2 оронгийн нарийвчлал бүхий тоон утга байна.")
    private String amount;
    @NotNull
    @Pattern(regexp = "^[\\s\\S]{1,255}$", message = "description талбар буруу байна. 255-с хэтрэхгүй урттай тэмдэгт мөр оруулна уу.")
    private String description;
    @NotNull
    @Pattern(regexp = "^\\d{1,100}$", message = "phoneNo талбар буруу байна.")
    private String phoneNo;
}
