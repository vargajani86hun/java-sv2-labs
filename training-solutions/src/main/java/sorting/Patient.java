package sorting;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String socialSecNumber;
    private LocalDateTime visitTime;

    public Patient(String name, String socialSecNumber, LocalDateTime visitTime) {
        this.name = name;
        this.socialSecNumber = socialSecNumber;
        this.visitTime = visitTime;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecNumber() {
        return socialSecNumber;
    }

    public LocalDateTime getVisitTime() {
        return visitTime;
    }
}
