package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    @Test
    void testGetSumOfIntegers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(55, new NumbersSum().getSum(numbers));
    }

    @Test
    void testGetSumOfStrings() {
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        assertEquals(55, new NumbersSum().getSum(numbers));
    }

    @Test
    void testGetSumOfIntegersWithNull() {
        int[] numbers = null;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new NumbersSum().getSum(numbers));
        assertEquals("Empty array of numbers!", iae.getMessage());
    }

    @Test
    void testGetSumOfStringsWithNull() {
        String[] numbers = null;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new NumbersSum().getSum(numbers));
        assertEquals("Empty array of numbers!", iae.getMessage());
    }

    @Test
    void testGetSumOfWrongStrings() {
        String[] numbers = {"1", "2", "3", "4", "b", "6", "7", "8", "9", "10"};
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new NumbersSum().getSum(numbers));
        assertEquals("Not a number!", iae.getMessage());
        assertEquals(NumberFormatException.class, iae.getCause().getClass());
    }
}