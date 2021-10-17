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
    }
}
