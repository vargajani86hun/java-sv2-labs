package exceptions.measurement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    Measurement measure;
    List<String> data;

    @BeforeEach
    void init() {
        measure = new Measurement();
        data = measure.readFromFile(Path.of(
                "src/test/resources/measurementdata.csv"));
    }

    @Test
    void testReadFromFile() {
        List<String> lines = measure.readFromFile(Path.of(
                "src/test/resources/measurementdata.csv"));
        assertEquals(11, lines.size());
    }

    @Test
    void testReadFromInvalidFile() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> measure.readFromFile(Path.of(
                        "src/test/resources/_easurementdata.csv")));
        assertEquals("File not found!", ise.getMessage());
    }

    @Test
    void testValidate() {
        List<String> incorrectLines = measure.validate(data);
        assertEquals(8, incorrectLines.size());
    }

}