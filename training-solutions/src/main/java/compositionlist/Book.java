package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private List<String> titles = new ArrayList<>();

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        int i = titles.indexOf(title);
        if (i >= 0) {
            String authorAndTitle = author + ": " + titles.get(i);
            titles.remove(i);
            titles.add(i, authorAndTitle);
        }
    }

    public List<String> getTitles() {
        return titles;
    }

    public static void main(String[] args) {
        Book book = new Book();
        Scanner scr = new Scanner(System.in);
        String title;
        String author;

        System.out.println("Mennyi könyvet szeretne megadni?");
        int numberOfBooks = scr.nextInt();
        scr.nextLine();

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Adja meg a(z) " + (i + 1) + ". könyv címét:");
            title = scr.nextLine();
            book.addBook(title);
        }
        System.out.println(book.getTitles());

        System.out.println("Adja meg annak a könyvnek a címét, melynek " +
                "meg akarja adni az íróját:");
        title = scr.nextLine();
        System.out.println("Adja meg az írót:");
        author = scr.nextLine();
        book.findBookAndSetAuthor(title, author);
        System.out.println(book.getTitles());
    }
}
