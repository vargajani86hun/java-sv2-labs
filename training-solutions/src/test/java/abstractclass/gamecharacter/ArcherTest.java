package abstractclass.gamecharacter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {

    Random random;
    Character enemy;
    Archer amazon;

    @BeforeEach
    void init() {
        random = new Random();
        enemy = new Archer(new Point(2, 3), random);
        amazon = new Archer(new Point(10, 11), random);
    }

    @Test
    void testCreate() {
        Archer amazon = new Archer(new Point(10, 11), random);
        assertEquals(true, amazon.isAlive());
        assertEquals(10, amazon.getPosition().getX());
        assertEquals(11, amazon.getPosition().getY());
        assertEquals(100, amazon.getHitPoint());
        assertEquals(100, amazon.getNumberOfArrow());
    }

    @Test
    void testPrimaryAttack() {
        amazon.primaryAttack(enemy);
        assertTrue(enemy.getHitPoint() >= 90);
        assertTrue(enemy.isAlive());
    }

    @Test
    void testSecondaryAttack() {
        amazon.secondaryAttack(enemy);
        assertEquals(99, amazon.getNumberOfArrow());
        assertTrue(enemy.getHitPoint() >= 96);
        assertTrue(enemy.isAlive());
    }
}