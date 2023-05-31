package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.ReferenceEmon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReferenceEmonDAO extends CrudRepository<ReferenceEmon, Long> {

    @Query("SELECT a FROM ReferenceEmon a WHERE a.status = 1 ORDER BY a.id ASC")
    List<ReferenceEmon> findByIdIsNotNullOrderById();

    @Query("SELECT a FROM ReferenceEmon a WHERE a.orgId = ?1 ORDER BY a.id ASC")
    List<ReferenceEmon> findByOrgId(Long orgId);

    @Query("SELECT a.eMongoliaId FROM ReferenceEmon a WHERE a.id = ?1")
    String findEMongoliaId(Long id);

}
