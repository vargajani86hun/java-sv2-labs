package enumtype.univesity;

public class UniversityMain {
    public static void main(String[] args) {
        University[] universities = University.values();
        for (University u : universities) {
            System.out.println(u.name() + " - " + u.getName());
        }
    }
}
