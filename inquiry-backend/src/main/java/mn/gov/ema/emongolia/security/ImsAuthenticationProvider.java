package mn.gov.ema.emongolia.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class ImsAuthenticationProvider implements AuthenticationProvider, Serializable {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if (authentication instanceof TokenAuthentication)
            return authentication;
        return null;
    }

    @Override
    public boolean supports(Class<?> authenticationClass) {
        if (TokenAuthentication.class.isAssignableFrom(authenticationClass)) return true;
        return false;

    }
}
