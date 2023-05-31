package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.ReferenceTag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReferenceTagDAO extends CrudRepository<ReferenceTag, Long> {

    List<ReferenceTag> findByIdIsNotNullOrderById();

    @Query("SELECT a FROM ReferenceTag a WHERE a.id in ?1")
    List<ReferenceTag> findTagIds(List<Long> ids);

}
