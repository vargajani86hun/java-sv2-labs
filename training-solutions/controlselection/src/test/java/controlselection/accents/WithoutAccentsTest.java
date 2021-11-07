package controlselection.accents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {
    WithoutAccents wa;

    @BeforeEach
    void init() {
        wa = new WithoutAccents();
    }

    @Test
    void testGetVowelsWithoutAccents() {
        assertEquals('A', wa.getVowelWithoutAccents('Á'));
        assertEquals('a', wa.getVowelWithoutAccents('á'));
        assertEquals('E', wa.getVowelWithoutAccents('É'));
        assertEquals('e', wa.getVowelWithoutAccents('é'));
        assertEquals('I', wa.getVowelWithoutAccents('Í'));
        assertEquals('i', wa.getVowelWithoutAccents('í'));
        assertEquals('O', wa.getVowelWithoutAccents('Ö'));
        assertEquals('o', wa.getVowelWithoutAccents('ő'));
        assertEquals('U', wa.getVowelWithoutAccents('Ú'));
        assertEquals('u', wa.getVowelWithoutAccents('ü'));
        assertEquals('e', wa.getVowelWithoutAccents('e'));

    }
}
