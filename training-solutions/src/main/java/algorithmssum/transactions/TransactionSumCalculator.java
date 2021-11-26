package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {
    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sum = 0;
        for (Transaction trans : transactions) {
            if (trans.isCredit()) {
                sum += trans.getAmount();
            }
        }
        return sum;
    }
}
