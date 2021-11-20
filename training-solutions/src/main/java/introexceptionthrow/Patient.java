package introexceptionthrow;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if ((name == null) || (name.trim().length() == 0)){
            throw new IllegalArgumentException("Nem adott meg nevet!");
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("Érvénytelen születési év!");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a nevét:");
        String name = sc.nextLine();
        System.out.println("Adja meg a TAJ számát:");
        String socialSecurityNumber = sc.nextLine();
        System.out.println("Adj meg a születési évét:");
        int yearOfBirth = sc.nextInt();
        Patient patient = new Patient(name, socialSecurityNumber, yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
