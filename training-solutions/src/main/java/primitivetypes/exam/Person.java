package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int zipCode;
    private double avgRating;

    public Person(String name, LocalDate dateOfBirth, int zipCode, double avgRating) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.zipCode = zipCode;
        this.avgRating = avgRating;
    }

    @Override
    public String toString() {
        return "A vizsgázó neve: " + name +
                ", születési ideje: " + dateOfBirth +
                ", irányító száma: " + zipCode +
                ", osztályzatainak átlaga: " + avgRating + "\n";
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAvgRating() {
        return avgRating;
    }
}
