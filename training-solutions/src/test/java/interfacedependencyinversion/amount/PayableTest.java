package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void testAmount() {
        Payable amount = new Amount();
        assertEquals(374, amount.getPayableAmount(374));
        assertEquals(3187, amount.getPayableAmount(3187));
        assertEquals(37541, amount.getPayableAmount(37541));
    }

    @Test
    void testCash() {
        Payable cash = new Cash();
        assertEquals(835, cash.getPayableAmount(833));
        assertEquals(835, cash.getPayableAmount(837));
        assertEquals(830, cash.getPayableAmount(831));
        assertEquals(840, cash.getPayableAmount(839));
        assertEquals(840, cash.getPayableAmount(840));
        assertEquals(835, cash.getPayableAmount(835));
    }

    @Test
    void testBankAtm() {
        Payable bankAtm = new BankAtm();
        assertEquals(5000, bankAtm.getPayableAmount(5000));
        assertEquals(5000, bankAtm.getPayableAmount(4999));
        assertEquals(5000, bankAtm.getPayableAmount(4001));
        assertEquals(5000, bankAtm.getPayableAmount(4550));
    }
}