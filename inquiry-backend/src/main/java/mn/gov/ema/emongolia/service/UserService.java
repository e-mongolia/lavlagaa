package mn.gov.ema.emongolia.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.java.Log;
import mn.gov.ema.emongolia.data.dao.*;
import mn.gov.ema.emongolia.data.entity.*;
import mn.gov.ema.emongolia.model.*;
import mn.gov.ema.emongolia.security.UserUtil;
import mn.gov.ema.emongolia.tools.*;
import mn.gov.itc.emongolia.data.dao.*;
import mn.gov.itc.emongolia.data.entity.*;
import mn.gov.ema.emongolia.data.model.UserInfo;
import mn.gov.ema.emongolia.data.redis.dao.ImsTokenDAO;
import mn.gov.ema.emongolia.data.redis.entity.ImsToken;
import mn.gov.itc.emongolia.model.*;
import mn.gov.itc.emongolia.tools.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Log
public class UserService {

    @Autowired
    UserDAO userDAO;

    @Autowired
    OrganizationDAO organizationDAO;

    @Autowired
    ImsTokenDAO imsTokenDAO;

    @Autowired
    UserRoleDAO userRoleDAO;

    @Autowired
    RoleDAO roleDAO;

    @Autowired
    VOrgChangedHistoriesDAO vOrgChangedHistoriesDAO;

    @PersistenceContext
    EntityManager em;

    private Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
    private String signature = "07cfeaa8b5cd461a9c2028b45ac70dc1";

    public Page getUserList(Pageable pageable, List<String> filters, String sort) throws UserNotFoundException, UnsupportedEncodingException {

        ImsToken imsToken = this.getLoggedUserInfo();
        List<VUserListWithOrg> userList = new ArrayList<>();

        Query runQuery = null;
        Query runCountQuery = null;
        Field[] fields = VUserListWithOrg.class.getDeclaredFields();
        if (imsToken.getUserInfo().getRoleId().equals(1L)) {
            runQuery = em.createNativeQuery(
                    "SELECT V.* FROM V_USER_LIST_WITH_ORG V WHERE 1=1 "
                    + Tools.generateQueryFilter(fields, filters, "V")
                    + Tools.generateQuerySort(fields, sort, "V"), VUserListWithOrg.class);
            runCountQuery = em.createNativeQuery(
                    "SELECT COUNT(V.ID) FROM V_USER_LIST_WITH_ORG V WHERE 1=1 "
                    + Tools.generateQueryFilter(fields, filters, "V")
                    + Tools.generateQuerySort(fields, sort, "V"));
        } else {
            runQuery = em.createNativeQuery(
                    "SELECT V.* FROM V_USER_LIST_WITH_ORG V WHERE (V.ORG_ID = "
                    + imsToken.getUserInfo().getOrgId() + " OR V.PARENT_ID = " +  imsToken.getUserInfo().getOrgId() + " ) "
                    + Tools.generateQueryFilter(fields, filters, "V")
                    + Tools.generateQuerySort(fields, sort, "V"), VUserListWithOrg.class);
            runCountQuery = em.createNativeQuery(
                    "SELECT COUNT(V.ID) FROM V_USER_LIST_WITH_ORG V WHERE (V.ORG_ID = "
                    + imsToken.getUserInfo().getOrgId() + " OR V.PARENT_ID = " +  imsToken.getUserInfo().getOrgId()+ " ) "
                    + Tools.generateQueryFilter(fields, filters, "V")
                    + Tools.generateQuerySort(fields, sort, "V"));
        }

        runQuery.setFirstResult((pageable.getPageNumber()) * pageable.getPageSize());
        runQuery.setMaxResults(pageable.getPageSize());
        userList = runQuery.getResultList();

        userList.forEach(user -> {
            List<Role> roles = roleDAO.findAllByTypeIn(Arrays.asList("ENQUIRY"));
            List<UserRole> userRoles = userRoleDAO.findByUserIdAndRoleIdInAndActiveFlag(user.getId(),roles.stream().map(Role::getId).collect(Collectors.toList()),1L);
            if (!userRoles.isEmpty()) {
                Role roleFound = roles.stream().filter(role -> role.getId().equals(userRoles.get(0).getRoleId())).findFirst().orElse(null);
                user.setRole(roleFound);
                if(userRoles.get(0).getStatus().equals(1L)){
                    user.setStatusName("Идэвхитэй");
                    user.setActive(true);
                } else {
                    user.setStatusName("Идэвхигүй");
                    user.setActive(false);
                }
            } else {
                user.setStatusName("Идэвхигүй");
                user.setActive(false);
            }

        });

        BigDecimal totalCount =  (BigDecimal) runCountQuery.getSingleResult();
        Page page = new PageImpl<VUserListWithOrg>(userList,pageable,totalCount.intValue());
        return page;
    }

