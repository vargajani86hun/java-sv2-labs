package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl ic = new IntroControl();
        System.out.println(ic.subtractTenIfGreaterThanTen(25));
        System.out.println(ic.subtractTenIfGreaterThanTen(8));

        System.out.println(ic.describeNumber(1));
        System.out.println(ic.describeNumber(0));

        System.out.println(ic.greetingToJoe("Joseph"));
        System.out.println(ic.greetingToJoe("Joe"));

        System.out.println(ic.calculateBonus(980_000));
        System.out.println(ic.calculateBonus(1_180_000));

        System.out.println(ic.calculateConsumption(2340, 2760));
        System.out.println(ic.calculateConsumption(9840, 60));

        ic.printNumbers(10);
        ic.printNumbersBetween(3, 8);
    }
}
