package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public String getClassName() {
        return className;
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }

    public double calculateClassAverage() {
        return 0;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        return 0;
    }

    public Student findStudentByName(String studentName) {
        return null;
    }

    public Student repetition() {
        return null;
    }

    public List<StudyResultByName> listStudyResults() {
        return null;
    }

    public String listStudentNames() {
        return null;
    }
}
