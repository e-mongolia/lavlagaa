package mn.gov.ema.emongolia.controller;

import mn.gov.ema.emongolia.data.dao.OrganizationDAO;
import mn.gov.ema.emongolia.data.entity.ReferenceEmon;
import mn.gov.ema.emongolia.service.GeneralService;
import mn.gov.ema.emongolia.service.UserService;
import mn.gov.ema.emongolia.service.XypService;
import mn.gov.ema.emongolia.tools.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequestMapping("/general")
public class GenaralController {

    @Autowired
    GeneralService generalService;

    @Autowired
    XypService xypService;

    @Autowired
    UserService userService;

    @Autowired
    OrganizationDAO organizationDAO;

    @GetMapping("/checkConfig")
    ResponseEntity checkConfig(){
        return ResponseEntity.ok(generalService.checkConfig());
    }

    @PostMapping(path="/saveRequest")
    public ResponseEntity saveRequest(@RequestParam String regNum,
                                      @RequestParam String legalEntityNumber,
                                      @RequestParam String orgUuid,
                                      @RequestParam Long otp,
                                      @RequestParam(value = "invoiceNo", required = false) String invoiceNo,
                                      @RequestBody List<ReferenceEmon> serviceList,
                                      HttpServletRequest httpServletRequest){
        return ResponseEntity.ok(generalService.saveRequest(regNum, legalEntityNumber, orgUuid, serviceList, otp,invoiceNo, httpServletRequest));
    }

    @GetMapping("/getAllReference")
    ResponseEntity getAllReference(){
        return ResponseEntity.ok(generalService.getAllReference());
    }

    @GetMapping("/getAllTags")
    ResponseEntity getAllTags(){
        return ResponseEntity.ok(generalService.getAllTags());
    }

    @GetMapping(path = "/getPdf")
    public ResponseEntity getPdf(@RequestParam("serviceId") Long serviceId) {
        return ResponseEntity.ok(generalService.getPdf(serviceId));
    }

    @GetMapping(path = "/getPdfExternal")
    public ResponseEntity<?> getPdf(@RequestParam("regno") String regno,
                                    @RequestParam("type") Long type) {
        return generalService.getPdfExternal(regno, type);
    }

    @PostMapping("/setConfig")
    ResponseEntity setConfig(@RequestParam(value="orgId") Long orgId,
                             @RequestParam(value="accessToken") String accessToken,
                             @RequestParam(value="password") String password,
                             @RequestParam(value="alias") String alias,
                             @RequestParam("certFile") MultipartFile certFile) throws IOException {
        return ResponseEntity.ok(generalService.setConfig(orgId, accessToken, password, alias, certFile));
    }

    @GetMapping("/getConfigInfo")
    public ResponseEntity getConfigInfo(@RequestParam(name = "orgId") Long orgId){
        return ResponseEntity.ok(generalService.getConfigInfo(orgId));
    }

//    @PostMapping("/createEnquiryInvoice")
//    public ResponseEntity createEnquiryInvoice(@RequestParam(name = "regno") String regno,
//                                               @RequestParam(name = "serviceCode") String serviceCode,
//                                               @RequestBody ReferenceEmon referenceEmon,
//                                               @RequestHeader("Authorization") String token) throws UserNotFoundException, UnsupportedEncodingException, ParseException {
//        ImsToken imsToken =  userService.verifyToken(token.substring(7));
//        return ResponseEntity.ok(generalService.createEnquiryInvoice(regno, serviceCode, referenceEmon, imsToken));
//    }

    @GetMapping("/checkEnquiryInvoice")
    public ResponseEntity checkEnquiryInvoice(@RequestParam(name = "invoiceCode") String invoiceCode,
                                              @RequestParam(name = "rdId") Long rdId){
        return ResponseEntity.ok(generalService.checkEnquiryInvoice(invoiceCode, rdId));
    }

    @PostMapping("/getRequestList")
    public ResponseEntity getRequestList(@RequestParam(value = "page") int page,
                                      @RequestParam(value = "size") int size,
                                      @RequestParam(value = "sort",required = false) String sort,
                                      @RequestBody List<String> filters) throws UserNotFoundException, UnsupportedEncodingException {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(generalService.getRequestList(pageable, filters, sort));
    }

    @PostMapping("/getOutLinkData")
    public ResponseEntity getOutLinkData(@RequestBody List<String> links){
        return generalService.getOutLinkData(links);
    }
}
