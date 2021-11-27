package algorithmsmax.sales;

public class Salesperson {
    private String name;
    private int amount;
    private int target;

    public Salesperson(String name, int amount, int target) {
        this.name = name;
        this.amount = amount;
        this.target = target;
    }

    public int overTarget() {
        return amount-target;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getTarget() {
        return target;
    }
}
