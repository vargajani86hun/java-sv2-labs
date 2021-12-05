package initializer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void testCreate() {
        CreditCard creditCard = new CreditCard(350_000);
        assertEquals(350_000, creditCard.getBalance());
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
        assertTrue(creditCard.payment(1_200_000));
        assertFalse(creditCard.payment(8_000, Currency.CHF));
    }

}