package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    void testGetSum() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = new Numbers().getSum(numbers);
        assertEquals(45, result);
    }

}