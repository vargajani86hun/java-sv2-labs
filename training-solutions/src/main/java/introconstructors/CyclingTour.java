package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public void registerPerson(int person) {
        numberOfPeople += person;
    }

    public void ride(double km) {
        kms += km;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public static void main(String[] args) {
        CyclingTour ct = new CyclingTour("Bükk bejáró", LocalDate.of(2021, 11, 3));
        System.out.println(ct.getDescription() + " túra kezdete: " + ct.getStartTime());
        System.out.println("Jelenleg " + ct.getNumberOfPeople() + " ember vesz részt a túrán.");
        System.out.println("A résztvevők eddig " + ct.getKms() + "km távot tettek meg.");

        ct.registerPerson(5);
        ct.ride(10.5);
        System.out.println(ct.getDescription() + " túra kezdete: " + ct.getStartTime());
        System.out.println("Jelenleg " + ct.getNumberOfPeople() + " ember vesz részt a túrán.");
        System.out.println("A résztvevők eddig " + ct.getKms() + "km távot tettek meg.");
    }
}
