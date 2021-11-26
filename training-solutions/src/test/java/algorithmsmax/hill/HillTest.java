package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void testGetMax() {
        List<Integer> hills = Arrays.asList(849, 678, 917, 1014, 782, 883);
        assertEquals(1014, new Hill().getMax(hills));
    }
}