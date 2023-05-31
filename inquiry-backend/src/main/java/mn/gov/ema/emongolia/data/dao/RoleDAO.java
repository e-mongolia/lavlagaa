package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleDAO extends CrudRepository<Role, Long> {
    List<Role> findAllByTypeIn(List<String> types);
}

