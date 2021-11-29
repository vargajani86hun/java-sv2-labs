package algorithmstransformation.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {
    PrimarySchool primarySchool;

    @BeforeEach
    void init() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Farkas Ábel", 8, "4034 Debrecen, Sas utca 21."));
        people.add(new Person("Vörös Istvánné", 44, "4113 Vámospércs, Alkotmány utca 62."));
        people.add(new Person("Szabó Ilona", 32, "4131 Álmosd, Almafa utca 7."));
        people.add(new Person("Török Klaúdia", 11, "4034 Debrecen, Veres Péter utca 32."));
        people.add(new Person("Márton Péter", 9, "4034 Debrecen, Huszár Gál utca 89."));

        primarySchool = new PrimarySchool(people);
    }

    @Test
    void testCreate() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kiss Károly", 32,"4027 Debrecen, Víztorony utca 32"));
        people.add(new Person("Török Klaúdia", 11, "4034 Debrecen, Veres Péter utca 32."));
        people.add(new Person("Vörös Istvánné", 44, "4113 Vámospércs, Alkotmány utca 62."));
        PrimarySchool catholicSchool = new PrimarySchool(people);

        assertEquals(3, catholicSchool.getPeople().size());
        assertEquals(32, catholicSchool.getPeople().get(0).getAge());
        assertEquals("Török Klaúdia", catholicSchool.getPeople().get(1).getName());
        assertEquals("4113 Vámospércs, Alkotmány utca 62.",
                catholicSchool.getPeople().get(2).getAddress());
    }

    @Test
    void testAddPerson() {
        primarySchool.addPerson(new Person("Kiss Károly", 32,"4027 Debrecen, Víztorony utca 32"));

        assertEquals(6, primarySchool.getPeople().size());
        assertEquals("Kiss Károly", primarySchool.getPeople().get(5).getName());
    }

    @Test
    void testGetStudents() {
        List<Student> students = primarySchool.getStudents();

        assertEquals(3, students.size());
        assertEquals("Farkas Ábel", students.get(0).getName());
        assertEquals("4034 Debrecen, Huszár Gál utca 89.", students.get(2).getAddress());
    }

}