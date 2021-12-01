package methodpass.window;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    @Test
    void testRiseSize() {
        List<Window> windows = new ArrayList<>();
        windows.add(new Window("Living room", 85, 110));
        windows.add(new Window("Bathroom", 35, 35));
        windows.add(new Window("Bedroom", 105, 115));
        windows.add(new Window("Kitchen", 65, 90));
        new WindowOperation().riseSize(windows, 25);

        assertEquals(135, windows.get(0).getHeight());
        assertEquals(60, windows.get(1).getHeight());
        assertEquals(140, windows.get(2).getHeight());
        assertEquals(115, windows.get(3).getHeight());
    }

}