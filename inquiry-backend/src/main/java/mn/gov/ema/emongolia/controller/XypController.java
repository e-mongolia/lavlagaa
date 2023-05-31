package mn.gov.ema.emongolia.controller;

import mn.gov.ema.emongolia.data.dao.OrganizationDAO;
import mn.gov.ema.emongolia.data.model.OtpModel;
import mn.gov.ema.emongolia.service.UserService;
import mn.gov.ema.emongolia.service.XypService;
import mn.gov.ema.emongolia.tools.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/xyp")
public class XypController {

    @Autowired
    XypService xypService;

    @Autowired
    UserService userService;

    @Autowired
    OrganizationDAO organizationDAO;

    @GetMapping("/getCitizenData")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity getCitizenData(@RequestParam(name = "regnum", required = false) String regnum,
                                         @RequestParam(name = "civilId", required = false)  String civilId) throws UserNotFoundException, UnsupportedEncodingException {
        return ResponseEntity.ok(xypService.getCitizenDataNew((regnum != null ? regnum : null), (civilId != null ? civilId : null)));
    }
//
//    @GetMapping("/getCitizenBirthInfo")
//    @PreAuthorize("isAuthenticated()")
//    public ResponseEntity getCitizenBirthInfo(@RequestHeader("Authorization") String token,
//                                              @RequestParam(name = "regnum", required = false) String regnum,
//                                              @RequestParam(name = "civilId", required = false)  String civilId,
//                                              @RequestParam(name = "otp", required = false)  Long otp) throws UserNotFoundException, UnsupportedEncodingException {
//        ImsToken imsToken =  userService.verifyToken(token.substring(7));
//        Organization organization = organizationDAO.findFirstByIdAndStatus(imsToken.getUserInfo().getOrgId(), 1L);
//        return ResponseEntity.ok(xypService.getCitizenBirthInfo((regnum != null ? regnum : null), (civilId != null ? civilId : null), organization, otp));
//    }
//
//    @GetMapping("/getCitizenMarriageInfo")
//    @PreAuthorize("isAuthenticated()")
//    public ResponseEntity getCitizenMarriageInfo(@RequestHeader("Authorization") String token,
//                                                 @RequestParam(name = "regnum", required = false) String regnum,
//                                                 @RequestParam(name = "civilId", required = false)  String civilId) throws UserNotFoundException, UnsupportedEncodingException {
//        ImsToken imsToken =  userService.verifyToken(token.substring(7));
//        Organization organization = organizationDAO.findFirstByIdAndStatus(imsToken.getUserInfo().getOrgId(), 1L);
//        return ResponseEntity.ok(xypService.getCitizenMarriageInfo((regnum != null ? regnum : null), (civilId != null ? civilId : null), organization));
//    }
//
//    @GetMapping("/getCitizenNoMarriageInfo")
//    @PreAuthorize("isAuthenticated()")
//    public ResponseEntity getCitizenNoMarriageInfo(@RequestHeader("Authorization") String token,
//                                                   @RequestParam(name = "regnum", required = false) String regnum,
//                                                   @RequestParam(name = "civilId", required = false)  String civilId) throws UserNotFoundException, UnsupportedEncodingException {
//        ImsToken imsToken =  userService.verifyToken(token.substring(7));
//        Organization organization = organizationDAO.findFirstByIdAndStatus(imsToken.getUserInfo().getOrgId(), 1L);
//        return ResponseEntity.ok(xypService.getCitizenNoMarriageInfo((regnum != null ? regnum : null), (civilId != null ? civilId : null),organization));
//    }
//
//    @GetMapping("/getCitizenRegnumInfo")
//    @PreAuthorize("isAuthenticated()")
//    public ResponseEntity getCitizenRegnumInfo(@RequestHeader("Authorization") String token,
//                                               @RequestParam(name = "regnum", required = false) String regnum,
//                                               @RequestParam(name = "civilId", required = false)  String civilId) throws UserNotFoundException, UnsupportedEncodingException {
//        ImsToken imsToken =  userService.verifyToken(token.substring(7));
//        Organization organization = organizationDAO.findFirstByIdAndStatus(imsToken.getUserInfo().getOrgId(), 1L);
//        return ResponseEntity.ok(xypService.getCitizenRegnumInfo((regnum != null ? regnum : null), (civilId != null ? civilId : null), organization));
//    }
//
//    @GetMapping("/getCitizenAddressInfo")
//    @PreAuthorize("isAuthenticated()")
//    public ResponseEntity getCitizenAddressInfo(@RequestHeader("Authorization") String token,
//                                                @RequestParam(name = "regnum", required = false) String regnum,
//                                                @RequestParam(name = "civilId", required = false)  String civilId) throws UserNotFoundException, UnsupportedEncodingException {
//        ImsToken imsToken =  userService.verifyToken(token.substring(7));
//        Organization organization = organizationDAO.findFirstByIdAndStatus(imsToken.getUserInfo().getOrgId(), 1L);
//        return ResponseEntity.ok(xypService.getCitizenAddressInfo((regnum != null ? regnum : null), (civilId != null ? civilId : null), organization));
//    }
//
//    @GetMapping("/getCitizenSalaryInfo")
//    @PreAuthorize("isAuthenticated()")
//    public ResponseEntity getCitizenSalaryInfo(@RequestHeader("Authorization") String token,
//                                               @RequestParam(name = "regnum", required = false) String regnum,
//                                               @RequestParam(name = "startYear", required = false)  Integer startYear,
//                                               @RequestParam(name = "endYear", required = false)  Integer endYear) throws UserNotFoundException, UnsupportedEncodingException {
//        ImsToken imsToken =  userService.verifyToken(token.substring(7));
//        Organization organization = organizationDAO.findFirstByIdAndStatus(imsToken.getUserInfo().getOrgId(), 1L);
//        return ResponseEntity.ok(xypService.getCitizenSalaryInfo(regnum, startYear, endYear, organization));
//    }
//
//    @GetMapping("/getDriverLicenseInfo")
//    @PreAuthorize("isAuthenticated()")
//    public ResponseEntity getDriverLicenseInfo(@RequestParam(name = "regnum", required = false) String regnum,
//                                               @RequestParam(name = "orgId", required = false) Long orgId)
//    {
//        Organization organization = organizationDAO.findFirstByIdAndStatus(orgId, 1L);
//        return ResponseEntity.ok(xypService.getDriverLicenseInfo(regnum, organization));
//    }
//
//    @GetMapping("/getInsuranceFee")
//    @PreAuthorize("isAuthenticated()")
//    public ResponseEntity getInsuranceFee(@RequestParam(name = "regnum", required = false) String regnum,
//                                               @RequestParam(name = "orgId", required = false) Long orgId)
//    {
//        Organization organization = organizationDAO.findFirstByIdAndStatus(orgId, 1L);
//        return ResponseEntity.ok(xypService.getInsuranceFee(regnum, organization));
//    }
//
//    @GetMapping("/getLegalEntityInfo")
//    public ResponseEntity getLegalEntityInfo(@RequestParam(name = "regnum", required = false) String regnum,
//                                             @RequestParam(name = "legalEntityNumber", required = false) String legalEntityNumber,
//                                             @RequestParam(name = "orgId", required = false) Long orgId)
//    {
//        Organization organization = organizationDAO.findFirstByIdAndStatus(orgId, 1L);
//        return ResponseEntity.ok(xypService.getLegalEntityInfo(regnum, Integer.valueOf(legalEntityNumber), organization));
//    }
//
//    @GetMapping("/getOrganizationInfo")
//    public ResponseEntity getOrganizationInfo(@RequestParam(name = "companyRegnum", required = false) String companyRegnum,
//                                              @RequestParam(name = "forUsage", required = false) String forUsage,
//                                              @RequestParam(name = "usage", required = false) String usage,
//                                              @RequestParam(name = "year", required = false) Integer year,
//                                              @RequestParam(name = "regnum", required = false) String regnum,
//                                              @RequestParam(name = "orgId", required = false) Long orgId)
//    {
//        Organization organization = organizationDAO.findFirstByIdAndStatus(orgId, 1L);
//        return ResponseEntity.ok(xypService.getOrganizationInfo(companyRegnum, forUsage, usage, year, regnum, organization));
//    }

    @PostMapping("/requestOtp")
    public ResponseEntity registerOTPRequest(@RequestBody OtpModel model)
    {
        return ResponseEntity.ok(xypService.registerOTPRequest(model));
    }

    @GetMapping("/checkOtp")
    public ResponseEntity checkOtp(@RequestParam(name = "regnum", required = false) String regnum,
                                   @RequestParam(name = "otp", required = false) String otp,
                                   @RequestParam(name = "orgId", required = false) Long orgId)
    {
        return ResponseEntity.ok(xypService.checkOtp(regnum, otp, orgId));
    }
}
