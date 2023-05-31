package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.VOrgChangeHistories;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VOrgChangedHistoriesDAO extends CrudRepository<VOrgChangeHistories, Long> {
    List<VOrgChangeHistories> findAllByUserIdOrderByCreatedDateAsc(Long userId);
}
