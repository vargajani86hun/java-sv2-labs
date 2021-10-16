package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        cost = 0.3;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return fund * 0.01 * interestRate / 365 * days;
    }

    public double close(int days) {
        double total = active ? ((fund + this.getYield(days)) * (1 - cost / 100)) : 0;
        active = false;
        return total;
    }

}
