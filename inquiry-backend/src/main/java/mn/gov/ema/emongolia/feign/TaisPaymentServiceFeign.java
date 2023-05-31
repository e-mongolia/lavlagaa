package mn.gov.ema.emongolia.feign;


import mn.gov.ema.emongolia.data.model.RefPayableServiceModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(value = "tais-payment-service", url = "https://st-tais.mta.mn/rest/tais-payment-service/tpiEnquiry")
//@FeignClient(value = "tais-payment-service", url = "http://172.16.18.78:8308/tpiEnquiry")
@Service
public interface TaisPaymentServiceFeign {

    @GetMapping("/refPayableService")
    ResponseEntity<List<RefPayableServiceModel>> refPayableService(@RequestParam(value = "serviceCode") String serviceCode,
                                                                   @RequestParam(value = "branchId") Long branchId);
}
