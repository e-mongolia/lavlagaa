package mn.gov.ema.emongolia.data.redis.dao;

import mn.gov.ema.emongolia.data.redis.entity.ImsToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImsTokenDAO extends CrudRepository<ImsToken, String> {
}
