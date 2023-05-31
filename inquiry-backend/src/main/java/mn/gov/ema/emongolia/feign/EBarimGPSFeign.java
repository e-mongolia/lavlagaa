package mn.gov.ema.emongolia.feign;


import mn.gov.ema.emongolia.model.EnquiryInvoiceModel;
import mn.gov.ema.emongolia.data.model.GpsInvoice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


//@FeignClient(value = "eBarimtGPS", url = "https://st-mobile.ebarimt.mn/rest/gpservice")
@FeignClient(value = "eBarimtGPS", url = "${ebarimtGpsService}")
@Service
public interface EBarimGPSFeign {

    @PostMapping("/createEnquiryInvoice")
    ResponseEntity<GpsInvoice> createEnquiryInvoice(@RequestParam(name = "token") String token,
                                                    @RequestBody EnquiryInvoiceModel model);

    @GetMapping("/stateEnquiryInvoice")
    ResponseEntity<GpsInvoice> stateEnquiryInvoice(@RequestParam(name = "invoiceCode") String invoiceCode,
                                                   @RequestParam(name = "token") String token);
}
