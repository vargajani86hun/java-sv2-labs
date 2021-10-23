package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("kés", "gyufa", "fűrész");
        System.out.println(importantThings);
        importantThings.set(1, "szikrakő");
        System.out.println(importantThings);
    }
}
