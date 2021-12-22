package schoolrecords;

import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> subjects;

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        return subjects.contains(subject);
    }

    public String getName() {
        return name;
    }
}