    public Page getOrgList(Pageable pageable, List<String> filters, String sort){
        List<Organization> orgList = new ArrayList<>();

        Field[] fields = Organization.class.getDeclaredFields();
        Query runQuery = em.createNativeQuery(
                "SELECT ORG.* FROM ITC_EMONGOLIA.ORGANIZATION ORG WHERE ORG.ORG_TYPE IN (0,1) AND ORG.ACTIVE_FLAG = 1 "
                + Tools.generateQueryFilter(fields, filters, "ORG")
                + Tools.generateQuerySort(fields, sort, "ORG"), Organization.class);
        runQuery.setFirstResult((pageable.getPageNumber()) * pageable.getPageSize());
        runQuery.setMaxResults(pageable.getPageSize());
        orgList = runQuery.getResultList();

        orgList.forEach(org -> {
            if(org.getStatus().equals(1L)){
                org.setStatusName("Идэвхитэй");
                org.setActive(true);
            }else{
                org.setStatusName("Идэвхигүй");
                org.setActive(false);
            }
        });

        Query runCountQuery = em.createNativeQuery(
                "SELECT count(ORG.ID) FROM ITC_EMONGOLIA.ORGANIZATION ORG WHERE ORG.ORG_TYPE IN (0,1) AND ORG.ACTIVE_FLAG = 1 "
                + Tools.generateQueryFilter(fields, filters, "ORG")
                + Tools.generateQuerySort(fields, sort, "ORG"));
        BigDecimal totalCount =  (BigDecimal) runCountQuery.getSingleResult();

        Page page = new PageImpl<Organization>(orgList,pageable,totalCount.intValue());
        return page;
    }

    @Transactional
    public ServResponse createNewUser(User user) {
        User foundUser = userDAO.findByUsernameAndStatus(user.getRegNo(), 1L);
        if(!Tools.isNullOrEmpty(foundUser)) {
            List<UserRole> foundRoles = userRoleDAO.findByUserIdAndActiveFlag(foundUser.getId(), 1L);
            if(!Tools.isNullOrEmptyList(foundRoles)) {
                if(foundRoles.size() > 0 && foundRoles.stream().filter(it -> it.getStatus() == 1).collect(Collectors.toList()).size() > 0) {
                    return new ServResponse(500L, user.getRegNo()+ " хэрэглэгч бүртгэлтэй байна", null);
                }
                // Дахин сэргээх боломжгүй болгоно
                foundUser.setStatus(2L);
                userDAO.save(foundUser);
            }
        }

        if(Tools.isNullOrEmpty(user.getRoleId())){
            return new ServResponse(500L, "Эрх сонгоогүй байна", null);
        }

        if(Tools.isNullOrEmpty(user.getOrgId())){
            return new ServResponse(500L, "Байгууллага холбоогүй байна", null);
        }

        if(Tools.isNullOrEmpty(user.getLastname())){
            return new ServResponse(500L, "ХУР-аас мэдээлэл шалгана уу", null);
        }

        if(Tools.isNullOrEmpty(user.getFirstname())){
            return new ServResponse(500L, "ХУР-аас мэдээлэл шалгана уу", null);
        }


        String newPassword = Password.getPassword();
        user.setStatus(1L);
        user.setSalt(newPassword);
        String defaultPassword = Password.getMainPassword();
        String encodedPassword = passwordEncoder.encodePassword(defaultPassword, user.getSalt());
        user.setDefaultPassword(Password.encrypt(defaultPassword , user.getSalt()));
        user.setUsername(user.getRegNo());
        user.setPassword(encodedPassword);
        User userNew = userDAO.save(user);

        ImsToken imsToken = this.getLoggedUserInfo();

        UserRole userRole = new UserRole();
        userRole.setUserId(userNew.getId());
        userRole.setRoleId(user.getRoleId());
        userRole.setOrgId(user.getOrgId());
        userRole.setStatus(1L);
        userRole.setActiveFlag(1L);
        userRole.setVersion(1L);
        userRole.setCreatedBy(imsToken.getUserInfo().getUserId());
        userRole.setCreatedDate(new Date());
        userRoleDAO.save(userRole);

        return new ServResponse(200L, "Хэрэглэгч амжилттай бүртгэгдлээ", defaultPassword);
    }

