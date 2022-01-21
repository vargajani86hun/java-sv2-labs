package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" + name +
                ", year of birth:" + yearOfBirth + "\n";
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
           new Employee("Kiss Mihály", 1977),
           new Employee("Tóth Béla", 1982),
           new Employee("Faludi Károly", 1974),
           new Employee("Gáspár Gáspár", 1979),
           new Employee("Vaskó Ilona", 1991),
           new Employee("Boldog Teréz", 1985)
        ));


        int sumOfYears = employees.stream()
                .map(Employee::getYearOfBirth)
                .mapToInt(i -> i)
                .sum();
        System.out.println("A születési évek összege: " + sumOfYears);


        int sumOfAges = employees.stream()
                .map(Employee::getYearOfBirth)
                .mapToInt(i -> LocalDate.now().getYear() - i)
                .sum();
        System.out.printf("Az életkorok összege: %d\n", sumOfAges);


        long numberOfEmployees = employees.stream().count();
        System.out.printf("Jelenleg %d alkalmazottja van.\n", numberOfEmployees);


        long bornBefore1990 = employees.stream()
                .filter(employee -> employee.yearOfBirth < 1990)
                .count();
        System.out.printf("1990 előtt %d alkalmazott született.\n", bornBefore1990);


        OptionalInt yearOfYoungestBirth = employees.stream()
                .map(Employee::getYearOfBirth)
                .mapToInt(i -> i)
                .max();
        System.out.printf("A legfiatalabb alkalmazott %d-ben született.\n",
                yearOfYoungestBirth.getAsInt());


        String youngestName = employees.stream()
                .sorted((e1, e2) -> e1.yearOfBirth - e2.yearOfBirth)
                .findFirst().get().name;
        System.out.println(youngestName + " a legfiatalabb.");


        boolean isEveryoneBornBefore1980 = employees.stream()
                .filter(employee -> employee.yearOfBirth < 1970)
                .count() == employees.size();
        System.out.println("A cég " + (isEveryoneBornBefore1980?"":"nem") +
                " minden alkalmazottja született 1980 előtt.");


        List<Employee> olderEmployees = employees.stream()
                .filter(employee -> employee.yearOfBirth < 1990).toList();
        System.out.println(olderEmployees);


        List<String> employeesNames = employees.stream()
                .map(Employee::getName).toList();
        System.out.println("Az összes alkalmazott:");
        employeesNames.stream().forEach(System.out::println);


        List<String> olderEmployeesNames = employees.stream()
                .filter(employee -> employee.yearOfBirth < 1990)
                .map(Employee::getName).toList();
        System.out.println("\nAz 1990 előtt születettek:");
        olderEmployeesNames.stream().forEach(System.out::println);
    }
}
