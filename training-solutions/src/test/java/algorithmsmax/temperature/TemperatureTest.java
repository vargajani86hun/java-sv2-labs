package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void testGetMin() {
        List<Integer> temps = Arrays.asList(5,5,4,4,3,2,1,1,3,4,6,8,11,12,12,11,10,10,9,9,8,7,7,6);
        assertEquals(1, new Temperature().getMin(temps));
    }
}