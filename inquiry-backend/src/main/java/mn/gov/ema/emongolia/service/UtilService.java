package mn.gov.ema.emongolia.service;

import lombok.extern.java.Log;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@Log
public class UtilService {
    public ResponseEntity restTemplateRequest(String theUrl, String token) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            HttpHeaders headers = createHttpHeaders(token);
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            List<String> res = new ArrayList<>();
            return restTemplate.exchange(theUrl, HttpMethod.GET, entity, Object.class);
        }
        catch (Exception e) {
//            log.log(Level.SEVERE, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    private HttpHeaders createHttpHeaders(String taisToken)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + taisToken);
        return headers;
    }
    public static boolean isNullOrEmpty(Object value) {
        return value == null || convertToStringLower(value) == "" || convertToStringLower(value).equals("null");
    }
    public static String convertToStringLower(Object value) {
        return convertToString(value).toLowerCase();
    }
    public static String convertToString(Object value) {
        return value == null ? "" : value.toString();
    }
}
