package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    private LocalDate today = LocalDate.now();
    private List<String> streets = new ArrayList<>();

    public Electricity() {
        streets.add(today.toString());
    }

    public void addStreet(String street) {
        streets.add(street);
    }

    public void writeStreets(Path path) throws IOException {
        Files.write(path, streets);
    }
}
