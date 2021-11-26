package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan(List<BankAccount> accounts,
                                           int minBalance) {
        int amount = 0;
        for (BankAccount acc : accounts) {
            if (acc.getBalance() > minBalance) {
                amount++;
            }
        }
        return amount;
    }
}
