package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        return (student.getNeptunCode().equals(anotherStudent.getNeptunCode())) &&
                student.getEducationalIdentifier().equals(anotherStudent.getEducationalIdentifier());
    }

    public List<Student> getStudents() {
        return students;
    }
}
