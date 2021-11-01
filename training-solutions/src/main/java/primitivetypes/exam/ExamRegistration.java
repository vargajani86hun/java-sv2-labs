package primitivetypes.exam;

import java.util.Scanner;
import java.time.LocalDate;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Kérem a nevét: ");
        String name = scr.nextLine();
        System.out.println("Adja meg születési dátumát YYYY-MM-DD formában:");
        String dateOfBirth = scr.nextLine();
        System.out.println("Adja meg irányító számát:");
        String zipCode = scr.nextLine();
        System.out.println("Adja meg jegyei átlagát:");
        String avgRating = scr.nextLine();

        Exam exam = new Exam();
        Person applicant = new Person(name, LocalDate.parse(dateOfBirth),
                Integer.parseInt(zipCode), Double.parseDouble(avgRating));
        exam.addPerson(applicant);
        System.out.println(exam.getRegisteredToExam());
    }
}
