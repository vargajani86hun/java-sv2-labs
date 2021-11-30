package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCreate() {
        Car car = new Car("Volvo", "S40", 2012);
        assertEquals("Volvo", car.getBrand());
        assertEquals("S40", car.getType());
        assertEquals(2012, car.getYearOfProduction());
    }

    @Test
    void testCreateWithEmptyBrand() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Car("   ", "Polski", 1968));
        assertEquals("Brand should not be empty!", iae.getMessage());
    }

    @Test
    void testCreateWithNullBrand() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Car(null, "Polski", 1968));
        assertEquals("Brand should not be empty!", iae.getMessage());
    }

    @Test
    void testCreateWithInvalidYear() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Car("Ford", "S-Max", 2032));
        assertEquals("Year of production should not be in the future!", iae.getMessage());
    }
}