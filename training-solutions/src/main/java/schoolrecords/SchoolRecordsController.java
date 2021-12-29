package schoolrecords;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SchoolRecordsController {
    private final ClassRecords firstA = new ClassRecords("First A", new Random());
    private List<Tutor> elementaryTutors = new ArrayList<>();
    private List<Subject> firstClassSubjects = new ArrayList<>();

    {
        firstClassSubjects.add(new Subject("Testnevelés"));
        firstClassSubjects.add(new Subject("Ének-zene"));
        firstClassSubjects.add(new Subject("Rajz"));
        firstClassSubjects.add(new Subject("Angol"));
        firstClassSubjects.add(new Subject("Német"));
        firstClassSubjects.add(new Subject("Matematika"));
        firstClassSubjects.add(new Subject("Magyar nyelv és irodalom"));
        firstClassSubjects.add(new Subject("Környezettan"));
        firstClassSubjects.add(new Subject("Technika"));

        elementaryTutors.add(new Tutor("Fügedi István", List.of(new Subject("Testnevelés"))));
        elementaryTutors.add(new Tutor("Takács Józsefné", List.of(new Subject("Angol"))));
        elementaryTutors.add(new Tutor("Guba Imréné", List.of(new Subject("Német"))));
        elementaryTutors.add(new Tutor("Somogyi Józsefné", List.of(new Subject("Ének-zene"),
                new Subject("Rajz"), new Subject("Matematika"), new Subject("Technika"),
                new Subject("Magyar nyelv és irodalom"), new Subject("Környezettan"))));
    }

    public static void main(String[] args) {
        SchoolRecordsController src = new SchoolRecordsController();
        src.run();
    }

    private void run() {
        Scanner scr = new Scanner(System.in);
        int menu;
        do {
            System.out.println(printMenu());
            System.out.print(": ");
            menu = scr.nextInt();
            runMenu(menu);
        } while (menu != 11);
    }

    private String printMenu() {
        return """
                1. Diákok nevének listázása
                2. Diák név alapján keresése
                3. Diák létrehozása
                4. Diák név alapján törlése
                5. Diák feleltetése
                6. Osztályátlag kiszámolása
                7. Tantárgyi átlag kiszámolása
                8. Diákok átlagának megjelenítése
                9. Diák átlagának kiírása
                10. Diák tantárgyhoz tartozó átlagának kiírása
                11. Kilépés""";
    }

    private void runMenu(int menu) {
        switch (menu) {
            case 1: //Diákok nevének listázása
                System.out.println(firstA.listStudentNames());
               waitReaction();
                break;
            case 2: //Diák név alapján keresése
                try {
                    System.out.println(searchStudentByName());
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                } catch (IllegalStateException ise) {
                    System.out.println("Class record is empty! " + ise.getMessage());
                }
                waitReaction();
                break;
            case 3: //Diák létrehozása
                addStudent();
                waitReaction();
                break;
            case 4: //Diák név alapján törlése
                removeStudent();
                waitReaction();
                break;
            case 5: //Diák feleltetése
                repetition();
                waitReaction();
                break;
            case 6: //Osztályátlag kiszámolása
                System.out.println("A(z) " + firstA.getClassName() +
                        " osztály átlaga: " + firstA.calculateClassAverage());
                waitReaction();
                break;
            case 7: //Tantárgyi átlag kiszámolása
                printClassAverageBySubject();
                waitReaction();
                break;
            case 8: //Diákok átlagának megjelenítése
                System.out.println(firstA.listStudyResults());
                waitReaction();
                break;
            case 9: //Diák átlagának kiírása
                printStudentStudyAverage();
                waitReaction();
                break;
            case 10: //Diák tantárgyhoz tartozó átlagának kiírása
                printStudentSubjectAverage();
                waitReaction();
                break;
        }
    }

    private Student searchStudentByName() {
        System.out.println("Adja meg a keresett diák nevét: ");
        String name = new Scanner(System.in).nextLine();
        return firstA.findStudentByName(name);
    }

    private void addStudent() {
        System.out.println("Adja meg a felvenni kívánt diák nevét: ");
        String name = new Scanner(System.in).nextLine();
        if (firstA.addStudent(new Student(name))) {
            System.out.println(name + " hozzá lett adva az osztályhoz.");
        }
        else {
            System.out.println(name + " hozzáadsa az osztályhoz nem történt meg.");
        }
    }

    private void removeStudent() {
        System.out.println("Adja meg az eltávolítani kívánt diák nevét: ");
        String name = new Scanner(System.in).nextLine();

        try {
            Student removing = firstA.findStudentByName(name);
            if (firstA.removeStudent(removing)) {
                System.out.println(name + " eltávolítása az osztály névsorból megtörtént!");
            }
            else {
                System.out.println(name + " eltávolítása nem volt lehetséges.");
            }
        } catch (IllegalStateException ise) {
            System.out.println("There is no child in this class! " + ise.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private void repetition() {
        try {
            Student sucked = firstA.repetition();
            System.out.println("A felelő diák: " + sucked.getName());
            System.out.println("Adja meg a tantárgyat: ");
            Scanner scr = new Scanner(System.in);
            Subject subject = getSubjectByName(scr.nextLine());
            System.out.println("Adja meg az oktató nevét: ");
            Tutor tutor = getTutorByName(scr.nextLine());
            System.out.println("Adja meg az érdemjegyet: ");
            String mark = scr.nextLine();
            if (tutor.tutorTeachingSubject(subject)) {
                sucked.grading(new Mark(MarkType.parseMarkType(mark), subject, tutor));
                System.out.println("Érdemjegy beírva!");
            }
            else {
                System.out.println("Ezt a tárgyat (" + subject.getName() + ") nem " + tutor.getName() +
                        " tanítja! Feleltetés megszakítva!");
            }
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private Tutor getTutorByName(String name) {
        for (Tutor actual : elementaryTutors) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("There is no tutor has named " + name);
    }

    private Subject getSubjectByName(String name) {
        for (Subject actual : firstClassSubjects) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("This class don't have subject " + name);
    }

    private void printClassAverageBySubject() {
        System.out.println("Adja meg a tantárgy nevét: ");
        String name = new Scanner(System.in).nextLine();
        try {
            System.out.println(firstA.calculateClassAverageBySubject(getSubjectByName(name)));
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private void printStudentStudyAverage() {
        System.out.println("Adja meg a diák nevét: ");
        String name = new Scanner(System.in).nextLine();
        try {
            Student student = firstA.findStudentByName(name);
            System.out.println(student.getName() + ": " + student.calculateAverage());
        }
        catch (IllegalStateException ise) {
            System.out.println("There is no student in this class! " + ise.getMessage());
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private void printStudentSubjectAverage() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Adja meg a diák nevét: ");
        String studentName = scr.nextLine();
        System.out.println("Adja meg a tantárgy nevét: ");
        String subjectName = scr.nextLine();
        try {
            Subject subject = getSubjectByName(subjectName);
            Student student = firstA.findStudentByName(studentName);
            System.out.println(student.getName() + " átlaga a(z) " + subject.getName() + " tárgyból: "
                    + student.calculateSubjectAverage(subject));
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }
    }

    private void waitReaction() {
        System.out.println("Press any key to continue!");
        new Scanner(System.in).nextLine();
    }
}
