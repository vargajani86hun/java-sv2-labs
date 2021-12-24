package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
        if (students.contains(student)) {
            return false;
        }
        return students.add(student);
    }

    public String getClassName() {
        return className;
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }

    public double calculateClassAverage() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double classSum = 0;
        for (Student actual : students) {
            classSum += actual.calculateAverage();
        }
        if (classSum == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Double.parseDouble(String.format(Locale.UK, "%.2f",classSum / students.size()));
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double classSumBySubject = 0;
        int studentsGetMarksFromSubject = 0;
        for (Student actual : students) {
            double tmp = actual.calculateSubjectAverage(subject);
            if (tmp != 0) {
                classSumBySubject += tmp;
                studentsGetMarksFromSubject++;
            }
        }
        return Double.parseDouble(String.format(Locale.UK, "%.2f",
                (classSumBySubject / studentsGetMarksFromSubject)));
    }

    public Student findStudentByName(String studentName) {
        if (studentName.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student actual : students) {
            if (actual.getName().equals(studentName)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + studentName);
    }

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No student in the class!");
        }
        List<StudyResultByName> results = new ArrayList<>();
        for (Student actual : students) {
            results.add(new StudyResultByName(actual.getName(), actual.calculateAverage()));
        }
        return results;
    }

    public String listStudentNames() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No student in the class!");
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Student actual : students) {
            if (first) {
                first = false;
            }
            else {
                sb.append(", ");
            }
            sb.append(actual.getName());
        }
        return sb.toString();
    }
}
