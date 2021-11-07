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
    void testGreetings() {
        assertEquals("jó reggelt", greetings.sayGreetings(5, 0));
        assertEquals("jó reggelt", greetings.sayGreetings(8, 50));

        assertEquals("jó napot", greetings.sayGreetings(9, 0));
        assertEquals("jó napot", greetings.sayGreetings(14, 10));
        assertEquals("jó napot", greetings.sayGreetings(18, 30));

        assertEquals("jó estét", greetings.sayGreetings(18, 31));
        assertEquals("jó estét", greetings.sayGreetings(19, 31));

        assertEquals("jó éjt", greetings.sayGreetings(20, 0));
        assertEquals("jó éjt", greetings.sayGreetings(4, 0));

    }
}
