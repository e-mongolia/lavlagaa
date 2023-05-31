package mn.gov.ema.emongolia.feign;


import mn.gov.ema.emongolia.data.model.ResponseModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.HashMap;


@FeignClient(value = "eMongoliaPdf", url = "https://cdn.e-mongolia.mn/pdf-api/api/enquiry-pdf")
@Service
public interface EMongoliaPdfFeign {

    @PostMapping("/get-token")
    ResponseEntity<HashMap<String,String>> getToken(@RequestBody HashMap<String,String> model);

    @PostMapping("/create-external")
    ResponseEntity<HashMap<String,String>> getPdf(@RequestHeader(name = "x-auth-token") String xAuthToken,
                                                  @RequestBody ResponseModel responseModel);
}
