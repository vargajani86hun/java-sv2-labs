package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andó Virág"));
        students.add(new Student("Somogyi Márta"));
        students.add(new Student("Nyujtó Evelin"));
        students.add(new Student("Kovács Vivien"));
        students.add(new Student("Szabó Alexandra"));

        students.get(1).setActive(false);
        students.get(3).setActive(false);

        List<Student> inactiveStudents = new ArrayList<>();
        for (Student student : students) {
            if (!student.isActive()) {
                inactiveStudents.add(student);
            }
        }
        System.out.println("Az iskolának " + students.size() + " tanulója volt.");
        students.removeAll(inactiveStudents);
        System.out.println("Az iskolának " + students.size() + " tanulója van.");

    }
}
