package lambdacomparator.account;

import java.util.Objects;

public class BankAccount implements Comparable<BankAccount> {
    private String accountNumber;
    private String nameOfOwner;
    private double balance;

    public BankAccount(String accountNumber, String nameOfOwner, double balance) {
        this.accountNumber = accountNumber;
        this.nameOfOwner = nameOfOwner;
        this.balance = balance;
    }

    @Override
    public int compareTo(BankAccount o) {
        return this.accountNumber.compareTo(o.accountNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount that)) return false;
        return Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public double getBalance() {
        return balance;
    }
}
