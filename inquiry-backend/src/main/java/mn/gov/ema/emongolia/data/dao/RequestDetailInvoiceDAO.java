package mn.gov.ema.emongolia.data.dao;

import mn.gov.ema.emongolia.data.entity.RequestDetailInvoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestDetailInvoiceDAO extends CrudRepository<RequestDetailInvoice, Long> {
    RequestDetailInvoice findFirstByInvoiceNoAndIsActive(String invoiceNo, Long isActive);
}
