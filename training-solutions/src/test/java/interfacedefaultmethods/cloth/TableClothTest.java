package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void testSquare() {
        Square cloth = new TableCloth(5);

        assertEquals(5, cloth.getSide());
        assertEquals(4, cloth.getNumberOfSides());
        assertEquals(25, cloth.getArea());
        assertEquals(20, cloth.getPerimeter());
        assertEquals(Math.sqrt(2) * 5, cloth.getLengthOfDiagonal(), 0.005);
    }

}