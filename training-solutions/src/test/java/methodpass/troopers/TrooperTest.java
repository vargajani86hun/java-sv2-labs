package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrooperTest {

    @Test
    void testCreate() {
        Trooper trooper = new Trooper("Jim Raynor");

        assertEquals("Jim Raynor", trooper.getName());
        assertEquals(0, trooper.getPosition().getPosX());
        assertEquals(0, trooper.getPosition().getPosY());
    }

    @Test
    void testCreateWithNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Trooper(null));
        assertEquals("Name cannot be empty!", iae.getMessage());
    }

    @Test
    void testCreateWithEmpty() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Trooper("   "));
        assertEquals("Name cannot be empty!", iae.getMessage());
    }

    @Test
    void testChangePosition() {
        Trooper trooper = new Trooper("Sarah Kerrigan");
        trooper.changePosition(new Position(10.5, 4.2));

        assertEquals(10.5, trooper.getPosition().getPosX());
        assertEquals(4.2, trooper.getPosition().getPosY());
    }

    @Test
    void testChangePositionToNull() {
        Trooper trooper = new Trooper("Sarah Kerrigan");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> trooper.changePosition(null));
        assertEquals("Position cannot be null!", iae.getMessage());
    }

    @Test
    void testDistanceFrom() {
        Trooper trooper = new Trooper("Edmund Duke");
        double distance = trooper.distanceFrom(new Position(3, 4));

        assertEquals(5, distance);
    }

    @Test
    void testDistanceFromNull() {
        Trooper trooper = new Trooper("Edmund Duke");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> trooper.distanceFrom(null));
        assertEquals("Position cannot be null!", iae.getMessage());
    }
}