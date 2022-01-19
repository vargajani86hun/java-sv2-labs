package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        students.add(new Student("Évi", 152));
        students.add(new Student("Dóri", 158));
        students.add(new Student("Robi", 154));
        students.add(new Student("Peti", 142));
        students.add(new Student("Margó", 148));
        students.add(new Student("Feri", 150));

        System.out.println(students);

        Map<String, Integer> nominalRoll = new TreeMap<>(Collator.getInstance(
                new Locale("hu", "HU")));
        nominalRoll.put("Évi", 152);
        nominalRoll.put("Dóri", 158);
        nominalRoll.put("Robi", 154);
        nominalRoll.put("Peti", 142);
        nominalRoll.put("Margó", 148);
        nominalRoll.put("Feri", 150);

        System.out.println(nominalRoll);
    }
}
