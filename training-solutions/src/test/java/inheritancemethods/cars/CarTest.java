package inheritancemethods.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void init() {
        car = new Car(7.5, 30, 55);
    }

    @Test
    void testCreate() {
        Car lada = new Car(8.2, 28, 40);
        assertEquals(8.2, lada.getFuelRate(), 0.01);
        assertEquals(28, lada.getFuel(), 0.01);
        assertEquals(40, lada.getTankCapacity(), 0.01);
        assertEquals(12, lada.calculateRefillAmount(), 0.01);
    }

    @Test
    void testModifyFuelAmountWithValid() {
        car.modifyFuelAmount(20);
        assertEquals(50, car.getFuel(), 0.01);
    }

    @Test
    void testModifyFuelAmountWithTooMuch() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> car.modifyFuelAmount(30));
        assertEquals("Too much fuel to tank!", iae.getMessage());
    }

    @Test
    void testDriveValidKm() {
        car.drive(200);
        assertEquals(15, car.getFuel(), 0.01);
    }

    @Test
    void testDriveTooManyKm() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> car.drive(450));
        assertEquals("Not enought fuel to drive 450km!", iae.getMessage());
    }
}