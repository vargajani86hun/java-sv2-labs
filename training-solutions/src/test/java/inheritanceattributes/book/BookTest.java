package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testCreate() {
        Book book = new Book("Éjszakai őrség", 3200);
        assertEquals("Éjszakai őrség", book.getTitle());
        assertEquals(3200, book.price);
    }

    @Test
    void testPurchase() {
        Book book = new Book("Metro 2033", 3890);
        assertEquals(11670, book.purchase(3));
    }
}