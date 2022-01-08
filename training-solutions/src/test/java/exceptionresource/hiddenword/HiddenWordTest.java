package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    @Test
    void testGetHiddenWord() {
        assertEquals("ALMA KÖRTE", new HiddenWord().getHiddenWord(
                Path.of("src/test/resources/hiddenword.txt")));
    }

}