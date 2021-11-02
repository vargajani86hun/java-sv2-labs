package stringconcat.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee operator = new Employee("Kiss Norbert", "operátor", 235_000);
        Employee lineLeader = new Employee("Molnár Attila", "sorvezető", 250_000);
        Employee engineer = new Employee("Kovács Zoltán", "szerializációs mérnök", 510_000);
        System.out.println(operator);
        System.out.println(lineLeader);
        System.out.println(engineer);
    }
}
