package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movieDB = new ArrayList<>();

    public void addMovie(Movie movie) {
        movieDB.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category) {
        List<Movie> result = new ArrayList<>();
        for (Movie actual : movieDB) {
            if (category.equals(actual.getCategory()) && actual.getRating() >= 3) {
                result.add(actual);
            }
        }
        return result;
    }

    public List<Movie> getMovieDB() {
        return movieDB;
    }
}
