package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {

    @Test
    void testOrder() {
        ShippedBook shippedBook = new ShippedBook("A hobbit", 4200,
                1390);
        assertEquals("A hobbit: 4200 Ft, postaköltség: 1390 Ft",
                shippedBook.toString());
        assertEquals(13990, shippedBook.order(3));
    }

}