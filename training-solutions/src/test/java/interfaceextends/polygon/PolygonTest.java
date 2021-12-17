package interfaceextends.polygon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    void testPolygons() {
        Polygon triangle = new Polygon(10, 3);
        Polygon rectangle = new Polygon(10, 4);
        Polygon pentagon = new Polygon(10, 5);
        Polygon hexagon = new Polygon(10, 6);
        Polygon heptagon = new Polygon(10, 7);
        Polygon octagon = new Polygon(10, 8);
        Polygon decagon = new Polygon(10, 10);
        Polygon dodecagon = new Polygon(10, 12);


        assertEquals(30, triangle.getPerimeter());
        assertEquals(0, triangle.getNumberOfDiagonalsFromOneVertex());
        assertEquals(0, triangle.getNumberOfAllDiagonals());

        assertEquals(40, rectangle.getPerimeter());
        assertEquals(1, rectangle.getNumberOfDiagonalsFromOneVertex());
        assertEquals(2, rectangle.getNumberOfAllDiagonals());

        assertEquals(50, pentagon.getPerimeter());
        assertEquals(2, pentagon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(5, pentagon.getNumberOfAllDiagonals());

        assertEquals(60, hexagon.getPerimeter());
        assertEquals(3, hexagon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(9, hexagon.getNumberOfAllDiagonals());

        assertEquals(70, heptagon.getPerimeter());
        assertEquals(4, heptagon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(14, heptagon.getNumberOfAllDiagonals());

        assertEquals(80, octagon.getPerimeter());
        assertEquals(5, octagon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(20, octagon.getNumberOfAllDiagonals());

        assertEquals(100, decagon.getPerimeter());
        assertEquals(7, decagon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(35, decagon.getNumberOfAllDiagonals());

        assertEquals(120, dodecagon.getPerimeter());
        assertEquals(9, dodecagon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(54, dodecagon.getNumberOfAllDiagonals());
    }

}