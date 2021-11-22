package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    List<String> neptunUsers = new ArrayList<>();

    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        try {
            neptun.readNeptunUsersFromFile("src/main/texts/neptun.csv");
            System.out.println(neptun.getNeptunCodes());
        }
        catch (IOException ioe) {
            System.out.println("Unable to read file: " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }

    public List<String> getNeptunCodes() {
        List<String> neptunCodes = new ArrayList<>();
        for (String user : neptunUsers) {
            neptunCodes.add(user.split(",")[1]);
        }
        return neptunCodes;
    }

    public void readNeptunUsersFromFile(String path) throws IOException {
        neptunUsers = Files.readAllLines(Paths.get(path));
    }
}
