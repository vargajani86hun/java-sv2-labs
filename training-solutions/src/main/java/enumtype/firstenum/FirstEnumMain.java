package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        Continent[] continents = Continent.values();
        for (Continent c : continents) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(continents));

        System.out.println(Ocean.valueOf("ARCTIC"));
        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("SOUTHERN"));
    }
}
