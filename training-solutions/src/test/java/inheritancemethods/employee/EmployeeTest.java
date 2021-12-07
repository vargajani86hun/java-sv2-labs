package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testCreate() {
        Employee employee = new Employee("John Doe",
                "Vác, Alkotmány út 13.", 210_000);
        assertEquals(210_000, employee.getSalary());
        assertEquals("John Doe", employee.getName());
        assertEquals("Vác, Alkotmány út 13.", employee.getAddress());
    }

    @Test
    void testRaiseSalary() {
        Employee employee = new Employee("John Doe",
                "Vác, Alkotmány út 13.", 210_000);
        employee.raiseSalary(10);
        assertEquals(231_000, employee.getSalary());
    }

}