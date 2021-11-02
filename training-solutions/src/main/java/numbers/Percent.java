package numbers;

public class Percent {
    public double getValue(int a, int b) {
        return (a / 100.) * b;
    }

    public double getBase(int a, int b) {
        return (a * 100.) / b;
    }

    public double getPercent(int a, int b) {
        return (b * 100.) / a;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println(percent.getValue(50,15));
        System.out.println(percent.getValue(200,30));

        System.out.println(percent.getBase(60, 30));
        System.out.println(percent.getBase(75, 15));

        System.out.println(percent.getPercent(60,30));
        System.out.println(percent.getPercent(50,15));
    }
}
