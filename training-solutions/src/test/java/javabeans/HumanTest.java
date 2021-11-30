package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human = new Human();

    @Test
    void testGetSetName() {
        human.setName("Tóth Tamás");

        assertEquals("Tóth Tamás", human.getName());
    }

    @Test
    void testGetSetWeight() {
        human.setWeight(74.8);

        assertEquals(74.8, human.getWeight());
    }

    @Test
    void testGetSetIQ() {
        human.setIq(112);

        assertEquals(112, human.getIq());
    }
}