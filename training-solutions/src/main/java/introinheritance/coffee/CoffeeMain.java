package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("rövid presszó");
        coffee.setPrice(85);
        System.out.println(coffee.getName() + ": " + coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("fahéjas");
        cappuccino.setPrice(130);
        System.out.println(cappuccino.getName() + ": " + cappuccino.getPrice());
    }
}
