package searching;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {
    private String regNumber;
    private String description;
    private LocalDate foundAt;

    public LostProperty(String description, LocalDate foundAt) {
        this.description = description;
        this.foundAt = foundAt;
    }

    public LostProperty(String regNumber, String description, LocalDate foundAt) {
        this.regNumber = regNumber;
        this.description = description;
        this.foundAt = foundAt;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getFoundAt() {
        return foundAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LostProperty)) return false;
        LostProperty that = (LostProperty) o;
        return Objects.equals(description, that.description) && Objects.equals(foundAt, that.foundAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, foundAt);
    }

    @Override
    public int compareTo(LostProperty o) {
        Collator descriptionCollator = Collator.getInstance(new Locale("hu", "HU"));
        if (descriptionCollator.compare(this.description, o.description) == 0) {
            return this.foundAt.compareTo(o.foundAt);
        }
        return descriptionCollator.compare(this.description, o.description);
    }

    @Override
    public String toString() {
        return "LostProperty{" +
                "regNumber='" + regNumber + '\'' +
                ", description='" + description + '\'' +
                ", foundAt=" + foundAt +
                '}';
    }
}
