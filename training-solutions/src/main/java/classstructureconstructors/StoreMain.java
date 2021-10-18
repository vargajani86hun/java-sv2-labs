package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store innerStore = new Store("Gloves");
        Store outerStore = new Store("Coats");
        System.out.println("The inner store has " + innerStore.getStock() + "pcs " + innerStore.getProduct());
        System.out.println("The outer store has " + outerStore.getStock() + "pcs " + outerStore.getProduct());

        innerStore.store(5);
        outerStore.store(11);
        System.out.println("The inner store has " + innerStore.getStock() + "pcs " + innerStore.getProduct());
        System.out.println("The outer store has " + outerStore.getStock() + "pcs " + outerStore.getProduct());

        innerStore.store(7);
        outerStore.dispatch(8);
        System.out.println("The inner store has " + innerStore.getStock() + "pcs " + innerStore.getProduct());
        System.out.println("The outer store has " + outerStore.getStock() + "pcs " + outerStore.getProduct());

        innerStore.dispatch(10);
        outerStore.store(3);
        System.out.println("The inner store has " + innerStore.getStock() + "pcs " + innerStore.getProduct());
        System.out.println("The outer store has " + outerStore.getStock() + "pcs " + outerStore.getProduct());

        innerStore.store(4);
        outerStore.store(5);
        System.out.println("The inner store has " + innerStore.getStock() + "pcs " + innerStore.getProduct());
        System.out.println("The outer store has " + outerStore.getStock() + "pcs " + outerStore.getProduct());

        innerStore.dispatch(9);
        outerStore.store(22);
        System.out.println("The inner store has " + innerStore.getStock() + "pcs " + innerStore.getProduct());
        System.out.println("The outer store has " + outerStore.getStock() + "pcs " + outerStore.getProduct());

        innerStore.store(3);
        outerStore.dispatch(30);
        System.out.println("The inner store has " + innerStore.getStock() + "pcs " + innerStore.getProduct());
        System.out.println("The outer store has " + outerStore.getStock() + "pcs " + outerStore.getProduct());
    }
}
