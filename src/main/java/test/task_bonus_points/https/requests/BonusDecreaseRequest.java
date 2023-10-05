package test.task_bonus_points.https.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import test.task_bonus_points.https.dtos.BonusPoints;
import test.task_bonus_points.https.dtos.Customer;
import test.task_bonus_points.https.dtos.Merchant;

@AllArgsConstructor
@Getter
public class BonusDecreaseRequest {
    private Customer customer;
    private Merchant merchant;
    private BonusPoints bonusPoints;
}
