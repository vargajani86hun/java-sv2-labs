package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Double> kms;
    private String name;

    public Run(String name) {
        this.name = name;
        this.kms = new ArrayList<>();
    }

    public void addRun(double km) {
        kms.add(km);
        System.out.println(printFormattedRunText());
    }

    public String printFormattedRunText() {
        LocalDate today = LocalDate.now();
        return String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez " +
                "a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!",
                name, today, kms.size(), kms.get(kms.size() - 1));
    }

    public static void main(String[] args) {
        Run runner = new Run("Kiss Péter");
        runner.addRun(12.3);
        runner.addRun(8.8);
        runner.addRun(11.7);
        runner.addRun(14.1);
    }
}
