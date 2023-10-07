package test.task_bonus_points.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import test.task_bonus_points.https.requests.DecreaseBonusRequest;
import test.task_bonus_points.https.requests.IncreaseBonusRequest;

@RestController
public class BonusController extends MainController {
    @PostMapping("/increase")
    public ResponseEntity<String> increaseBonus(@RequestBody IncreaseBonusRequest request) {
        return ResponseEntity.ok("ok");
    }

    @PostMapping("/decrease")
    public ResponseEntity<String> decreaseBonus(@RequestBody DecreaseBonusRequest request) {
        return ResponseEntity.ok("ok");
    }
}
