package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.OrganizationConfig;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationConfigDAO extends CrudRepository<OrganizationConfig, Long> {
    OrganizationConfig findFirstByIdAndStatus(Long id, Long status);
}
