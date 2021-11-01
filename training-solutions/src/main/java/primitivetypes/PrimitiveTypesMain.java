package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("a: " + a);
        Integer b = 2;
        System.out.println("b: " + b);
        Integer c = a;
        System.out.println("c: " + c);
        Integer d = b.intValue();
        System.out.println("d: " + d);
        Integer e = Integer.valueOf(2);
        System.out.println("e: " + e);
        int f = Integer.valueOf(2);
        System.out.println("f: " + f);
        int g = Integer.valueOf(a);
        System.out.println("g: " + g);
        int h = Integer.valueOf(c);
        System.out.println("h: " + h);
        int i = Integer.parseInt("2");
        System.out.println("i: " + i);
        Integer j = Integer.parseInt("2");
        System.out.println("j: " + j);
        //End of the 1st task

        boolean k = true;
        System.out.println("k: " + k);
        Boolean l = true;
        System.out.println("l: " + l);
        boolean m = Boolean.valueOf(true);
        System.out.println("m: " + m);
        Boolean n = Boolean.valueOf(true);
        System.out.println("n: " + n);
        boolean o = Boolean.parseBoolean("TrUe");
        System.out.println("o: " + o);
        Boolean p = Boolean.parseBoolean("TrUe");
        System.out.println("p: " + p);
        boolean q = Boolean.parseBoolean("TreU");
        System.out.println("q: " + q);
        Boolean r = Boolean.parseBoolean("TreU");
        System.out.println("r: " + r);
    }
}
