package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void testCreate() {
        Position posi = new Position(3,5);

        assertEquals(3, posi.getPosX());
        assertEquals(5, posi.getPosY());
    }

    @Test
    void testDistanceFrom() {
        Position posi1 = new Position(3,5);
        Position posi2 = new Position(1,7);

        assertEquals(Math.sqrt(8), posi1.distanceFrom(posi2));
    }

    @Test
    void testDistanceFromNull() {
        Position posi = new Position(3,5);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> posi.distanceFrom(null));
        assertEquals("Position cannot be null!", iae.getMessage());
    }
}