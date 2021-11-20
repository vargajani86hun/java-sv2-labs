package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Üdvözöljük regisztrációs felületünkön!");
        Registration reg = new Registration();
        String name = reg.pleasName();
        String age = reg.pleaseAge();

        System.out.println("Az ön által megadott felhasználónév: " + name);
        System.out.println("Az ön által megadott életkor: " + age);
    }

    public String pleasName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg felhasználó nevét:");
        String name = sc.nextLine();
        try {
            new Validation().validateName(name);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        return name;
    }

    public String pleaseAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg az életkorát:");
        String ageString = sc.nextLine();
        try {
            new Validation().validateAge(ageString);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        return ageString;
    }
}