    @Transactional
    public ServResponse createNewOrg(CreateOrgModel org) throws RuntimeException {
        List<Organization> organization = organizationDAO.findByOrOrgPin(org.orgPin);
        if(!Tools.isNullOrZero(organization.size())){
            return new ServResponse(500L,org.getOrgPin() + " Байгууллага бүртгэлтэй байна.",null);
        }
        Organization newOrg = new Organization();
        newOrg.setOrgPin(org.orgPin);
        newOrg.setOrgName(org.orgName);
        newOrg.setOrgType(0L);
        newOrg.setStatus(1L);
        newOrg.setActiveFlag(1L);
        newOrg.setIsOTP(1L);
        UUID uuid = new UUID(Long.parseLong(org.orgPin), Long.parseLong(org.orgPin));
        newOrg.setUuid(String.valueOf(uuid));
        organizationDAO.save(newOrg);

        return new ServResponse(200L,org.getOrgPin() + "Амжилттай бүртгэгдлээ.", newOrg);
    }

    @Transactional
    public ServResponse createNewBranch(CreateBranchModel branch) throws RuntimeException {
        Organization parentOrg = organizationDAO.findByIdAndStatusAndActiveFlag(branch.getParentId(), 1L, 1L);
        List<Organization> branches = organizationDAO.findBranchesById(branch.getParentId());
        if(Tools.isNullOrEmpty(parentOrg)){
            return new ServResponse(500L, "Салбарын бүртгэл хийх үйлдэл амжилтгүй боллоо.",null);
        }

        if(parentOrg.getOrgName().trim().compareTo(branch.getBranchName().trim()) == 0){
            return new ServResponse(500L, "Байгууллагын нэртэй адилхан байх боломжгүй",null);
        }

        if(!Tools.isNullOrEmpty(branches)) {
            Organization matchedOrg = branches.stream().filter(it-> it.getOrgName().trim().compareTo(branch.getBranchName().trim()) == 0).findFirst().orElse(null);
            if(matchedOrg != null) {
                return new ServResponse(500L, "Салбар бүртгэлтэй байна",null);
            }
        }

        Organization newBranch = new Organization();
        newBranch.setParentId(parentOrg.getId());
        newBranch.setUuid(parentOrg.getUuid());
        newBranch.setAccessToken(parentOrg.getAccessToken());
        newBranch.setOrgName(branch.getBranchName());
        newBranch.setOrgPin(parentOrg.getOrgPin());
        newBranch.setKey(parentOrg.getKey());
        newBranch.setCertFile(parentOrg.getCertFile());
        newBranch.setIsKiosk(parentOrg.getIsKiosk());
        newBranch.setStatus(1L);
        newBranch.setActiveFlag(1L);
        newBranch.setOrgType(1L);
        newBranch.setIsOTP(1L);
        organizationDAO.save(newBranch);
        return new ServResponse(200L,"Салбарын бүртгэл амжилттай хийгдлээ.", newBranch);
    }

