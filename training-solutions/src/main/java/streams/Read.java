package streams;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Read {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return books.stream().filter(book -> book.getPages() < maxNumberOfPages)
                .map(Book::getTitle).toList();
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equals(author))
                .map(Book::getTitle)
                .sorted(Collator.getInstance(new Locale("hu", "HU")))
                .toList();
    }

    public List<String> listAuthors() {
        return books.stream().map(Book::getAuthor)
                .distinct().toList();
    }
}
