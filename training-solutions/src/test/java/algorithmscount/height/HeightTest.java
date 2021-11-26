package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void testCountChildrenWithHeightGreaterThan() {
        Height height = new Height();
        List<Integer> heights = Arrays.asList(134,152,128,143,148,122,132,127,135,130);
        assertEquals(0,
                height.countChildrenWithHeightGreaterThan(heights,160));
        assertEquals(1,
                height.countChildrenWithHeightGreaterThan(heights, 150));
        assertEquals(7,
                height.countChildrenWithHeightGreaterThan(heights, 130));
        assertEquals(10,
                height.countChildrenWithHeightGreaterThan(heights, 120));
    }
}