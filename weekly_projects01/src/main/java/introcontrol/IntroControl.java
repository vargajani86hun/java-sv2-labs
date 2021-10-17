package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number) {
        /*
        return (number <= 10) ? number : (number -= 10);
         */
        if (number <= 10)
            return number;
        else
            return number -= 10;
    }

    public String describeNumber(int number) {
//      return number == 0 ? "zero" : "not zero";
        if (number == 0)
            return "zero";
        return "not zero";
    }

    public String greetingToJoe(String name) {
        //return ("Joe").equals(name) ? "Hello Joe" : "";
        if (("Joe").equals(name))
            return "Hello Joe";
        return "";
    }

    public int calculateBonus (int sale) {
        //return (sale >= 1_000_000) ? (sale / 10) : 0;
        if (sale < 1_000_000)
            return 0;
        return sale / 10;
    }

    public int calculateConsumption(int prev, int next) {
        //return (prev > next) ? (9999 - prev + next + 1) : (next - prev);
        if (prev < next)
            return next - prev;
        return 9999 - prev + next + 1;
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++){
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }

}
