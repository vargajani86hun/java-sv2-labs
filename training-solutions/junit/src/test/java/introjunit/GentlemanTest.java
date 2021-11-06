package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void testHello() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String greetings = gentleman.sayHello("John Doe");

        // Then
        assertThat(greetings, equalTo("Hello John Doe"));
    }

    @Test
    public void testHelloNull() {
        assertThat(new Gentleman().sayHello(null), equalTo("Hello Anonymous"));
    }
}
