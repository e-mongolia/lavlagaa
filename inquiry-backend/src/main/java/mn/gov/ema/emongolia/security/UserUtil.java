package mn.gov.ema.emongolia.security;

import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtil {
    public static String getLoggedUserInfo() {
        if (SecurityContextHolder.getContext().getAuthentication() != null){
            return (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }
        return null;
    }
}
