package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Product product;
        String name;
        int price, amount;

        System.out.println("Give a product's name: ");
        name = scr.nextLine();
        System.out.println("Give a price: ");
        price = scr.nextInt();
        scr.nextLine();

        product = new Product(name, price);

        System.out.println("Give the increase amount of price: ");
        amount = scr.nextInt();
        scr.nextLine();
        product.increasePrice(amount);
        System.out.println("The new price of " + product.getName() + " is " + product.getPrice());

        System.out.println("Give the decrease amount of price: ");
        amount = scr.nextInt();
        scr.nextLine();
        product.decreasePrice(amount);
        System.out.println("The new price of " + product.getName() + " is " + product.getPrice());

    }
}
