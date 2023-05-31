package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.Organization;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganizationDAO extends CrudRepository<Organization, Long> {

    @Query("SELECT a FROM Organization a WHERE a.orgType = 0 and a.activeFlag = 1L ORDER BY a.id ASC")
    List<Organization> findByOrgType();

    @Query("SELECT a FROM Organization a WHERE a.orgType = 1 and a.activeFlag = 1L ORDER BY a.id ASC")
    List<Organization> findByIdIsNotNull();

    @Query("SELECT a FROM Organization a WHERE a.orgPin = ?1 and a.activeFlag = 1L")
    List<Organization> findByOrOrgPin(String orgPin);

    @Query("SELECT a FROM Organization a WHERE a.parentId = ?1 and a.activeFlag = 1L")
    List<Organization> findBranchesById(Long parentId);

    Organization findFirstByUuidAndOrgType(String uuid, Long orgType);
    Organization findFirstByUuidAndOrgTypeAndStatusAndActiveFlag(String uuid, Long orgType, Long status, Long activeFlag);
    Organization findFirstByUuidAndOrgTypeAndStatusAndIsKioskAndActiveFlag(String uuid, Long orgType, Long status, Long isKiosk, Long activeFlag);
    Organization findFirstByIdAndStatusAndActiveFlag(Long id, Long status, Long activeFlag);
    Organization findFirstByIdAndActiveFlagAndIdIsNotNull(Long id, Long activeFlag);
    Organization findByIdAndStatusAndActiveFlag(Long id, Long status, Long activeFlag);
}
