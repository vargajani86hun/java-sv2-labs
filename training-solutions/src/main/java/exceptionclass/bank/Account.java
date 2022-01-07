package exceptionclass.bank;

public class Account {
    private final String accountNumber;
    private double balance;
    private double maxSubtract = 100_000d;

    public Account(String accountNumber, double balance) {
        checkAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double subtract(double amount) {
        checkSubtractAmount(amount);
        validateNewBalance(amount);
        return balance -= amount;
    }

    public double deposit(double amount) {
        checkDepositAmount(amount);
        return balance += amount;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        checkMaxSubtract(maxSubtract);
        this.maxSubtract = maxSubtract;
    }

    private void checkAccountNumber(String accountNumber) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number should not be null!");
        }
    }

    private void checkMaxSubtract(double maxSubtract) {
        if (maxSubtract < 0) {
            throw new InvalidAmountBankOperationException();
        }
    }

    private void checkSubtractAmount(double amount) {
        if (amount > maxSubtract || amount < 0) {
            throw new InvalidAmountBankOperationException();
        }
    }

    private void validateNewBalance(double subtractAmount) {
        if ((balance - subtractAmount) < 0) {
            throw new LowBalanceBankOperationException();
        }
    }

    private void checkDepositAmount(double amount) {
        if (amount < 0) {
            throw new InvalidAmountBankOperationException();
        }
    }
}
