package objectclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {
    SimpleBag handBag;

    @BeforeEach
    void init() {
        handBag = new SimpleBag();
        Book book1 = new Book("Gárdonyi Géza", "A láthatatlan ember");
        Book book2 = new Book("Madách Imre", "Az ember tragédiája");
        Book book3 = new Book("Fekete István", "Vuk");
        Beer beer1 = new Beer("Heineken", 480);
        Beer beer2 = new Beer("Kőbányai", 260);
        handBag.putItem(book2);
        handBag.putItem(book1);
        handBag.putItem(beer2);
        handBag.putItem(beer1);
        handBag.putItem(book3);
    }

    @Test
    void testCreate() {
        SimpleBag handBag = new SimpleBag();
        assertTrue(handBag.isEmpty());
        assertFalse(handBag.hasNext());
    }

    @Test
    void testPutItem() {
        SimpleBag handBag = new SimpleBag();
        Book book = new Book("Móra Ferenc", "Kincskereső kisködmön");
        handBag.putItem(book);
        assertFalse(handBag.isEmpty());
        Beer beer = new Beer("Heineken", 480);
        handBag.putItem(beer);
        assertEquals(2, handBag.size());
    }

    @Test
    void testNext() {
        Object item = handBag.next();
        assertTrue(item instanceof Book);
        assertEquals(1, handBag.getCursor());
    }

    @Test
    void testBeforeFirst() {
        for (int i = 0; handBag.hasNext(); i++) {
            handBag.next();
        }
        assertEquals(handBag.size(), handBag.getCursor());
        handBag.beforeFirst();
        assertEquals(0, handBag.getCursor());
    }

    @Test
    void testContains() {
        Beer beer = new Beer("Kőbányai", 260);
        Book book = new Book("Móra Ferenc", "Kincskereső kisködmön");
        assertTrue(handBag.contains(beer));
        assertFalse(handBag.contains(book));
    }
}