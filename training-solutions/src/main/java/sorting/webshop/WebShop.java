package sorting.webshop;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class WebShop {
    private List<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProductsOrderByName() {
        List<Product> orderedProducts = new LinkedList<>(products);
        orderedProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return orderedProducts;
    }

    public List<Product> getProductsOrderByPrice() {
        List<Product> orderedProducts = new LinkedList<>(products);
        orderedProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return orderedProducts;
    }

    public List<Product> getProductsOrderByDate() {
        List<Product> orderedProducts = new LinkedList<>(products);
        orderedProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return orderedProducts;
    }
}
