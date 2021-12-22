package schoolrecords;

import java.util.ArrayList;
import java.util.List;

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
        return getSumOfMarks() / (double) marks.size();
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
        return sum / (double) pcs;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ");
        Subject subject = marks.get(0).getSubject();
        boolean isFirst = true;
        for (Mark actual : sortMarksBySubject()) {
            if (!subject.getName().equals(actual.getSubject().getName())) {
                subject = actual.getSubject();
                sb.append(subject.getName()).append(": ");
            }
            sb.append(actual.toString());
            if (isFirst) {
                isFirst = false;
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
