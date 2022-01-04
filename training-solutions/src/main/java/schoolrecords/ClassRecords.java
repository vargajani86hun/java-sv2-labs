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
        return ((long)(classSum * 100. / students.size())) / 100.;
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
        return studentsGetMarksFromSubject == 0 ? 0 :
                ((long)(classSumBySubject * 100. / studentsGetMarksFromSubject)) / 100.;
    }

    public Student findStudentByName(String studentName) {
        if (studentName.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        checkStudentsToSearch();
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
        checkStudentsToSearch();
        List<StudyResultByName> results = new ArrayList<>();
        for (Student actual : students) {
            results.add(new StudyResultByName(actual.getName(), actual.calculateAverage()));
        }
        return results;
    }

    public String listStudentNames() {
        checkStudentsToSearch();
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

    private void checkStudentsToSearch() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
    }
}
