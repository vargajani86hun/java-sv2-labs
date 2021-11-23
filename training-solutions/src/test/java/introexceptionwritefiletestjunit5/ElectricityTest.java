package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityTest {

    @TempDir
    File tempFolder;

    @Test
    void testWriteStreets() throws IOException {
        Path path = tempFolder.toPath().resolve("streets.txt");
        Electricity electricity = new Electricity();
        electricity.addStreet("Szappanos utca");
        electricity.addStreet("Sarok utca");
        electricity.addStreet("Eötvös utca");
        electricity.addStreet("Veres utca");

        electricity.writeStreets(path);
        List<String> lines = Files.readAllLines(path);

        assertEquals(Arrays.asList(LocalDate.now().toString(), "Szappanos utca", "Sarok utca",
                "Eötvös utca", "Veres utca"), lines);
    }
}
