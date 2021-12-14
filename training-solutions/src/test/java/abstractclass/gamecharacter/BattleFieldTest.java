package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BattleFieldTest {

    @Test
    void testFightBetweenWarriorsCloseTogether() {
        BattleField battleField = new BattleField();
        AxeWarrior warrior1 = new AxeWarrior(new Point(1, 2), new Random());
        AxeWarrior warrior2 = new AxeWarrior(new Point(2,1), new Random());
        battleField.fight(warrior1, warrior2);

        assertTrue(warrior1.isAlive() || warrior2.isAlive());
        assertTrue(battleField.getRound() > 0);
    }

    @Test
    void testFightBetweenArchers() {
        BattleField battleField = new BattleField();
        Archer rouge = new Archer(new Point(1,3), new Random());
        Archer amazon = new Archer(new Point(4,1), new Random());
        battleField.fight(rouge, amazon);

        assertTrue(battleField.getRound() > 0);
        assertTrue(rouge.isAlive() || amazon.isAlive());
    }

    @Test
    void testFight() {
        BattleField battleField = new BattleField();
        AxeWarrior barbarian = new AxeWarrior(new Point(1, 2), new Random());
        Archer amazon = new Archer(new Point(4,1), new Random());
        battleField.fight(amazon, barbarian);

        assertTrue(battleField.getRound() > 0);
        assertTrue(amazon.isAlive() || barbarian.isAlive());
    }
}