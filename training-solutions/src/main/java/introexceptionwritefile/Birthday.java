package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    private List<String> friends = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hány ismerőse születésnapját szeretné lejegyezni?");
        Scanner sc = new Scanner(System.in);
        int numberOfFriends = sc.nextInt();
        sc.nextLine();

        Birthday birthday = new Birthday();
        birthday.readFriends(numberOfFriends);

        try {
            birthday.writeListToFile(Paths.get("birthdays.txt"));
            System.out.println("Ismerőseid születésnapja a " +
                    "birthdays.txt állományba lettek mentve.");
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            ise.getCause().printStackTrace();
        }
    }

    private List<String> readFriends(int numberOfFriends) {

        Scanner scr = new Scanner(System.in);
        for (int i = 1; i <= numberOfFriends; i++) {
            System.out.println("Add meg a(z) " + i +
                    ". ismerősöd nevét és születési dátumát:");
            friends.add(scr.nextLine());
        }
        return friends;
    }

    private void writeListToFile(Path path) {
        try {
            Files.write(path, friends);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to create file!", ioe);
        }
    }
}
