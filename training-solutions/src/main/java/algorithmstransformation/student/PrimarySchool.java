package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> people;

    public PrimarySchool(List<Person> people) {
        this.people = people;
    }

    public void addPerson(Person newPerson) {
        people.add(newPerson);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person actual : people) {
            if (actual.getAge() < 15) {
                students.add(new Student(actual.getName(), actual.getAddress()));
            }
        }
        return students;
    }

    public List<Person> getPeople() {
        return new ArrayList<>(people);
    }
}
