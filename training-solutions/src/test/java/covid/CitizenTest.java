package covid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CitizenTest {

    @Test
    void testCreateCitizen() {
        String name = "Jhon Doe";
        int age = 30;
        String email = "jhon.doe@yahoo.com";
        String zip = "H1071";
        String ssn = "220232739";
        Citizen citizen = new Citizen(name, zip, age, email, ssn);

        assertEquals(name, citizen.getCitizenName());
        assertEquals(zip, citizen.getZipCode());
        assertEquals(age, citizen.getAge());
        assertEquals(email, citizen.getEmail());
        assertEquals(ssn, citizen.getSocialSecurityNumber());
    }

    @Test
    void testCreateWithEmptyName() {
        String name = "";
        int age = 30;
        String email = "jhon.doe@yahoo.com";
        String zip = "H1071";
        String ssn = "220232739";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Citizen(name, zip, age, email, ssn));
        assertEquals("Name must not be empty!", iae.getMessage());
    }

    @Test
    void testCreateWithEmptyZip() {
        String name = "Jhon Doe";
        int age = 30;
        String email = "jhon.doe@yahoo.com";
        String zip = "";
        String ssn = "220232739";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Citizen(name, zip, age, email, ssn));
        assertEquals("Zip code must not be empty!", iae.getMessage());
    }

    @Test
    void testCreateWithTooLowAge() {
        String name = "Jhon Doe";
        int age = 8;
        String email = "jhon.doe@yahoo.com";
        String zip = "H1071";
        String ssn = "220232739";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Citizen(name, zip, age, email, ssn));
        assertEquals("You are too young to register for vaccination!", iae.getMessage());
    }

    @Test
    void testCreateWithTooHighAge() {
        String name = "Jhon Doe";
        int age = 158;
        String email = "jhon.doe@yahoo.com";
        String zip = "H1071";
        String ssn = "220232739";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Citizen(name, zip, age, email, ssn));
        assertEquals("You are too old to register for vaccination!", iae.getMessage());
    }

    @Test
    void testCreateWithEmptyEmail() {
        String name = "Jhon Doe";
        int age = 38;
        String email = "";
        String zip = "H1071";
        String ssn = "220232739";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Citizen(name, zip, age, email, ssn));
        assertEquals("E-mail address must not be empty!", iae.getMessage());
    }

    @Test
    void testCreateWithTooShortEmail() {
        String name = "Jhon Doe";
        int age = 38;
        String email = "a@";
        String zip = "H1071";
        String ssn = "220232739";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Citizen(name, zip, age, email, ssn));
        assertEquals("It's too short to be valid e-mail address", iae.getMessage());
    }

    @Test
    void testCreateWithoutAtInEmail() {
        String name = "Jhon Doe";
        int age = 38;
        String email = "a.com";
        String zip = "H1071";
        String ssn = "220232739";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Citizen(name, zip, age, email, ssn));
        assertEquals("E-mail address should contain '@' character!", iae.getMessage());
    }

    @Test
    void testCreateWithWrongDomainInEmail() {
        String name = "Jhon Doe";
        int age = 38;
        String email = "a@com";
        String zip = "H1071";
        String ssn = "220232739";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Citizen(name, zip, age, email, ssn));
        assertEquals("E-mail address should contain a domain at its end.", iae.getMessage());
    }

    @Test
    void testCreateWithEmptySSN() {
        String name = "Jhon Doe";
        int age = 38;
        String email = "jhon.doe@yahoo.com";
        String zip = "H1071";
        String ssn = "";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Citizen(name, zip, age, email, ssn));
        assertEquals("Social Security Number must not be empty!", iae.getMessage());
    }

    @Test
    void testCreateWithInvalidSSN() {
        String name = "Jhon Doe";
        int age = 38;
        String email = "jhon.doe@yahoo.com";
        String zip = "H1071";
        String ssn = "121651239";
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Citizen(name, zip, age, email, ssn));
        assertEquals("Social Security Number is not valid!", iae.getMessage());
    }
}