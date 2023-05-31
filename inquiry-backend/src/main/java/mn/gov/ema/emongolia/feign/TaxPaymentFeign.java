package mn.gov.ema.emongolia.feign;


import mn.gov.ema.emongolia.model.CreateReceiptReg;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import java.util.HashMap;


@FeignClient(value = "taxPaymentFeign", url = "${taxPaymentFeignUrl}")
@Service
public interface TaxPaymentFeign {
    @PostMapping("/v2/createReceiptByReg")
    ResponseEntity<HashMap<String,String>> createReceiptByReg(@RequestHeader("Authorization") String authorization,
                                                            @RequestBody @Valid CreateReceiptReg responseModel);

}
