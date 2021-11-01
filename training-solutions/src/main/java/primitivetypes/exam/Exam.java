package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> registeredToExam = new ArrayList<>();

    public void addPerson(Person person) {
        registeredToExam.add(person);
    }

    public List<Person> getRegisteredToExam() {
        return registeredToExam;
    }
}
