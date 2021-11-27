package algorithmsmax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void testGetLongestOcean() {
        assertEquals(16, new Plane().getLongestOcean(
                "100000001111100000000000011111111110000100000100001000001" +
                        "11111110000101000000000111110000000000000000100000001" +
                        "000000000000111111000000000100000000000011"));
    }
}