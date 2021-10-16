package classstructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        stock = 0;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public int store(int amount) {
        return stock += amount;
    }

    public int dispatch(int amount) {
        return stock -= amount;
    }
}
