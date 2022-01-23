package lambdacomparator.account;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class BankAccounts {
    private List<BankAccount> accounts;

    public BankAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public List<BankAccount> listBankAccountsByAccountNumber() {
        return accounts.stream()
                .sorted()
                .toList();
    }

    public List<BankAccount> listBankAccountsByBalance() {
        return accounts.stream()
                .sorted(Comparator.comparing(BankAccount::getBalance,
                        Comparator.comparingDouble(Math::abs)))
                .toList();
    }

    public List<BankAccount> listBankAccountsByBalanceDesc() {
        return accounts.stream()
                .sorted(Comparator.comparingDouble(BankAccount::getBalance).reversed())
                .toList();
    }

    public List<BankAccount> listBankAccountsByNameThenAccountNumber() {
        return accounts.stream()
                .sorted(Comparator.comparing(BankAccount::getNameOfOwner,
                        Comparator.nullsFirst(Collator.getInstance(new Locale("hu", "HU"))))
                        .thenComparing(Comparator.naturalOrder()))
                .toList();
    }
}
