package catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintedFeatures implements Feature {
    private final String title;
    private final int numberOfPages;
    private List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        checkTitle(title);
        this.title = title;
        checkNumberOfPages(numberOfPages);
        this.numberOfPages = numberOfPages;
        checkAuthors(authors);
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof PrintedFeatures that) {
            return numberOfPages == that.numberOfPages && title.equals(that.title) && authors.equals(that.authors);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, numberOfPages, authors);
    }

    private void checkTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
    }

    private void checkNumberOfPages(int numberOfPages) {
        if (numberOfPages < 1) {
            throw new IllegalArgumentException("Number of pages must be positive");
        }
    }

    private void checkAuthors(List<String> authors) {
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("List of authors must not be empty");
        }
    }
}
