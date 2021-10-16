package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("King, Stephen", "Carry");
        book.register("NC1033034IH");

        System.out.println(book.getAuthor() + "; " + book.getTitle() + " (" + book.getRegNumber() + ")");
    }
}
