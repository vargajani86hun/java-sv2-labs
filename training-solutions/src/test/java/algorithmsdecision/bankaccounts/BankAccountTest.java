package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount = new BankAccount("Mézga Krisztina",
            "11223456-01021325", 80_800);

    @Test
    void testCreate() {
        BankAccount anotherBankAccount = new BankAccount("Mézga Aladár",
                "11223300-44116633", 155_500);
        assertEquals("Mézga Aladár", anotherBankAccount.getNameOfOwner());
        assertEquals("11223300-44116633", anotherBankAccount.getAccountNumber());
        assertEquals(155_500, anotherBankAccount.getBalance());
    }

    @Test
    void testWithdrawWithValidAmount() {
        bankAccount.withdraw(32_200);
        assertEquals(48_600, bankAccount.getBalance());
    }

    @Test
    void testWithdrawWithInvalidAmount() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> bankAccount.withdraw(80_801));
        assertEquals("Don't have enough balance.", iae.getMessage());
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(32_200);
        assertEquals(113_000, bankAccount.getBalance());
    }

}