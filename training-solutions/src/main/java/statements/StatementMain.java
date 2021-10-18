package statements;

public class StatementMain {

    public static void main(String[] args) {
        int x = 5 + 6;
        int y = 11 - x;
        int z = 8;
        boolean b = (x > z);
        boolean c = b || (z > 5);
        z++;
        System.out.println("Az x értéke: " + x + ", az y értéke: " + y + ", a z értéke: " + z);
        System.out.println("A b értéke: " + b + ", a c értéke: " + c);

    }
}
