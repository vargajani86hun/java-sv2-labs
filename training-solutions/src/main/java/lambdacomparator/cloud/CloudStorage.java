package lambdacomparator.cloud;

import java.util.Objects;

public class CloudStorage implements Comparable<CloudStorage> {
    private String provider;
    private int space;
    private double price;
    private PayPeriod period;

    public CloudStorage(String provider, int space, PayPeriod period, double price) {
        this.provider = provider;
        this.space = space;
        this.price = price;
        this.period = period;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    @Override
    public int compareTo(CloudStorage o) {
        if (this.period == null && o.period == null) {
            return 0;
        }
        if (this.period == null) {
            return -1;
        }
        if (o.period == null) {
            return 1;
        }
        double diff = (this.price * 12 / this.period.getLength() / (this.space / 1000.))
                - (o.price * 12 / o.period.getLength() / (o.space / 1000.));
        if (diff < 0) {
            return -1;
        } else if (diff > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CloudStorage that)) return false;
        return space == that.space && Double.compare(that.price, price) == 0 && period == that.period;
    }

    @Override
    public int hashCode() {
        return Objects.hash(space, price, period);
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public double getPrice() {
        return price;
    }

    public PayPeriod getPeriod() {
        return period;
    }
}
