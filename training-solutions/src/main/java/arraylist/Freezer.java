package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();
        foods.add("zöldborsó");
        foods.add("csirkemell");
        foods.add("derelye");
        foods.add("lecsó");
        foods.add("karfiol");

        System.out.println(foods);
        System.out.println(foods.size());

        foods.remove("zöldborsó");
        foods.remove("derelye");

        System.out.println(foods);
        System.out.println(foods.size());
    }
}
