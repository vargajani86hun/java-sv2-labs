package sorting;

import java.util.LinkedList;
import java.util.List;

public class MedicalSurgery {
    private List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> orderedPatients = new LinkedList<>(patients);
        orderedPatients.sort(new PatientComparator());
        return orderedPatients;
    }
}
