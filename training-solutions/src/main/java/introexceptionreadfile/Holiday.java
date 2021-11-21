package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        List<String> toBring;
        try {
            toBring = Files.readAllLines(Paths.get(
                    "src/main/texts/holiday.txt"));
            for (String item : toBring) {
                System.out.println(item);
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
