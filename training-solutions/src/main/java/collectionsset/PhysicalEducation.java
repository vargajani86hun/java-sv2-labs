package collectionsset;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public static Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> results = new TreeSet<>();
        for (Student s: students) {
            results.add(s.getHeight());
        }
        return results;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Timi", 142), new Student("Évi", 148),
                new Student("Balázs", 146), new Student("Patrik", 153),
                new Student("Feri", 144), new Student("Fruzsi", 138),
                new Student("Miki", 151), new Student("Robi", 137));
        System.out.println(getOrderInLessons(students));
    }
}
