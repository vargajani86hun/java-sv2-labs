package algorithmsfilter.prefix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    Prefix prefix = new Prefix();
    List<String> words = new ArrayList<>();

    @BeforeEach
    void init() {
        words.add("alma");
        words.add("blama");
        words.add("almafa");
        words.add("aladár");
        words.add("mandragóra");
        words.add("ablak");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> result = prefix.getWordsStartWith(words, "al");
        assertEquals(3, result.size());
        assertTrue(result.contains("alma"));
        assertFalse(result.contains("ablak"));
    }

    @Test
    void testGetWordsStartWithInvalidPrefix() {
        List<String> result = prefix.getWordsStartWith(words, "lab");
        assertNull(result);
    }

    @Test
    void testGetWordsStartWithNullList() {
        List<String> result = prefix.getWordsStartWith(null, "lab");
        assertNull(result);
    }
}