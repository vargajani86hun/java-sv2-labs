package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    Prime prime = new Prime();

    @Test
    void testIsPrimeWithPrimes() {
        assertTrue(prime.isPrime(2));
        assertTrue(prime.isPrime(3));
        assertTrue(prime.isPrime(7));
        assertTrue(prime.isPrime(17));
        assertTrue(prime.isPrime(53));
    }

    @Test
    void testisPrimeWithNotPrimes() {
        assertFalse(prime.isPrime(1));
        assertFalse(prime.isPrime(0));
        assertFalse(prime.isPrime(-1));
        assertFalse(prime.isPrime(4));
        assertFalse(prime.isPrime(15));
        assertFalse(prime.isPrime(49));
    }
}