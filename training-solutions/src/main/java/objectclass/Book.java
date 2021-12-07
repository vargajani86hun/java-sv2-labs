package objectclass;

import java.util.Objects;

public class Book {
    private String author, title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return author.equals(book.author) && title.equals(book.title);
    }
}
