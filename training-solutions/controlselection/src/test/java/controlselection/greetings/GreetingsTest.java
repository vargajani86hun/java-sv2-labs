package controlselection.greetings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GreetingsTest {
    Greetings greetings;

    @BeforeEach
    void init() {
        greetings = new Greetings();
    }

    @Test
    void testMorning() {
        assertEquals("jó reggelt", greetings.sayGreetings(5, 0));
        assertEquals("jó reggelt", greetings.sayGreetings(8, 50));
        assertNotEquals("jó reggelt", greetings.sayGreetings(9, 0));
        assertNotEquals("jó reggelt", greetings.sayGreetings(4, 30));
        assertNotEquals("jó reggelt", greetings.sayGreetings(18, 35));
    }

    @Test
    void testDay() {
        assertEquals("jó napot", greetings.sayGreetings(9, 0));
        assertEquals("jó napot", greetings.sayGreetings(14, 10));
        assertEquals("jó napot", greetings.sayGreetings(18, 30));
        assertNotEquals("jó napot", greetings.sayGreetings(18,31));
        assertNotEquals("jó napot", greetings.sayGreetings(20,31));
        assertNotEquals("jó napot", greetings.sayGreetings(5,31));
        assertNotEquals("jó napot", greetings.sayGreetings(3,31));
    }

    @Test
    void testEvening() {
        assertEquals("jó estét", greetings.sayGreetings(18, 31));
        assertEquals("jó estét", greetings.sayGreetings(19, 31));
        assertNotEquals("jó estét", greetings.sayGreetings(20, 0));
        assertNotEquals("jó estét", greetings.sayGreetings(18, 0));
        assertNotEquals("jó estét", greetings.sayGreetings(8, 0));
        assertNotEquals("jó estét", greetings.sayGreetings(2, 0));
    }

    @Test
    void testNight() {
        assertEquals("jó éjt", greetings.sayGreetings(20, 0));
        assertEquals("jó éjt", greetings.sayGreetings(4, 0));
        assertNotEquals("jó éjt", greetings.sayGreetings(5, 10));
        assertNotEquals("jó éjt", greetings.sayGreetings(12, 10));
        assertNotEquals("jó éjt", greetings.sayGreetings(19, 10));
    }
}
