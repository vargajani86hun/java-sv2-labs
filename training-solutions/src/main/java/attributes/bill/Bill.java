package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("shampoo", 450, 3, 0.27);
        System.out.println("Ön " + billItem.getQuantity() + "db " + billItem.getProduct() + " vásárolt.");
        System.out.println(("A " + billItem.getProduct() + " ára nettó " + billItem.getPrice() + "Ft"));
        System.out.println("A bruttó ár: " + (billItem.getPrice() * (1 + billItem.getVatPercent())));
        System.out.println("A számla teljes, bruttó összege: " + billItem.calculateTotalPrice());

    }
}
