package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {
    VideoTheque videoTheque = new VideoTheque();

    @BeforeEach
    void init() {
        videoTheque.addMovie(new Movie("Titanic", Category.ROMANTIC, 3));
        videoTheque.addMovie(new Movie("Frozen", Category.ANIMATION, 4));
        videoTheque.addMovie(new Movie("The Lord of the Rings", Category.FANTASY, 5));
        videoTheque.addMovie(new Movie("The Lion King", Category.ANIMATION, 5));
        videoTheque.addMovie(new Movie("Garfield", Category.ANIMATION, 2));
        videoTheque.addMovie(new Movie("Shrek", Category.ANIMATION, 5));
        videoTheque.addMovie(new Movie("Mission: Impossible", Category.ACTION, 5));
        videoTheque.addMovie(new Movie("The Imitation Game", Category.DRAMA, 4));
        videoTheque.addMovie(new Movie("Star Wars", Category.SCIFI, 4));
        videoTheque.addMovie(new Movie("The Hobbit: An Unwxpected Journey", Category.FANTASY,4));
    }

    @Test
    void testCreate() {
        VideoTheque onceUponATheque = new VideoTheque();
        assertEquals(0, onceUponATheque.getMovieDB().size());
    }

    @Test
    void testAddMovie() {
        videoTheque.addMovie(new Movie("The Lion King", Category.ANIMATION, 5));
        assertEquals(11, videoTheque.getMovieDB().size());
        assertEquals("The Lion King", videoTheque.getMovieDB().get(10).getTitle());
    }

    @Test
    void testGetGoodMoviesWithCategoryGiven() {
        List<Movie> cartoons = videoTheque.getGoodMoviesWithCategoryGiven(Category.ANIMATION);
        assertEquals(3, cartoons.size());
    }
}