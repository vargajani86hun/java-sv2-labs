package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {
        int sumOfMarks = getSumOfMarks();
        return sumOfMarks == 0 ? 0 : (((long)(sumOfMarks * 100. / marks.size())) / 100.);
    }

    public double calculateSubjectAverage(Subject subject) {
        int sum = 0;
        int pcs = 0;
        for (Mark actual : marks) {
            if (actual.getSubject().getName().equals(subject.getName())) {
                sum += actual.getMarkType().getValue();
                pcs++;
            }
        }
        return sum == 0 ? 0 : (((long)(sum * 100. / pcs)) / 100.);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" marks: ");
        Subject subject = marks.get(0).getSubject();
        sb.append(subject.getName()).append(": ");
        boolean firstMark = true;
        for (Mark actual : sortMarksBySubject()) {
            if (!subject.getName().equals(actual.getSubject().getName())) {
                sb.append(";\n");
                subject = actual.getSubject();
                sb.append(subject.getName()).append(": ");
            }
            sb.append(actual);
            if (firstMark) {
                firstMark = false;
            }
            else {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private int getSumOfMarks() {
        int sum = 0;
        for (Mark actual : marks) {
            sum += actual.getMarkType().getValue();
        }
        return sum;
    }

    private List<Mark> sortMarksBySubject() {
        List<Subject> subjects = getMarkedSubjects();
        List<Mark> sortedMarks = new ArrayList<>();
        for (Subject actual : subjects) {
            sortedMarks.addAll(getMarksBySubject(actual));
        }
        return sortedMarks;
    }

    private List<Subject> getMarkedSubjects() {
        List<Subject> results = new ArrayList<>();
        for (Mark actual : marks) {
            if (!results.contains(actual.getSubject())) {
                results.add(actual.getSubject());
            }
        }
        return results;
    }

    private List<Mark> getMarksBySubject(Subject subject) {
        List<Mark> results = new ArrayList<>();
        for (Mark actual : marks) {
            if (actual.getSubject().getName().equals(subject.getName())) {
                results.add(actual);
            }
        }
        return results;
    }
}
