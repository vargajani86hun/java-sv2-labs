package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {
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
        int young = 0;
        for (Person actual : getVaccineablePeople(registrated)) {
            if (actual.getAge() < 65) {
                vaccinationList.add(young++, actual);
            }
            else {
                vaccinationList.add(actual);
            }
        }
    }

    private List<Person> getVaccineablePeople(List<Person> registrated) {
        List<Person> results = new ArrayList<>();
        for (Person actual : registrated) {
            if (actual.getPregnant() == Pregnancy.NO &&
            actual.getChronic() == ChronicDisease.NO) {
                results.add(actual);
            }
        }
        return results;
    }
}
