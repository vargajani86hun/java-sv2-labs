package exceptionclass.bank;

import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        checkAccounts(accounts);
        this.accounts = accounts;
    }

    public void payment(String accountNumber, double amount) {
        searchAccountByAccNumber(accountNumber).subtract(amount);
    }

    public void deposit(String accountNumber, double amount) {
        searchAccountByAccNumber(accountNumber).deposit(amount);
    }

    private void checkAccounts(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
    }

    private Account searchAccountByAccNumber(String accNumber) {
        for (Account actual : accounts) {
            if (actual.getAccountNumber().equals(accNumber)) {
                return actual;
            }
        }
        throw new InvalidAccountNumberBankOperationException();
    }
}
