import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportController {
    
    @Autowired
    private ReportService reportService;

    @GetMapping("/daily")
    public ResponseEntity<List<Order>> getDailyReport() {
        return ResponseEntity.ok(reportService.getOrdersForToday());
    }

    @GetMapping("/weekly")
    public ResponseEntity<List<Order>> getWeeklyReport() {
        return ResponseEntity.ok(reportService.getOrdersForThisWeek());
    }
}
