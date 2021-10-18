package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Employee employee;
        String name;
        int year, month, day;

        System.out.println("Kérem, adja meg a nevét: ");
        name = scr.nextLine();
        System.out.println("Kérem, adja meg születési dátumát ÉÉÉÉ HH NN formában:");
        year = scr.nextInt();
        month = scr.nextInt();
        day = scr.nextInt();
        employee = new Employee(name, year, month, day);

        System.out.println("Az új alkalmazott adatai:\n" + employee.getName() + "\n" +
                employee.getDateOfBirth() + "\nA munkába állás pontos ideje: " +
                employee.getBeginEmployment());
    }
}