    @Transactional
    public ServResponse editBranch(CreateBranchModel branch) throws RuntimeException {
        Organization parentOrg = organizationDAO.findFirstByIdAndActiveFlagAndIdIsNotNull(branch.getParentId(), 1L);
        if(Tools.isNullOrEmpty(parentOrg)){
            return new ServResponse(500L, "Амжилтгүй",null);
        }
        List<UserRole> role = userRoleDAO.findAllByOrgIdAndActiveFlagAndStatus(branch.getBranchId(), 1L, 1L);
        Organization oldBranch = organizationDAO.findFirstByIdAndActiveFlagAndIdIsNotNull(branch.getBranchId(), 1L);
        if(Tools.isNullOrEmpty(oldBranch)){
            return new ServResponse(500L, "Амжилтгүй",null);
        }
        // Төлөв солих тохиолдолд
        if(branch.getStatus() != oldBranch.getStatus()){ // Зөвхөн төлөв солих тохиолдолд идэвхитэй оператор байгаа эсэхийг шалгана
            if(role.size() > 0){
                return new ServResponse(500L, "Тухайн салбар дээр идэвхтэй оператор бүртгэлтэй байгаа тул уг үйлдлийг хийх боломжгүй",null);
            }
            oldBranch.setActiveFlag(0L);
            organizationDAO.save(oldBranch);
            Organization newBranch = new Organization();
            newBranch.setParentId(parentOrg.getId());
            newBranch.setUuid(oldBranch.getUuid());
            newBranch.setAccessToken(oldBranch.getAccessToken());
            newBranch.setOrgName(branch.getBranchName());
            newBranch.setOrgPin(oldBranch.getOrgPin());
            newBranch.setKey(oldBranch.getKey());
            newBranch.setCertFile(oldBranch.getCertFile());
            newBranch.setIsKiosk(oldBranch.getIsKiosk());
            newBranch.setOrgType(1L);
            newBranch.setIsOTP(1L);
            newBranch.setStatus(branch.getStatus());
            newBranch.setActiveFlag(1L);
            organizationDAO.save(newBranch);
            return new ServResponse(200L,"Салбарын бүртгэл амжилттай шинэчлэгдлээ.", newBranch);
        }

        // Нэр солих тохиолдолд
        if(branch.getBranchName() != oldBranch.getOrgName()){
            oldBranch.setOrgName(branch.getBranchName());
            organizationDAO.save(oldBranch);
            return new ServResponse(200L,"Салбарын бүртгэл амжилттай шинэчлэгдлээ.", oldBranch);
        } else {
            return new  ServResponse(200L,"", null);
        }
    }

    @Transactional
    public ServResponse changeUserStatus(Long userId, boolean active){
        User foundUser = userDAO.findFirstByIdAndIdIsNotNull(userId);
        if(foundUser==null){
            return new ServResponse(500L,"Хэрэглэгч олдсонгүй","");
        }

        UserRole userRole = userRoleDAO.findFirstByUserIdAndActiveFlag(userId, 1L);
        if(active) {
            userRole.setStatus(1L);
        } else {
            userRole.setStatus(0L);
            this.removeTokenByUsername(foundUser.getUsername());
        }
        userRoleDAO.save(userRole);

        return new ServResponse(200L, "Төлөв амжилттай солигдлоо", null);
    }

    @Transactional
    public ServResponse changeUserStatusAndBranch(Long userId, boolean active, Long orgId){
        User foundUser = userDAO.findFirstByIdAndIdIsNotNull(userId);
        if(foundUser.getStatus() != 2) {
            ImsToken imsToken = this.getLoggedUserInfo();
            if(foundUser==null){
                return new ServResponse(500L,"Хэрэглэгч олдсонгүй","");
            }
            UserRole userRole = userRoleDAO.findFirstByUserIdAndActiveFlag(userId, 1L);
            UserRole newRole = new UserRole();
            userRole.setActiveFlag(0L);
            userRoleDAO.save(userRole);

            if(active) {
                newRole.setStatus(1L);
            } else {
                newRole.setStatus(0L);
                this.removeTokenByUsername(foundUser.getUsername());
            }

            newRole.setUserId(userId);
            newRole.setRoleId(userRole.getRoleId());
            newRole.setVersion(userRole.getVersion()+1L);
            newRole.setActiveFlag(1L);
            newRole.setOrgId(orgId);
            newRole.setCreatedDate(new Date());
            newRole.setCreatedBy(imsToken.getUserInfo().getUserId());
            userRoleDAO.save(newRole);

            return new ServResponse(200L, "Амжилттай шинэчлэгдлээ", null);
        }
        return new ServResponse(500L, "Тухайн хэрэглэгч дээр идэвхитэй бүртгэл байна", null);
    }

    @Transactional
    public ServResponse changeOrgStatus(Long orgId, boolean active){
        Organization foundOrg = organizationDAO.findFirstByIdAndActiveFlagAndIdIsNotNull(orgId, 1L);

        List<UserRole> userRoles = userRoleDAO.findAllByOrgIdAndActiveFlagAndStatus(orgId, 1L, 1L);
        List<User> user = userDAO.findAllByIdIn(userRoles.stream().map(UserRole::getUserId).collect(Collectors.toList()));
        if(foundOrg==null){
            return new ServResponse(500L,"Байгууллага олдсонгүй","");
        }
        if(active){
            foundOrg.setStatus(1L);
        }else{
            foundOrg.setStatus(0L);
            for (User users : user) {
                this.removeTokenByUsername(users.getUsername());
            }
        }
        organizationDAO.save(foundOrg);

        return new ServResponse(200L, "Төлөв амжилттай солигдлоо", null);
    }

