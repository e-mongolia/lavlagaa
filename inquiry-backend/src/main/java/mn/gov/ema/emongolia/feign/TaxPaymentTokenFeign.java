package mn.gov.ema.emongolia.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.HashMap;


@FeignClient(value = "taxPaymentTokenFeign", url = "${taxPaymentTokenFeignUrl}")
@Service
public interface TaxPaymentTokenFeign {
    @PostMapping("/token/getToken")
    ResponseEntity<String> getToken(@RequestBody HashMap<String,String> model);
}
