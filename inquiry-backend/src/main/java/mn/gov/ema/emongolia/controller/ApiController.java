package mn.gov.ema.emongolia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

//    @Autowired
//    ApiService apiService;
//    ng(path = "/serviceList")
//    public ResponseEntity serviceList() {
//        return ResponseEntity.ok(apiService.serviceList());
//    }
//    @GetMappi


//    @PostMapping(path = "/getInvoiceList")
//    public ResponseEntity getInvoiceList(@RequestParam(value = "page") int page,
//                                         @RequestParam(value = "size") int size,
//                                         @RequestParam(value = "sort",required = false) String sort,
//                                         @RequestBody List<String> filters) {
//        Pageable pageable = PageRequest.of(page, size);
//        return ResponseEntity.ok(invoiceService.getInvoiceList( pageable, filters, sort));
//    }
//
//    @GetMapping(path = "/getRefServiceList")
//    public ResponseEntity getRefServiceList() {
//        return ResponseEntity.ok(invoiceService.getRefServiceList());
//    }
//
//    @GetMapping(path = "/getAllToken")
//    public ResponseEntity getAllToken() {
//        return ResponseEntity.ok(invoiceService.getAllToken());
//    }
//
//    @GetMapping(path = "/deleteAllToken")
//    public ResponseEntity deleteAllToken() {
//        return ResponseEntity.ok(invoiceService.deleteAllToken());
//    }
//
//
//
//    @PostMapping(path = "/createInvoice")
//    public ResponseEntity createInvoice(@RequestBody GovInvRefService invRefService) {
//        return ResponseEntity.ok(invoiceService.createInvoice(invRefService));
//    }
//
//    @GetMapping("/checkInvoice")
//    public ResponseEntity checkInvoice(@RequestParam(name = "invoiceNo") String invoiceNo){
//        return ResponseEntity.ok(invoiceService.checkInvoice(invoiceNo));
//    }
//
//    @GetMapping("/getStatePin")
//    public ResponseEntity getStatePin(@RequestParam(value = "serviceCode") String serviceCode,
//                                      @RequestParam(value = "branchId") Long branchId){
//        return ResponseEntity.ok(invoiceService.getStatePin(serviceCode, branchId));
//    }

}
