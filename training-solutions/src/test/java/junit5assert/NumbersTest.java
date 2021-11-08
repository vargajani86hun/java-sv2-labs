package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {
    @Test
    void testGetEvenNumbers() {
        Numbers numbers = new Numbers();
        int[] anyNumbers = {2, 8, 5, 6, 2, 3, 9};
        int [] evenNumbers = {2, 8, 0, 6, 2, 0, 0};

        assertArrayEquals(evenNumbers, numbers.getEvenNumbers(anyNumbers));

    }
}
