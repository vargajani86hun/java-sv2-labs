package algorithmscount.transaction;

public class Transaction {
    private String accountNumber;
    private TransactionType transactionType;
    private int amount;

    public Transaction(String accountNumber, TransactionType transactionType, int amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isCredit() {
        return transactionType.equals(TransactionType.CREDIT);
    }

    public boolean isDebit() {
        return transactionType.equals(TransactionType.DEBIT);
    }
}
