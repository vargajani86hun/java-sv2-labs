package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity, price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + capacity + "GB pendrive. Ára: " + price + "HUF";
    }

    public void risePrice(int percent) {
        price += price * percent / 100;
    }

    public int comparePricePerCapacity(Pendrive other) {
        if (this.getPricePerCapacity() > other.getPricePerCapacity()) {
            return 1;
        }
        else if (this.getPricePerCapacity() < other.getPricePerCapacity()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public boolean isCheaperThan(Pendrive other) {
        return this.price < other.price;
    }

    private int getPricePerCapacity() {
        return price / capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}
