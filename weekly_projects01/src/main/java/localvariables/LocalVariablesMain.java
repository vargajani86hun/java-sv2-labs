package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b = false;
        System.out.println("A b értéke: " + b);

        int a = 2;
        System.out.println("Az a nevű változó értéke: " + a);
//        System.out.println(i);
        int i = 3;
        int j = 4;
        int k = i;
        System.out.println("Az i, j és k értéke: " + i +"; " + j + "; " + k);

        String s = "Hello World";
        System.out.println(s);
        String t = s;
        System.out.println(t);
        {
            int x = 0;
            System.out.println("Az x értéke: " + x);
            System.out.println("Az a változó érétke: " + a);
        }
        System.out.println("Az x értéke: " + x);
    }
}
