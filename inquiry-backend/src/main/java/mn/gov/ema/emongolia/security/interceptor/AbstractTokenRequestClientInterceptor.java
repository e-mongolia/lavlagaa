package mn.gov.ema.emongolia.security.interceptor;

import lombok.extern.log4j.Log4j;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public abstract class AbstractTokenRequestClientInterceptor {


    protected String getToken() {
        try {
            RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
            if (requestAttributes != null && requestAttributes instanceof ServletRequestAttributes) {
                String token = ((ServletRequestAttributes) requestAttributes).getRequest().getHeader("Authorization");
                return token;
            }
        } catch (IllegalStateException token) {
        } catch (Throwable t) {
        }
        return null;
    }

}
