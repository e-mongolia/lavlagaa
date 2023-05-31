package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDAO extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findByUsernameAndStatus(String username, Long status);
    User findFirstByIdAndStatus(Long id, Long status);
    User findFirstByIdAndIdIsNotNull(Long id);
    List<User> findAllByIdIn(List<Long> ids);
    List<User> findAllByStatusIsNotNull();
}

