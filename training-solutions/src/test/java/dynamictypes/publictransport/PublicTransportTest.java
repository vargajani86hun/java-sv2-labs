package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testAddVehicle() {
        PublicTransport publicTransport = new PublicTransport();
        PublicVehicle bus = new Bus(12, 24.3, "Volvo");
        PublicVehicle tram = new Tram(2, 18.9, 3);
        PublicVehicle metro = new Metro(4, 28.2, 12);

        publicTransport.addVehicle(bus).addVehicle(tram).addVehicle(metro);

        assertEquals(3, publicTransport.getVehicles().size());
    }

}