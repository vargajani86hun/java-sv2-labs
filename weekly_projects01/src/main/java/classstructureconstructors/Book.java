package classstructureconstructors;

public class Book {

    private String author, title, regNumber;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void register(String regNumber){
        this.regNumber = regNumber;
    }
}
