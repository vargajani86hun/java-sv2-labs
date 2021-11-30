package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PendriveTest {

    @Test
    void testCreate() {
        Pendrive pendrive = new Pendrive("KingMax", 16, 6500);

        assertEquals("KingMax", pendrive.getName());
        assertEquals(16, pendrive.getCapacity());
        assertEquals(6500, pendrive.getPrice());
    }

    @Test
    void testToString() {
        Pendrive pendrive = new Pendrive("KingMax", 16, 6500);

        assertEquals("KingMax 16GB pendrive. Ára: 6500HUF", pendrive.toString());
    }

    @Test
    void testRisePrice() {
        Pendrive pendrive = new Pendrive("KingMax", 16, 6500);
        pendrive.risePrice(5);

        assertEquals(6825, pendrive.getPrice());
    }

    @Test
    void testComparePricePerCapacity() {
        Pendrive pendrive = new Pendrive("KingMax", 16, 6500);
        Pendrive otherPendrive = new Pendrive("Kingston", 32, 9900);

        assertEquals(-1, otherPendrive.comparePricePerCapacity(pendrive));
        assertEquals(0, pendrive.comparePricePerCapacity(pendrive));
        assertEquals(1, pendrive.comparePricePerCapacity(otherPendrive));
    }

    @Test
    void testIsCheaperThan() {
        Pendrive pendrive = new Pendrive("KingMax", 16, 6500);
        Pendrive otherPendrive = new Pendrive("Kingston", 32, 9900);

        assertTrue(pendrive.isCheaperThan(otherPendrive));
        assertFalse(pendrive.isCheaperThan(pendrive));
    }

}