    public Object login(LoginModel lm) throws CustomException, UnsupportedEncodingException {
        User user = userDAO.findByUsernameAndStatus(lm.getUsername().toUpperCase(),1L);
        if(user==null){
            return new ServResponse(500L,"Хэрэглэгч олдсонгүй","");
        }

        List<Role> roles = roleDAO.findAllByTypeIn(Arrays.asList("ENQUIRY"));

        List<UserRole> userRoles = userRoleDAO.findByUserIdAndRoleIdInAndStatusAndActiveFlag(user.getId(),roles.stream().map(Role::getId).collect(Collectors.toList()), 1L, 1L);
        if(userRoles==null || userRoles.isEmpty()){
            return new ServResponse(500L,"Системийн эрх байхгүй байна","");
        }

        if(userRoles.size()>1){
            return new ServResponse(500L,"Системийн эрхийн тохиргоо алдаатай байна админтай холбогдоно уу.","");
        }

        UserRole userRole = userRoles.get(0);

        String encodedPassword = passwordEncoder.encodePassword(lm.getPassword(), user.getSalt());
        if (!encodedPassword.equals(user.getPassword())){
            return new ServResponse(500L,"Нэвтрэх нэр эсвэл нууц үг буруу байна","");
        }

        removeTokenByUsername(lm.getUsername());
        user.setRoleCode(userRole.getRole().getRole());
        String jwtToken = buildJWTToken(user);

        ImsToken imsToken = new ImsToken(user.getUsername(),
                new UserInfo(
                        user.getId(),
                        user.getRegNo(),
                        user.getFirstname(),
                        user.getLastname(),
                        userRole.getOrgId(),
                        userRole.getOrg().getParentId(),
                        userRole.getOrg().getOrgName(),
                        userRole.getOrg().getOrgPin(),
                        userRole.getOrg().getIsOTP(),
                        userRole.getRoleId(),
                        userRole.getRole().getRole(),
                        userRole.getOrg().getUuid(),
                        user.getStatus(),
                        userRole.getOrg().getIsKiosk()));
        imsToken.setToken(jwtToken);
        Set<String> strings = new HashSet<>();
        strings.add(userRole.getRole().getRole());
        imsToken.setRoles(strings);
        imsTokenDAO.save(imsToken);

        return imsToken;
    }

    public Object checkKiosk(String uuid) throws UnsupportedEncodingException {
        Organization organization = organizationDAO.findFirstByUuidAndOrgTypeAndStatusAndIsKioskAndActiveFlag(uuid, 0L,1L,1L,1L);
        String jwtToken = buildKioskJWTToken(organization);
        ImsToken imsToken = new ImsToken(organization.getOrgPin(),
                new UserInfo(
                        organization.getId(),
                        organization.getOrgPin(),
                        organization.getOrgName(),
                        "",
                        organization.getId(),
                        organization.getParentId(),
                        organization.getOrgName(),
                        organization.getOrgPin(),
                        organization.getIsOTP(),
                        3L,
                        "OPERATOR",
                        organization.getUuid(),
                        1L,
                        organization.getIsKiosk()));
        imsToken.setToken(jwtToken);
        Set<String> strings = new HashSet<>();
        strings.add("OPERATOR");
        imsToken.setRoles(strings);
        imsTokenDAO.save(imsToken);
        return imsToken;
    }

    @Async
    public void removeToken(String token) throws UnsupportedEncodingException, UserNotFoundException , Exception{
        ImsToken imsToken = verifyToken(token);
        imsTokenDAO.delete(imsToken);
    }

    @Async
    public void removeToken(String token, Long type) throws UnsupportedEncodingException, UserNotFoundException , Exception{
        ImsToken imsToken = verifyToken(token);
        imsTokenDAO.delete(imsToken);
    }

    @Async
    public void removeTokenByUsername(String username) {
        try {
            ImsToken oldToken = imsTokenDAO.findById(username).get();
            if (oldToken != null && oldToken.getToken() != null) {
                removeToken(oldToken.getToken());
            }
        } catch (Exception ignore) {
        }
    }

