package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        Continent[] continents = Continent.values();
        for (Continent c : continents) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(continents));
    }
}
