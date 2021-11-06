package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWord("alma");
        words.addWord("banán");
        words.addWord("alga");
        words.addWord("almafa");
        words.addWord("ananász");
        words.addWord("makk");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> expected = new ArrayList<>(Arrays.asList("alma", "alga", "almafa"));
        words.getWordsStartWith("al");
        List<String> received = words.getWords();

        assertEquals(expected, received);
    }

    @Test
    void testGetWordsWithLength() {
        List<String> expected = new ArrayList<>(Arrays.asList("alma", "alga", "makk"));
        words.getWordsWithLength(4);
        List<String> received = words.getWords();

        assertEquals(expected, received);
    }
}
