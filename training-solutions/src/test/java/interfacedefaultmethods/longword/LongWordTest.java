package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void testReadLongWord() {
        LongWord lw = new LongWord(Path.of(
                "src/test/resources/longword.txt"));
        assertEquals("LONGWORD", lw.getLongWord());
    }

}