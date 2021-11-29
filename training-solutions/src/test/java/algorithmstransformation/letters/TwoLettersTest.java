package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void testGetFirstTwoLetters() {
        TwoLetters twoLetters = new TwoLetters();
        List<String> words = Arrays.asList("abrak", "falka","omikron", "kalács");
        List<String> actual = twoLetters.getFirstTwoLetters(words);

        assertEquals(4, actual.size());
        assertEquals(Arrays.asList("ab", "fa", "om", "ka"), actual);
    }

}