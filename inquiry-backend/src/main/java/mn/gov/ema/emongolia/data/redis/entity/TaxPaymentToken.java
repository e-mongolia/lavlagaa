package mn.gov.ema.emongolia.data.redis.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash(value = "TaxPaymentToken")
@Data
public class TaxPaymentToken implements Serializable {

    @Id
    private String username;
    @JsonIgnore
    private String token;

    public TaxPaymentToken(String username, String token){
        this.username = username;
        this.token = token;
    }

}
