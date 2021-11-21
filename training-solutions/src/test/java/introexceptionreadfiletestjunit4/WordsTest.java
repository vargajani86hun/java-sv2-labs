package introexceptionreadfiletestjunit4;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThrows;

import java.nio.file.Paths;

public class WordsTest {
    Words words = new Words();

    @Test
    public void testGetFirstWordWithAWithValidFiles() {
        assertThat("Anna", equalTo(words.getFirstWordWithA(Paths.get("src/test/texts/words.txt"))));
        assertThat("A", equalTo(words.getFirstWordWithA(Paths.get("src/test/texts/otherwords.txt"))));
    }

    @Test
    public void testGetFirstWordWithAWithInvalidFile() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(Paths.get("")));
        assertThat("Unable to read file!", equalTo(ise.getMessage()));
    }
}
