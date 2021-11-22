package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordsTest {

    @Test
    void testGetFirstWordWithAByValidFile() {
        assertEquals("Anna", new Words().getFirstWordWithA(
                Paths.get("src/test/texts/words.txt")));
        assertEquals("A", new Words().getFirstWordWithA(
                Paths.get("src/test/texts/otherwords.txt")));
    }

    @Test
    void testGetFirstWordWithAByInvalidFile() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> new Words().getFirstWordWithA(Paths.get("")));
        assertEquals("Unable to read file!", ise.getMessage());
    }
}
