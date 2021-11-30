package methodstructure.pendrives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PendrivesTest {
    List<Pendrive> pendivesList;
    Pendrives pendrives = new Pendrives();

    @BeforeEach
    void init() {
        pendivesList = new ArrayList<>();
        pendivesList.add(new Pendrive("KingMax", 16, 6500));
        pendivesList.add(new Pendrive("Kingston", 32, 9900));
        pendivesList.add(new Pendrive("KingMax", 32, 11500));
        pendivesList.add(new Pendrive("Hama", 16, 5900));
        pendivesList.add(new Pendrive("Sony", 64, 16900));
    }
    @Test
    void testGetBest() {
        assertEquals("Sony 64GB pendrive. Ára: 16900HUF", pendrives.getBest(pendivesList).toString());
    }

    @Test
    void testGetCheapest() {
        assertEquals("Hama 16GB pendrive. Ára: 5900HUF", pendrives.getCheapest(pendivesList).toString());
    }

    @Test
    void testRisePriceWhereCapacity() {
        pendrives.risePriceWhereCapacity(pendivesList, 10, 32);
        assertEquals(10890, pendivesList.get(1).getPrice());
        assertEquals(12650, pendivesList.get(2).getPrice());
        assertEquals(6500, pendivesList.get(0).getPrice());
        assertEquals(16900, pendivesList.get(4).getPrice());
    }
}