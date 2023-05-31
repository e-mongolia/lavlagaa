package mn.gov.ema.emongolia.data.redis.dao;

import mn.gov.ema.emongolia.data.redis.entity.TaxPaymentToken;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TaxPaymentTokenDAO extends CrudRepository<TaxPaymentToken, String> {
    Optional<TaxPaymentToken> findByUsername(String userName);
}
