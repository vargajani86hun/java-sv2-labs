package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void testGetNumberOfVowels() {
        Vowels vowels = new Vowels();
        assertEquals(2, vowels.getNumberOfVowels("görög"));
        assertEquals(4, vowels.getNumberOfVowels("Öröm óda"));
        assertEquals(0, vowels.getNumberOfVowels("sdfghjkl"));
    }

}