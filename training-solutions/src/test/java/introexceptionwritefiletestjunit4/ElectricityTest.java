package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ElectricityTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testWriteStreets() throws IOException {
        Electricity electricity = new Electricity();
        electricity.addStreet("Mátyás utca");
        electricity.addStreet("Ótemető utca");
        electricity.addStreet("Huszár Gál utca");
        electricity.addStreet("Budai Nagy Antal utca");
        Path path = tempFolder.newFile("streets.txt").toPath();
        electricity.writeStreets(path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList(LocalDate.now().toString(), "Mátyás utca",
                "Ótemető utca", "Huszár Gál utca", "Budai Nagy Antal utca"),
                lines);
    }
}
