package searching;

import java.text.Collator;
import java.util.Locale;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private int id;
    private String title;
    private String author;

    public Book(int id, String author, String title) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        Collator bookComparator = Collator.getInstance(new Locale("hu", "HU"));
        if (bookComparator.compare(this.author, o.author) == 0) {
            return bookComparator.compare(this.title, o.title);
        } else {
            return bookComparator.compare(this.author, o.author);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return id + " " + author + ' ' + title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
