package mn.gov.ema.emongolia.security;

import lombok.SneakyThrows;
import lombok.extern.java.Log;
import mn.gov.ema.emongolia.data.redis.entity.ImsToken;
import mn.gov.ema.emongolia.service.UserService;
import mn.gov.ema.emongolia.tools.Authority;
import mn.gov.ema.emongolia.tools.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Bold-Erdene Ganbold
 * Date: 2019/12/01
 */
@Component
@Log
public class TokenAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    UserService userService;

    @Value("#{'${rejectUrls}'.split(',')}")
    private List<String> rejectUrls;

    @SneakyThrows
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException  {
        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);

        Exception error = null;
        ImsToken imsToken = null;
        boolean isTokenActive = false;
        boolean verifyIsError = false;
        String verifyErrorMesage = null;


        final String rawToken = request.getHeader("Authorization");

        final String uuid = request.getParameter("uuid");

        try {
            if(!rejectedUrl(requestWrapper)){
                if (rawToken != null && rawToken.startsWith("Bearer ")) {
                    try {
                        imsToken = userService.verifyToken(rawToken.substring(7));
                    } catch (UserNotFoundException e) {
                        verifyIsError = true;
                        verifyErrorMesage =  e.getMessage();
                    }


                    if(!verifyIsError){
                        HashSet<GrantedAuthority> authorities = new HashSet<>();
                        authorities.add(new Authority(imsToken.getUserInfo().getRoleCode()));
                        SecurityContextHolder.getContext().setAuthentication(
                                new TokenAuthentication(
                                        imsToken.getUsername(),
                                        new org.springframework.security.core.userdetails.User(imsToken.getUsername(),
                                                imsToken.getUsername(),
                                                authorities), authorities, imsToken.getUserInfo()));
                        isTokenActive = true;
                    }
                }

                if(imsToken == null || !isTokenActive){
                    response.sendError(HttpStatus.UNAUTHORIZED.value());
//                    log.info("1.isTokenActive :" + isTokenActive);
//                    log.info("1.imsToken :" + imsToken);
                    return;
                }

                if(verifyIsError){
                    response.sendError(HttpStatus.UNAUTHORIZED.value());
//                    log.info("2.verifyIsError :" + verifyIsError);
//                    log.info("2.imsToken :" + imsToken);
//                    response.sendError(500,verifyErrorMesage);
                    return;
                }

                if(imsToken.getUserInfo()!=null && imsToken.getUserInfo().getOrgUuid()!=null && !imsToken.getUserInfo().getOrgUuid().equals(uuid)){
                    response.sendError(HttpStatus.UNAUTHORIZED.value());
//                    log.info("3.imsToken :" + verifyIsError);
//                    log.info("3.imsToken :" + imsToken);
                    return;
                }
            }


            if(rejectedUrl(requestWrapper)) {
                chain.doFilter(requestWrapper, responseWrapper);
            } else{
                TokenAuthentication authentication = (TokenAuthentication)SecurityContextHolder.getContext().getAuthentication();
                if(authentication == null) {
                    response.sendError(HttpStatus.UNAUTHORIZED.value());
                    return;
                }

                //Success
                chain.doFilter(requestWrapper, responseWrapper);
            }
        } finally {
//            log.info("ALDAA GARLAA :: " + new String(responseWrapper.getContentAsByteArray(), StandardCharsets.UTF_8));
            //todo: log bichih
            responseWrapper.copyBodyToResponse();
        }
    }

    private boolean rejectedUrl(ContentCachingRequestWrapper requestWrapper) {
        boolean isFound = false;

        if(requestWrapper.getRequestURI().contains("/actuator/health")) {
            isFound = true;
        }
        else {
            for (String x : rejectUrls) {
                if (requestWrapper.getRequestURI().contains(x)) {
                    isFound = true;
                    break;
                }
            }
        }
        return isFound;
    }

    private void test(){

    }
}
