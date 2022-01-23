package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;

public class SportGadgetStore {
    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public int getNumberOfProducts() {
        return products.stream()
                .mapToInt(Product::getAmount)
                .sum();
    }

    public double getAveragePrice() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .average().orElse(0);
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics intSummaryStatistics = products.stream()
                .filter(p -> p.getPrice() >= minPrice)
                .mapToInt(Product::getAmount)
                .summaryStatistics();

        if (intSummaryStatistics.getCount() == 0) {
            return "Nincs ilyen termék.";
        }

        return String.format("Összesen %d féle termék, amelyekből minimum %d db, maximum %d db, összesen %d db van.",
                intSummaryStatistics.getCount(),
                intSummaryStatistics.getMin(),
                intSummaryStatistics.getMax(),
                intSummaryStatistics.getSum());
    }
}
