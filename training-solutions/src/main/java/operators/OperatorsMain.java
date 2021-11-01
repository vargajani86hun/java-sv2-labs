package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators op = new Operators();
        System.out.println(op.toBinaryString(11));
        System.out.println(op.isEven(11));
        System.out.println(op.isEven(10));
        System.out.println(op.getResultOfDivision(13,3));

        String s = null;
        System.out.println(op.isNull(s));
        s = "már nem üres";
        System.out.println(op.isNull(s));

        System.out.println(op.isEmpty(s));
        s = "";
        System.out.println(op.isEmpty(s));

    }
}
