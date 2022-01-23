package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    private List<CoffeeOrder> coffeeOrders;

    public Cafe(List<CoffeeOrder> coffeeOrders) {
        this.coffeeOrders = coffeeOrders;
    }

    public void addOrder(CoffeeOrder order) {
        coffeeOrders.add(order);
    }

    public Integer getTotalIncome() {
        return coffeeOrders.stream()
                .map(CoffeeOrder::getCoffees)
                .flatMap(List<Coffee>::stream)
                .mapToInt(Coffee::getPrice)
                .sum();
    }

    public Integer getTotalIncome(LocalDate date) {
        return coffeeOrders.stream()
                .filter(co -> co.getDateTime().toLocalDate().equals(date))
                .map(CoffeeOrder::getCoffees)
                .flatMap(List<Coffee>::stream)
                .mapToInt(Coffee::getPrice)
                .sum();
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return coffeeOrders.stream()
                .map(CoffeeOrder::getCoffees)
                .flatMap(List<Coffee>::stream)
                .filter(c -> c.getCoffeeType() == type)
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from) {
        return coffeeOrders.stream()
                .filter(co -> co.getDateTime().isAfter(from))
                .toList();
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return coffeeOrders.stream()
                .filter(co -> co.getDateTime().toLocalDate().equals(date))
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .toList();
    }
}
