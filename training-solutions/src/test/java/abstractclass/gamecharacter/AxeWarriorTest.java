package abstractclass.gamecharacter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AxeWarriorTest {

    Random random;
    Character enemy;
    AxeWarrior barbarian;

    @BeforeEach
    void init() {
        random = new Random();
        enemy = new AxeWarrior(new Point(6,3), random);
        barbarian = new AxeWarrior(new Point(5,2), random);
    }

    @Test
    void testCreate() {
        AxeWarrior conan = new AxeWarrior(new Point(5,2), random);
        assertEquals(100, conan.getHitPoint());
        assertTrue(conan.isAlive());
        assertEquals(5, conan.getPosition().getX());
        assertEquals(2, conan.getPosition().getY());
    }

    @Test
    void testPrimaryAttack() {
        barbarian.primaryAttack(enemy);
        assertTrue(enemy.getHitPoint() >= 90);
        assertTrue(enemy.isAlive());
    }

    @Test
    void testSecondaryAttack() {
        barbarian.secondaryAttack(enemy);
        assertTrue(enemy.getHitPoint() >= 80);
        assertTrue(enemy.isAlive());
    }
}