package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testContainsLongerWord() {
        List<String> words = Arrays.asList("kanál", "gránát", "kiwi", "mez",
                "birs", "kajszi", "dió", "hétvége", "sorozat");
        Word word = new Word();

        assertFalse(word.containsLongerWord(words, "gesztenye"));
        assertTrue(word.containsLongerWord(words, "alkat"));
    }
}