package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    public void testGreetings() {
        assertEquals("Hello John Doe", new Gentleman().sayHello("John Doe"));

    }
}
