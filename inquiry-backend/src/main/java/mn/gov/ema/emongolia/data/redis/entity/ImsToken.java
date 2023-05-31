package mn.gov.ema.emongolia.data.redis.entity;

import lombok.Data;
import mn.gov.ema.emongolia.data.model.UserInfo;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.HashSet;
import java.util.Set;

@RedisHash(value = "token")
@Data
public class ImsToken {
    @Id
    private String username;
    private String token;
    private Set<String> roles;
    private Set<String> permissions;
    private UserInfo userInfo;

    public ImsToken() {
        roles = new HashSet<>();
        permissions = new HashSet<>();
    }

    public ImsToken(String username) {
        this();
        this.username = username;
    }

    public ImsToken(String username, UserInfo userInfo) {
        this();
        this.username = username;
        this.userInfo = userInfo;
    }

}
