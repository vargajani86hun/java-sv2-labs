package inheritancemethods.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {
    Jeep jeep;

    @BeforeEach
    void init() {
        jeep = new Jeep(8.5, 45, 65, 60, 30);
    }

    @Test
    void testCreate() {
        Jeep niva = new Jeep(9.5, 40, 65, 40, 30);
        assertEquals(9.5, niva.getFuelRate(), 0.01);
        assertEquals(40, niva.getFuel(), 0.01);
        assertEquals(65, niva.getTankCapacity(), 0.01);
        assertEquals(40, niva.getExtraCapacity(), 0.01);
        assertEquals(30, niva.getExtraFuel(), 0.01);
        assertEquals(35, niva.calculateRefillAmount(), 0.01);
    }

    @Test
    void testModifyFuelAmountValid() {
        jeep.modifyFuelAmount(40);
        assertEquals(65, jeep.getFuel(), 0.0001);
        assertEquals(50, jeep.getExtraFuel(), 0.0001);
    }

    @Test
    void testModifyFuelAmountTooMuch() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> jeep.modifyFuelAmount(60));
        assertEquals("Too much fuel to tank!", iae.getMessage());
    }

    @Test
    void testDriveValid() {
        jeep.drive(400);
        assertEquals(41, jeep.getFuel(), 0.01);
        assertEquals(0, jeep.getExtraFuel(), 0.01);
    }

    @Test
    void testDriveTooMany() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> jeep.drive(1000));
        assertEquals("Not enought fuel to drive 1000km!", iae.getMessage());
    }

}