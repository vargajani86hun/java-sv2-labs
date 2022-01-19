package searching;

import java.util.Collections;
import java.util.List;

public class BookSearch {
    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        validate(author);
        validate(title);
        Collections.sort(books);
        int i = Collections.binarySearch(books, new Book(0, author, title));
        if (i < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        } else {
            return books.get(i);
        }
    }

    private void validate(String value) {
        if (value == null || value.isEmpty())
            throw new IllegalArgumentException("Author or title must not be empty!");
    }
}
