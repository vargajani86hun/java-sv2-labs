package methodpass.troopers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HeadQuarterTest {
    HeadQuarter headQuarter = new HeadQuarter();

    @BeforeEach
    void init() {
        headQuarter.addTrooper(new Trooper("Jim Raynor"));
        headQuarter.addTrooper(new Trooper("Sarah Kerrigan"));
        headQuarter.addTrooper(new Trooper("Edmund Duke"));
        headQuarter.addTrooper(new Trooper("Arcturus Mengsk"));
        headQuarter.addTrooper(new Trooper("Gerard DuGalle"));
        headQuarter.addTrooper(new Trooper("Samir Duran"));
    }

    @Test
    void testCreate() {
        HeadQuarter headQ = new HeadQuarter();

        assertEquals(0, headQ.getTroopers().size());
    }

    @Test
    void testAddTrooper() {
        HeadQuarter headQ = new HeadQuarter();
        headQ.addTrooper(new Trooper("Jim Raynor"));

        assertEquals(1, headQ.getTroopers().size());
        assertEquals("Jim Raynor", headQ.getTroopers().get(0).getName());
    }

    @Test
    void testAddTrooperWithNull() {
        HeadQuarter headQ = new HeadQuarter();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> headQ.addTrooper(null));
        assertEquals("Trooper cannot be null!", iae.getMessage());
    }

    @Test
    void testMoveTrooperByName() {
        headQuarter.moveTrooperByName("Edmund Duke", new Position(31.1, 70.3));

        assertEquals(31.1, headQuarter.getTroopers().get(2).getPosition().getPosX());
        assertEquals(70.3, headQuarter.getTroopers().get(2).getPosition().getPosY());
    }

    @Test
    void testMoveTrooperByWrongName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> headQuarter.moveTrooperByName("John Rambo", new Position(12,12)));
        assertEquals("Trooper John Rambo is not exist!", iae.getMessage());
    }

    @Test
    void testMoveTrooperByEmptyName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> headQuarter.moveTrooperByName("  ", new Position(12, 12)));
        assertEquals("Name cannot be empty!", iae.getMessage());
    }

    @Test
    void testMoveTrooperByNullName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> headQuarter.moveTrooperByName(null, new Position(12, 12)));
        assertEquals("Name cannot be empty!", iae.getMessage());
    }

    @Test
    void testMoveTrooperByNameToNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> headQuarter.moveTrooperByName("Samir Duran", null));
        assertEquals("Position cannot be null!", iae.getMessage());
    }

    @Test
    void testMoveClosestTrooper() {
        headQuarter.moveTrooperByName("Jim Raynor", new Position(42.8, 51.5));
        headQuarter.moveTrooperByName("Sarah Kerrigan", new Position(45.8, 50.1));
        headQuarter.moveTrooperByName("Edmund Duke", new Position(121.1, 151.7));
        headQuarter.moveTrooperByName("Arcturus Mengsk", new Position(-42.8, 213.8));
        headQuarter.moveTrooperByName("Gerard DuGalle", new Position(72.3, 57.9));
        headQuarter.moveTrooperByName("Samir Duran", new Position(212.1, -71.2));

        headQuarter.moveClosestTrooper(new Position(61.3, 46.2));
        assertEquals(61.3, headQuarter.getTroopers().get(1).getPosition().getPosX());
    }

    @Test
    void testMoveClosestTrooperToNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> headQuarter.moveClosestTrooper(null));
        assertEquals("Position cannot be null!", iae.getMessage());
    }
}