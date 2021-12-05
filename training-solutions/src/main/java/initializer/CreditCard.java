package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    public static final List<Rate> dailyRates;
    private long balance;

    static {
        List<Rate> rates = new ArrayList<>();
        rates.add(new Rate(Currency.EUR, 367.2));
        rates.add(new Rate(Currency.CHF, 282.8));
        rates.add(new Rate(Currency.GBP, 384.4));
        rates.add(new Rate(Currency.USD, 331.2));
        dailyRates = rates;
    }

    public CreditCard(long balance, Currency currency) {
        if (currency == Currency.HUF) {
            this.balance = balance;
        }
        else {
            this.balance = getChangedAmount(balance, currency);
        }
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public boolean payment(long amount, Currency currency) {
        if (currency == Currency.HUF) {
            return payment(amount);
        }
        else {
            return payment(getChangedAmount(amount, currency));
        }
    }

    public boolean payment(long amount){
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public long getBalance() {
        return balance;
    }

    private long getChangedAmount(long amount, Currency currency) {
        long result = 0;
        for (Rate actual : dailyRates) {
            if (actual.getCurrency() == currency) {
                result = (long) (amount * actual.getConversionFactor());
                break;
            }
        }
        return result;
    }
}
