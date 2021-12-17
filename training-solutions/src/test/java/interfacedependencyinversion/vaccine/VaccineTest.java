package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {

    Vaccine vaccine;
    List<Person> registrated = new ArrayList<>();

    @BeforeEach
    void init() {
        registrated.add(new Person("Kiss István", 32, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Tóth Irén", 23, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Vámos Margit", 72, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Morvai Imre", 68, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Molnár János", 48, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Szabó Tímea", 36, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Kaló Ármin", 26, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Gaál Erzsébet", 67, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Marton Mária", 66, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Kovács Elemér", 52, ChronicDisease.YES, Pregnancy.NO));
    }

    @Test
    void testFirstVaccine() {
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(registrated);
        assertEquals(10, vaccine.getVaccinationList().size());
        assertEquals("YES", vaccine.getVaccinationList().get(0).getPregnant().name());
        assertTrue(vaccine.getVaccinationList().get(3).getAge() >= 65);
    }

    @Test
    void testSecondVaccine() {
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(registrated);
        assertEquals(5, vaccine.getVaccinationList().size());
        assertTrue(vaccine.getVaccinationList().get(0).getAge() < 65);
        assertTrue(vaccine.getVaccinationList().get(4).getAge() >= 65);
    }

}