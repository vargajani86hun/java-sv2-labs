package introexceptionthrow;

import java.util.Scanner;

public class Validation {
    public void validateName(String name) {
        if (("".equals(name)) || (name == null)) {
            throw new IllegalArgumentException("Nem adott meg nevet!");
        }
    }

    public void validateAge(String ageString) {
        if (("".equals(ageString)) || (ageString == null)){
            throw new IllegalArgumentException("Nem adott meg kort!");
        }
        Scanner sc = new Scanner(ageString);
        if (!sc.hasNextInt()) {
            throw new IllegalArgumentException("Nem számot adott meg életkornak!");
        }
        int age = Integer.parseInt(ageString);
        if ((age < 0) || (age > 120)) {
            throw new IllegalArgumentException("A megadott számot nem lehet " +
                    "életkorként értelmezni: " + ageString);
        }
    }
}
