package mn.gov.ema.emongolia.security;

import lombok.Data;
import mn.gov.ema.emongolia.data.model.UserInfo;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Data
public class TokenAuthentication extends AbstractAuthenticationToken {

    private final Object principal;
    private Object credentials;
    private UserInfo userInfo;

    public TokenAuthentication(Object principal, Object credentials) {
        super((Collection)null);
        this.principal = principal;
        this.credentials = credentials;
        this.setAuthenticated(false);

    }

    public TokenAuthentication(Object principal, Object credentials, UserInfo userInfo) {
        super((Collection)null);
        this.principal = principal;
        this.credentials = credentials;
        this.userInfo = userInfo;
        this.setAuthenticated(true);
    }

    public TokenAuthentication(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities, UserInfo userInfo) {
        super(authorities);
        this.principal = principal;
        this.credentials = credentials;
        this.userInfo = userInfo;
        super.setAuthenticated(true);
    }

    public Object getCredentials() {
        return this.credentials;
    }

    public Object getPrincipal() {
        return this.principal;
    }

    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        if (isAuthenticated) {
            throw new IllegalArgumentException("Cannot set this token to trusted - use constructor which takes a GrantedAuthority list instead");
        } else {
            super.setAuthenticated(false);
        }
    }

    public void eraseCredentials() {
        super.eraseCredentials();
        this.credentials = null;
    }
}