    public String buildJWTToken(User user) throws UnsupportedEncodingException {
        JWTCreator.Builder builder = JWT.create();
        builder.withSubject(user.getUsername());

        builder.withArrayClaim("role", Arrays.asList(user.getRoleCode()).toArray(new String[1]));
        builder.withClaim("userId", user.getId());
        builder.withExpiresAt(new Date(System.currentTimeMillis() + (3600) * 1000 * 4));
        builder.withIssuedAt(new Date(System.currentTimeMillis()));
        return builder.sign(Algorithm.HMAC256(this.signature));
    }

    public String buildKioskJWTToken(Organization user) throws UnsupportedEncodingException {
        JWTCreator.Builder builder = JWT.create();
        builder.withSubject(user.getOrgPin());

        builder.withArrayClaim("role", Arrays.asList("operator").toArray(new String[1]));
        builder.withClaim("orgId", user.getId());
        builder.withExpiresAt(new Date(System.currentTimeMillis() + (3600) * 1000 * 24));
        builder.withIssuedAt(new Date(System.currentTimeMillis()));
        return builder.sign(Algorithm.HMAC256(this.signature));
    }

    public ImsToken getLoggedUserInfo(){
        String username = UserUtil.getLoggedUserInfo();
        ImsToken imsToken = imsTokenDAO.findById(username).get();
        return imsToken;
    }

    public ImsToken verifyToken(String token) throws UserNotFoundException, UnsupportedEncodingException {
        long expAt = 0;
        long current = 0;
        ImsToken imsToken = null;
        JWTVerifier jwtVerifier = null;
        try {
            DecodedJWT decode = JWT.decode(token);
            decode.getSubject();

            imsToken = imsTokenDAO.findById(decode.getSubject()).get();
            if (imsToken != null) {
                jwtVerifier = JWT.require(Algorithm.HMAC256(this.signature)).build();
                DecodedJWT decodedToken = jwtVerifier.verify(token);
                expAt = decodedToken.getExpiresAt().getTime();
                current = System.currentTimeMillis();
                if (expAt >= current)
                    if (imsToken.getUsername().equals(decodedToken.getSubject())) return imsToken;
            }
        } catch (TokenExpiredException expiredException) {
            throw new UserNotFoundException("TokenExpiredException TAIS :: " + expiredException.getMessage());
        } catch (JWTVerificationException exception) {
            throw new UserNotFoundException("JWTVerificationException TAIS  :: " + exception.getMessage());
        } catch (Exception e) {
            throw new UserNotFoundException("Exception TAIS :: " + e.getMessage());
        }
        throw new UserNotFoundException("NonException TAIS");
    }

    public Boolean changePassword(LoginModel requestModel) {
        User imsUser = userDAO.findByUsername(requestModel.getUsername());
        if(imsUser==null){
            throw new RuntimeException("Хэрэглэгч олдсонгүй.");
        }
        imsUser.setDefaultPassword(Password.encrypt(requestModel.getPassword(), imsUser.getSalt()));
        String encodedPassword = passwordEncoder.encodePassword(requestModel.getPassword(), imsUser.getSalt());
        imsUser.setPassword(encodedPassword);
        userDAO.save(imsUser);

        imsTokenDAO.deleteById(requestModel.getUsername());

        return true;
    }

    public ServResponse resetPassword(PasswordModel pm) throws CustomException, UnsupportedEncodingException {
        User user = userDAO.findByUsernameAndStatus(pm.getUsername(),1L);
        if(user==null){
            return new ServResponse(500L,"Хэрэглэгч олдсонгүй","");
        }

        Boolean result = false;

        if (!Tools.isNullOrEmpty(user)) {
            result = Tools.compareValue(pm.getCivilId(), user.getCivilId());
        }
        if (result) {
            String newPassword = Password.getPassword();
            user.setStatus(1L);
            user.setSalt(newPassword);
            String defaultPassword = Password.getMainPassword();
            String encodedPassword = passwordEncoder.encodePassword(defaultPassword, user.getSalt());
            user.setDefaultPassword(Password.encrypt(defaultPassword , user.getSalt()));
            user.setUsername(user.getRegNo());
            user.setPassword(encodedPassword);
            userDAO.save(user);
            return new ServResponse(200L, "Нууц үг амжилттай сэргээгдлээ.", defaultPassword);
        }
        return new ServResponse(500L, "Хэрэглэгчийн улсын бүртгэлийн дугаар, регистрийн дугаар алдаатай байна.", null);
    }
    public List<VOrgChangeHistories> getChangeHistories(Long userId){
        return vOrgChangedHistoriesDAO.findAllByUserIdOrderByCreatedDateAsc(userId);
    }
}
