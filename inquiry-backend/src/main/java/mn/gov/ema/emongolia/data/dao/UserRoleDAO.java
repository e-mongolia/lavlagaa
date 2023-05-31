package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRoleDAO extends CrudRepository<UserRole, Long> {
    List<UserRole> findByUserIdAndStatusAndActiveFlag(Long userId, Long status, Long activeFlag);
    List<UserRole> findByUserIdAndActiveFlag(Long userId, Long activeFlag);
    List<UserRole> findByUserIdAndRoleIdInAndStatusAndActiveFlag(Long userId,List<Long> roleIds, Long status, Long activeFlag);
    List<UserRole> findByUserIdAndRoleIdInAndActiveFlag(Long userId,List<Long> roleIds, Long activeFlag);
    @Query("select a from UserRole a where a.orgId=?1 and a.activeFlag=?2 and a.status=?3")
    List<UserRole> findAllByOrgIdAndActiveFlagAndStatus(Long orgId, Long activeFlag, Long status);

    UserRole findFirstByUserIdAndActiveFlag(Long userId, Long activeFlag);
}

