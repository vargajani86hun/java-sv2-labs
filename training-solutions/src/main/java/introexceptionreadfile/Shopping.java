package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        try {
            List<String> toBuy = Files.readAllLines(Paths.get(
                    "src/main/texts/shoppinglist.txt"));
            for (String item : toBuy) {
                System.out.println(item);
            }
        }
        catch (IOException ioe) {
            System.out.println("Unable to read file: " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
