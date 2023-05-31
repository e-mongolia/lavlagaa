package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.Request;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RequestDAO extends CrudRepository<Request, Long> {
    List<Request> findByIdIsNotNull();
}
