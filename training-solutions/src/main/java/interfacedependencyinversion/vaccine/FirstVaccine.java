package interfacedependencyinversion.vaccine;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return new ArrayList<>(vaccinationList);
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        if (registrated == null || registrated.isEmpty()) {
            throw new IllegalStateException("No one has registreted yet");
        }
        List<Person> remaining = new ArrayList<>(registrated);
        vaccinationList.addAll(getPregnants(registrated));
        remaining.removeAll(vaccinationList);
        vaccinationList.addAll(getOldPeople(remaining));
        remaining.removeAll(vaccinationList);
        vaccinationList.addAll(remaining);
    }

    private List<Person> getPregnants(List<Person> registreted) {
        List<Person> results = new ArrayList<>();
        for (Person actual : registreted) {
            if (actual.getPregnant() == Pregnancy.YES) {
                results.add(actual);
            }
        }
        return results;
    }

    private List<Person> getOldPeople(List<Person> registreted) {
        List<Person> results = new ArrayList<>();
        for (Person actual : registreted) {
            if (actual.getAge() >= 65) {
                results.add(actual);
            }
        }
        return results;
    }
}
