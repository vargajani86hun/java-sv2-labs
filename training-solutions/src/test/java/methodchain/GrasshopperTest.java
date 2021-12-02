package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    @Test
    void testHopOncePositive() {
        Grasshopper grass = new Grasshopper();
        assertEquals(1, grass.hopOnce(Direction.POSITIVE).getPosition());
    }

    @Test
    void testHopeOnceNegative() {
        Grasshopper grass = new Grasshopper();
        assertEquals(-1, grass.hopOnce(Direction.NEGATIVE).getPosition());
    }

    @Test
    void testMoveFromZeroToThreeWithFiveHops() {
        Grasshopper grass = new Grasshopper();
        grass.moveFromZeroToThreeWithFiveHops();
        assertEquals(3, grass.getPosition());
    }
}