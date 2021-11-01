package enumtype.position;

public enum Position {
    DOCUMENTATION_OFFICER(310_000, "Cafateria, céges telefon és laptop."),
    SAFETY_CHAMPION(350_000, "Cafateria, céges telefon és laptop."),
    SENIOR_ENGINIER(420_000, "Cafateria, céges telefon, laptop, autó és üzemanyag kártya.");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
