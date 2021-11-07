package controlselection.consonant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {
    ToConsonant tc;

    @BeforeEach
    void init() {
        tc = new ToConsonant();
    }

    @Test
    void testGetConsonant(){
        assertEquals('B', tc.getConsonant('A'));
        assertEquals('b', tc.getConsonant('a'));
        assertEquals('F', tc.getConsonant('E'));
        assertEquals('f', tc.getConsonant('e'));
        assertEquals('J', tc.getConsonant('I'));
        assertEquals('j', tc.getConsonant('i'));
        assertEquals('P', tc.getConsonant('O'));
        assertEquals('p', tc.getConsonant('o'));
        assertEquals('V', tc.getConsonant('U'));
        assertEquals('v', tc.getConsonant('u'));
        assertEquals('d', tc.getConsonant('d'));
    }
}
