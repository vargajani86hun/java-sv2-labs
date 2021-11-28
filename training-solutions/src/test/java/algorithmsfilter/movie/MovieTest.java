package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void testCreate() {
        Movie dramaMovie = new Movie("The imitation game", Category.DRAMA, 4);
        assertEquals("The imitation game", dramaMovie.getTitle());
        assertEquals("DRAMA", dramaMovie.getCategory().name());
        assertEquals(4, dramaMovie.getRating());
    }

}