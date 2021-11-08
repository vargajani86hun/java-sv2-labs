package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü", 1, 3.2);

        assertEquals("Süsü", dragon.getName());

        assertNotEquals("Smaug", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü", 1, 3.2);

        assertEquals(1, dragon.getNumberOfHeads());

        assertTrue(1 == dragon.getNumberOfHeads());

        assertFalse(1 != dragon.getNumberOfHeads());

    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Süsü", 1, 3.2);

        assertEquals(3.2, dragon.getHeight(), 0.05);
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("Süsü", 1, 3.2);
        Dragon anotherDragon = null;

        assertNull(anotherDragon);

        assertNotNull(dragon);
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Süsü", 1, 3.2);
        Dragon anotherDragon = dragon;

        assertSame(anotherDragon, dragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Süsü", 1, 3.2);
        Dragon anotherDragon = new Dragon("Süsü", 1, 3.2);

        assertNotSame(anotherDragon, dragon);
    }
}
