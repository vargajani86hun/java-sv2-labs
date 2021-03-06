package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());
        Book emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null);
        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);
        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(anotherBook == book);

        Book[] books = {new Book(), new Book(), new Book()};
        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> bookList1 = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            bookList1.add(new Book());
        }
        System.out.println(Arrays.toString(books));
        System.out.println(bookList);
        System.out.println(bookList1);
    }
}
