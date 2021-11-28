package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {
    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int min) {
        if (accounts == null) {
            return false;
        }
        for (BankAccount actual : accounts) {
            if (actual.getBalance() > min) {
                return true;
            }
        }
        return false;
    }
}
