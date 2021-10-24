package finalmodifier;

public class TaxCalculator {
    public static final int VAT = 27;

    public double tax (double price) {
        return price * VAT / 100.0;
    }

    public double priceWithTax(double price) {
        return price * (1.0 + VAT / 100.0);
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println("A termék ÁFA tartalma nettó 10.000Ft-os ár mellet: " +
                taxCalculator.tax(10_000));
        System.out.println("A 10.000Ft nettő értékű termék bruttó ára: " +
                taxCalculator.priceWithTax(10_000));
    }
}
