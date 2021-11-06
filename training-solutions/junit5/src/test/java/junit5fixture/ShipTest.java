package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("RMS Titanic", 1911, 269);
    }

    @Test
    void testName() {
        assertEquals("RMS Titanic", ship.getName());

        assertNotEquals("Titanic", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1911, ship.getYearOfConstruction());

        assertTrue(1911 == ship.getYearOfConstruction());

        assertFalse(1911 != ship.getYearOfConstruction());
    }

    @Test
    void testLength() {
        assertEquals(269, ship.getLength(), 0.05);
    }

    @Test
    void testNull() {
        Ship otherShip = null;

        assertNull(otherShip);

        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship otherShip = ship;

        assertSame(otherShip, ship);
    }

    @Test
    void testNotSameObjects() {
        Ship otherShip = new Ship("RMS Titanic", 1911, 269);

        assertNotSame(otherShip, ship);
    }
}
