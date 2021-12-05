package initializer;

import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.JobHoldUntil;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void testCreate() {
        CreditCard creditCard = new CreditCard(350_000);
        assertEquals(350_000, creditCard.getBalance());
        CreditCard otherCreditCard = new CreditCard(660_500, Currency.HUF);
        assertEquals(660_500, otherCreditCard.getBalance());
    }

    @Test
    void testCreateWithEUR() {
        CreditCard creditCard = new CreditCard(12_000, Currency.EUR);
        long expected = (long) (12_000 * CreditCard.dailyRates.get(0).getConversionFactor());
        assertEquals(expected, creditCard.getBalance());
    }

    @Test
    void testCreateWithGBP() {
        CreditCard creditCard = new CreditCard(12_000, Currency.GBP);
        long expected = (long) (12_000 * CreditCard.dailyRates.get(2).getConversionFactor());
        assertEquals(expected, creditCard.getBalance());
    }

    @Test
    void testPayment() {
        CreditCard creditCard = new CreditCard(3_100_100);
        assertTrue(creditCard.payment(1_200_000, Currency.HUF));
        assertFalse(creditCard.payment(8_000, Currency.CHF));
    }

}