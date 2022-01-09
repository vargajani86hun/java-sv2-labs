package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.addProduct(new Product("Mosógép", "IBW-M6050D"));
        webShop.addProduct(new Product("Mosogató gép", "IBW-M6050D"));
        webShop.addProduct(new Product("Vasaló", "PHI-G21H10"));
        webShop.addProduct(new Product("Hajszárító", "PHI-G21H10"));
        webShop.addProduct(new Product("Hajvasaló", "PHI-G21H10"));
        System.out.println(webShop.findHowMany(new Product("Hajvágó", "PHI-G21H10")));
    }

    public int findHowMany(Product product) {
        int counter = 0;
        for (Product actual : products) {
            if (actual.equals(product)) {
                counter++;
            }
        }
        return counter;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}
