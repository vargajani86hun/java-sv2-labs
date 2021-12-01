package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void testGetSumFromFile() {
        FileReader fileReader = new FileReader();
        double sum = fileReader.getSumFromFile(Paths.get("src/test/resources/floatingnumbers.txt"));
        assertEquals(-42.7, sum, 0.0005);
    }

    @Test
    void testGetSumFromInvalidFile() {
        FileReader fileReader = new FileReader();
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> fileReader.getSumFromFile(Paths.get("src/test/resources/floatingnumbers_.txt")));
        assertEquals("Unable to read file!", ise.getMessage());
    }

}