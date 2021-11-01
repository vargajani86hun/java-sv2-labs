package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);
        Integer b = 2;
        System.out.println(b);
        Integer c = a;
        System.out.println(c);
        Integer d = b.intValue();
        System.out.println(d);
        Integer e = Integer.valueOf(2);
        System.out.println(e);
        int f = Integer.valueOf(2);
        System.out.println(f);
        int g = Integer.valueOf(a);
        System.out.println(g);
        int h = Integer.valueOf(c);
        System.out.println(h);
        int i = Integer.parseInt("2");
        System.out.println(i);
        Integer j = Integer.parseInt("2");
        System.out.println(j);
    }
}
