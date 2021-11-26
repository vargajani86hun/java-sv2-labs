package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactions, int limit) {
        int amount = 0;
        for (Transaction trans : transactions) {
            if (trans.isCredit() && trans.getAmount() < limit) {
                amount++;
            }
        }
        return amount;
    }
}
