package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.VRequestInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface VRequestInfoDAO extends CrudRepository<VRequestInfo, Long> {
    @Query("SELECT a FROM VRequestInfo a WHERE a.regNo = ?1 AND a.isPay = 1 AND a.emonId = ?2 AND a.invoiceStatus=2 AND a.checkDate >= ?3 and a.checkDate <= ?4 and ROWNUM=1 order by a.createdDate desc")
    VRequestInfo findByRegNoAndEmonIdDate(String regNum, String emonId, Date start, Date end);

}
