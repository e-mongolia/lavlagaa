package mn.gov.ema.emongolia.security.attribute;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class ImsPrincipal extends User {

    private Long orgId;
    private Set<String> authoritySet;


    public ImsPrincipal(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        List<GrantedAuthority> authoritiesList = (List<GrantedAuthority>)authorities;
        this.authoritySet = new HashSet<>();
        authoritiesList.stream().forEach(grantedAuthority -> this.authoritySet.add(grantedAuthority.getAuthority()));
    }

    public ImsPrincipal(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        List<GrantedAuthority> authoritiesList = (List<GrantedAuthority>)authorities;
        this.authoritySet = new HashSet<>();
        authoritiesList.stream().forEach(grantedAuthority -> this.authoritySet.add(grantedAuthority.getAuthority()));
    }
}
