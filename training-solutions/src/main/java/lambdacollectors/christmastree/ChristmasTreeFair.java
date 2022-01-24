package lambdacollectors.christmastree;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChristmasTreeFair {
    private List<ChristmasTree> trees;

    public ChristmasTreeFair(List<ChristmasTree> trees) {
        this.trees = trees;
    }

    public Map<PineTreeType, Long> getCountByType() {
        return trees.stream()
                .collect(Collectors.groupingBy(ChristmasTree::getType,
                        Collectors.counting()));
    }

    public double getMaxHeightByType(PineTreeType type) {
        return trees.stream()
                .filter(tree -> tree.getType() == type)
                .map(ChristmasTree::getHeight)
                .collect(Collectors.maxBy(Comparator.naturalOrder()))
                .orElse(0.0);
    }

    public double getAveragePrice() {
        return trees.stream()
                .collect(Collectors.averagingDouble(tree -> tree.getType().getPricePerMeter()));
    }
}
