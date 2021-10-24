package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students) {
        for (String student : students) {
            if (student.length() <= 10) {
                System.out.println(student + " az 1-es csoportba került.");
            }
            else {
                System.out.println(student + " a 2-es csoportba került.");
            }
        }
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Pikó Ági", "Hosek Ádám", "Kiss Péter", "Gyurkó Béla", "Mészáros Gábor",
                "Simonyi Viktor", "Elekes Szabolcs", "Tóth Tamás", "Móra Ferenc", "Kis Ádám");
        StudyGroup sg = new StudyGroup();
        sg.printStudyGroups(students);
    }
}
