package interfaces.simpletasks;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTasksTest {

    @Test
    void testCreate() {
        SimpleTasks simpleTasks = new SimpleTasks(
                Arrays.asList("mosás", "teregetés", "porszívózás", "mosogatás"));
        assertEquals(4, simpleTasks.getTasks().size());
    }

    @Test
    void testRun() {
        SimpleTasks simpleTasks = new SimpleTasks(
                new ArrayList<>(Arrays.asList("mosás", "teregetés", "porszívózás", "mosogatás")));
        simpleTasks.run();
        assertEquals(0, simpleTasks.getTasks().size());
    }

}