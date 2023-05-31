package mn.gov.ema.emongolia.controller;

import mn.gov.ema.emongolia.data.entity.User;
import mn.gov.ema.emongolia.model.CreateBranchModel;
import mn.gov.ema.emongolia.model.CreateOrgModel;
import mn.gov.ema.emongolia.model.LoginModel;
import mn.gov.ema.emongolia.model.PasswordModel;
import mn.gov.ema.emongolia.service.UserService;
import mn.gov.ema.emongolia.tools.CustomException;
import mn.gov.ema.emongolia.tools.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginModel loginModel) throws CustomException, UnsupportedEncodingException {
        return ResponseEntity.ok(userService.login(loginModel));
    }

    @GetMapping("/logout")
    public ResponseEntity logout(@RequestHeader("Authorization") String authorization) throws Exception {
        if (authorization.startsWith("Bearer")) {
            String token = authorization.substring(7);
            userService.removeToken(token);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/changePassword")
    public ResponseEntity changePassword(@RequestBody LoginModel loginModel) throws UnsupportedEncodingException {
        return ResponseEntity.ok(userService.changePassword(loginModel));
    }

    @PostMapping("/getUserList")
    public ResponseEntity getUserList(@RequestParam(value = "page") int page,
                                      @RequestParam(value = "size") int size,
                                      @RequestParam(value = "sort",required = false) String sort,
                                      @RequestBody List<String> filters) throws UserNotFoundException, UnsupportedEncodingException {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(userService.getUserList(pageable, filters, sort));
    }

    @PostMapping("/getOrgList")
    public ResponseEntity getOrgList(@RequestParam(value = "page") int page,
                                     @RequestParam(value = "size") int size,
                                     @RequestParam(value = "sort",required = false) String sort,
                                     @RequestBody List<String> filters){
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(userService.getOrgList(pageable, filters, sort));
    }

    @PostMapping("/getAllOrgList")
    public ResponseEntity getAllOrgList(@RequestParam(value = "page") int page,
                                     @RequestParam(value = "size") int size,
                                     @RequestParam(value = "sort",required = false) String sort,
                                     @RequestBody List<String> filters){
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(userService.getOrgList(pageable, filters, sort));
    }

    @PostMapping("/createNewUser")
    public ResponseEntity createNewUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createNewUser(user));
    }

    @PostMapping("/createNewOrg")
    public ResponseEntity createNewOrg(@RequestBody CreateOrgModel createOrgModel) {
        return ResponseEntity.ok(userService.createNewOrg(createOrgModel));
    }

    @PostMapping("/createNewBranch")
    public ResponseEntity createNewBranch(@RequestBody CreateBranchModel branch) {
        return ResponseEntity.ok(userService.createNewBranch(branch));
    }

    @PostMapping("/editBranch")
    public ResponseEntity editBranch(@RequestBody CreateBranchModel branch) {
        return ResponseEntity.ok(userService.editBranch(branch));
    }

    @PostMapping("/changeUserStatus")
    public ResponseEntity changeUserStatus(@RequestParam Long userId , @RequestParam Boolean active) throws UnsupportedEncodingException {
        return ResponseEntity.ok(userService.changeUserStatus(userId, active));
    }

    @PostMapping("/changeUserStatusAndBranch")
    public ResponseEntity changeUserStatusAndBranch(@RequestParam Long userId , @RequestParam Boolean active, @RequestParam Long orgId) throws UnsupportedEncodingException {
        return ResponseEntity.ok(userService.changeUserStatusAndBranch(userId, active, orgId));
    }



    @PostMapping("/changeOrgStatus")
    public ResponseEntity changeOrgStatus(@RequestParam Long orgId , @RequestParam Boolean active) throws UnsupportedEncodingException {
        return ResponseEntity.ok(userService.changeOrgStatus(orgId, active));
    }

    @GetMapping("/checkKiosk")
    public ResponseEntity checkKiosk(@RequestParam String kioskUuid) throws UnsupportedEncodingException {
        return ResponseEntity.ok(userService.checkKiosk(kioskUuid));
    }

    @GetMapping("/getChangeHistories")
    public ResponseEntity getChangeHistories(@RequestParam Long userId) throws UnsupportedEncodingException {
        return ResponseEntity.ok(userService.getChangeHistories(userId));
    }

    @PostMapping("/resetPassword")
    public ResponseEntity login(@RequestBody PasswordModel passwordModel) throws CustomException, UnsupportedEncodingException {
        return ResponseEntity.ok(userService.resetPassword(passwordModel));
    }
}
