import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private SellService sellService;

    @PostMapping("/create")
    public ResponseEntity<Sell> createSell(@RequestBody Sell sell) {
        return ResponseEntity.ok(sellService.createSell(sell));
    }
}
