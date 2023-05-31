package mn.gov.ema.emongolia.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.java.Log;
import mn.gov.ema.emongolia.data.redis.dao.TaxPaymentTokenDAO;
import mn.gov.ema.emongolia.data.redis.entity.TaxPaymentToken;
import mn.gov.ema.emongolia.feign.TaxPaymentTokenFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Optional;

@Log
@Service
public class TaxPaymentTokenService {
    @Autowired
    @Qualifier("mn.gov.itc.emongolia.feign.TaxPaymentTokenFeign")
    TaxPaymentTokenFeign paymentTokenFeign;

    @Autowired
    TaxPaymentTokenDAO paymentTokenDAO;

    /**
     * e-tax-н хэрэглэгч token авах
     *
     * @return token
     */
    @Transactional
    public String getToken(String username, String password) {
        Optional<TaxPaymentToken> itaxUserToken =paymentTokenDAO.findById(username);
        String token = null;
        if(itaxUserToken.isPresent() ) {
            token = itaxUserToken.get().getToken();
            if(token!=null) {
                DecodedJWT decodedToken = JWT.decode(token);
                Long expAt = decodedToken.getExpiresAt().getTime();
                Long current = System.currentTimeMillis();
                log.info("exp:" + expAt + " - current:" + current);
                if (expAt >= current) {
                    return token;
                } else {
                    HashMap<String, String> currentToken = new HashMap<>();
                    currentToken.put("username", username);
                    currentToken.put("password", password);
                    token = paymentTokenFeign.getToken(currentToken).getBody();
                }
            }
        }else {
            HashMap<String, String> currentToken = new HashMap<>();
            currentToken.put("username", username);
            currentToken.put("password", password);
            token = paymentTokenFeign.getToken(currentToken).getBody();
        }

        paymentTokenDAO.save(new TaxPaymentToken(username, token));
        return token;
    }
    public String getToken() {
        return this.getToken("E00002","bqj9ePx8" );
    }
}
