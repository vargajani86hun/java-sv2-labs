package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> readableBookList = new ArrayList<>();

    public void createBookList(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                readableBookList.add(reorderBook(line));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file", ioe);
        }
    }

    public void writeList(Path path) throws IOException {
        Files.write(path, readableBookList);
    }

    public List<String> getReadableBookList() {
        return readableBookList;
    }

    private String reorderBook(String book) {
        String[] bookElements = book.split(";");
        return bookElements[2] + ": " + bookElements[1];
    }
}
