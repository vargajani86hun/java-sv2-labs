package introexceptiontrycatchtrace;

public class Calculator {
    private int a, b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int summation() {
        return a + b;
    }

    public int subtraction() {
        return a - b;
    }

    public int multiplication() {
        return a * b;
    }

    public int division() {
        return a / b;
    }
}
