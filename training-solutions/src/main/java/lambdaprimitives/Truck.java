package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Truck {
    private List<Cargo> thingsToLoad;

    public Truck(List<Cargo> thingsToLoad) {
        this.thingsToLoad = thingsToLoad;
    }

    public double getShortestLength() {
        return thingsToLoad.stream()
                .mapToDouble(Cargo::getLength)
                .min()
                .orElse(0.0);
    }

    public int getTotalWeight() {
        return thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .sum();
    }

    public double getAverageWeight() {
        return thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("No cargo."));
    }

    public int getMaxWeight() {
        return thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .max()
                .orElse(0);
    }

    public String getWeightStatistics() {
        IntSummaryStatistics weightStatistics = thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .summaryStatistics();

        if (weightStatistics.getCount() == 0) {
            return "No cargo.";
        }

        return String.format("A rakományban található %d tétel, melyeknek összsúlya %d kg, " +
                "közülük a legnehezebb %d kg, a legkönnyebb %d kg. A súlyuk átlagosan %.1f kg.",
                weightStatistics.getCount(),
                weightStatistics.getSum(),
                weightStatistics.getMax(),
                weightStatistics.getMin(),
                weightStatistics.getAverage());
    }
}
