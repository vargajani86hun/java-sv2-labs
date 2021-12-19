package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testBicycle() {
        Vehicle bike = Vehicle.of(2);
        assertTrue(bike instanceof Bicycle);
        assertEquals(2, ((Bicycle) bike).getNumberOfWheels());
    }

    @Test
    void testCar() {
        Vehicle car = Vehicle.of(4);
        assertTrue(car instanceof Car);
        assertEquals(4, ((Car) car).getNumberOfWheels());
    }

    @Test
    void testNotVehicle() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> Vehicle.of(3));
        assertEquals("Invalid number of wheels(3) for a vehicle",
                iae.getMessage());
    }

}