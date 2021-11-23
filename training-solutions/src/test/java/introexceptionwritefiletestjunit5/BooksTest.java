package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooksTest {

    @TempDir
    File tempFolder;

    @Test
    void testWriteList() throws IOException {
        Path path = tempFolder.toPath().resolve("tempBooks.txt");
        Books books = new Books();
        books.createBookList(Paths.get("src/test/texts/books.txt"));
        books.getReadableBookList();

        books.writeList(path);
        List<String> lines = Files.readAllLines(path);

        assertEquals(books.getReadableBookList(),lines);
    }
}
