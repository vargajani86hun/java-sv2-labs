package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void testCars() {
        Seat sedan = new FamilyCar();
        Seat coupe = new SportsCar();
        Seat van = new Car("Renault", 3);
        Car jeep = new Car("Jeep", 4);

        assertEquals(5, sedan.getNumberOfSeats());
        assertEquals(2, coupe.getNumberOfSeats());
        assertEquals(3, van.getNumberOfSeats());
        assertEquals("Jeep", jeep.getBrand());
        assertEquals(4, jeep.getNumberOfSeats());
    }

}