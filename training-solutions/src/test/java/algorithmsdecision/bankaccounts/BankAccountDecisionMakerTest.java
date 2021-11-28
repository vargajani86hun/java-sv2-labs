package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {
    List<BankAccount> accounts = new ArrayList<>();
    BankAccountDecisionMaker bankAccDecMaker = new BankAccountDecisionMaker();

    @BeforeEach
    void init() {
        accounts.add(new BankAccount("Mézga Krisztina",
                "11223456-01021325", 80_800));
        accounts.add(new BankAccount("Mézga Aladár",
                "11223300-44116633", 155_500));
        accounts.add(new BankAccount("Mézga Géza",
                "11223156-91827364", 166_350));
        accounts.add(new BankAccount("Mézga Gézáné Rezovits Paula",
                "11223376-34637283", 112_210));
        accounts.add(new BankAccount("Hufnágel István",
                "1123287-14415270", 313_800));
    }

    @Test
    void testContainsBalanceGreaterThan() {
        assertTrue(bankAccDecMaker.containsBalanceGreaterThan(accounts, 250_000));
    }

    @Test
    void testNotContainsBalanceGreaterThan() {
        assertFalse(bankAccDecMaker.containsBalanceGreaterThan(accounts, 350_000));
    }

    @Test
    void testNullNotContainsBalanceGreaterThan() {
        assertFalse(bankAccDecMaker.containsBalanceGreaterThan(null, 100_000));
    }
}