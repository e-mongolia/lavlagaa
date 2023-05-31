package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.RequestDetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestDetailDAO extends CrudRepository<RequestDetail, Long> {
    @Query("SELECT a.responseLink FROM RequestDetail a WHERE a.serviceId = ?1")
    String findByServiceId(Long serviceId);
}
