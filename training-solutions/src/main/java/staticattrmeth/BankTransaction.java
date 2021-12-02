package staticattrmeth;

public class BankTransaction {
    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    private long transactionValue;

    public BankTransaction(long transactionValue) {
        isValidTransactionValue(transactionValue);
        this.transactionValue = transactionValue;
        countOfTransactions++;
        sumOfTransactions += transactionValue;
        if(currentMinValue > transactionValue) {
            currentMinValue = transactionValue;
        }
        if (currentMaxValue < transactionValue) {
            currentMaxValue = transactionValue;
        }
    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMaxValue = 0;
        currentMinValue = MAX_TRANSACTION_VALUE+1;
    }

    public static long getAverageOfTransaction() {
        if (countOfTransactions == 0) {
            return 0;
        }
        return sumOfTransactions / countOfTransactions;
    }

    public static long getCurrentMinValue() {
        if (countOfTransactions == 0) {
            return 0;
        }
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        if (countOfTransactions == 0) {
            return 0;
        }
        return currentMaxValue;
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }

    public long getTransactionValue() {
        return transactionValue;
    }

    private boolean isValidTransactionValue(long transactionValue) {
        if (transactionValue < MIN_TRANSACTION_VALUE || transactionValue > MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Transaction value out of allowed bound.");
        }
        return true;
    }
}
