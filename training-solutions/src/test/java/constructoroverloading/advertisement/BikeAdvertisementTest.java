package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {

    @Test
    void testCreateByTwoData() {
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement(
                "Női treking kerékpár, 26\"", 49_000);
        assertEquals("Női treking kerékpár, 26\"", bikeAdvertisement.getSortDescription());
        assertEquals(49_000, bikeAdvertisement.getPrice());
        assertNull(bikeAdvertisement.getBrand());
        assertNull(bikeAdvertisement.getSerialNumber());
        assertNull(bikeAdvertisement.getExtras());
    }

    @Test
    void testCreateByThreeData() {
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement(
                "Női treking kerékpár, 26\"", 49_000, "SwinnCsepel");
        assertEquals("Női treking kerékpár, 26\"", bikeAdvertisement.getSortDescription());
        assertEquals(49_000, bikeAdvertisement.getPrice());
        assertEquals("SwinnCsepel", bikeAdvertisement.getBrand());
        assertNull(bikeAdvertisement.getSerialNumber());
        assertNull(bikeAdvertisement.getExtras());
    }

    @Test
    void testCreateByFourData() {
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement(
                "Női treking kerékpár, 26\"", 49_000, "SwinnCsepel",
                Arrays.asList("SwinnCsepel", "agydinamó", "agyváltó", "kormányváltó", "csengő"));
        assertEquals("Női treking kerékpár, 26\"", bikeAdvertisement.getSortDescription());
        assertEquals(49_000, bikeAdvertisement.getPrice());
        assertEquals("SwinnCsepel", bikeAdvertisement.getBrand());
        assertNull(bikeAdvertisement.getSerialNumber());
        assertEquals(5,  bikeAdvertisement.getExtras().size());
    }

    @Test
    void testCreateByFiveData() {
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement(
                "Női treking kerékpár, 26\"", 49_000, "SwinnCsepel",
                Arrays.asList("SwinnCsepel", "agydinamó", "agyváltó", "kormányváltó", "csengő"),
                "5SW3726M112020");
        assertEquals("Női treking kerékpár, 26\"", bikeAdvertisement.getSortDescription());
        assertEquals(49_000, bikeAdvertisement.getPrice());
        assertEquals("SwinnCsepel", bikeAdvertisement.getBrand());
        assertEquals("5SW3726M112020",  bikeAdvertisement.getSerialNumber());
        assertEquals(5,  bikeAdvertisement.getExtras().size());
    }
}