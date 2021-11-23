package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testWriteList() throws IOException {
        Books books = new Books();
        books.createBookList(Paths.get("src/test/texts/books.txt"));
        Path path = tempFolder.newFile("betterBooks.txt").toPath();
        books.writeList(path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(books.getReadableBookList(), lines);
    }
}
