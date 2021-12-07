package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add(new Fruit());
        objects.add(new Apple());
        objects.add(new Starking());
        objects.add(new Vegetable());
        objects.add("alma");
        objects.add(12);
        objects.add('x');
        objects.add(LocalDate.now());
        objects.add(new int[] {1,2,3,4});
        List<String> words = new ArrayList<>();
        words.add("valami");
        words.add("még valami");
        words.add("semmi");
        objects.add(words);
        for (Object o : objects) {
            System.out.println(o);
        }
    }
}
