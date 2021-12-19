package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void testSpecialOffer() {
        double total = Discount.SPECIAL_OFFER.getAmountToPay(2_500, 4);
        assertEquals(8_000, total);
    }

    @Test
    void testBlackFridayOffer() {
        double total = Discount.BLACK_FRIDAY_OFFER.getAmountToPay(2_000, 1);
        assertEquals(1_500, total);

        total = Discount.BLACK_FRIDAY_OFFER.getAmountToPay(2_500, 2);
        assertEquals(3_750, total);

        total = Discount.BLACK_FRIDAY_OFFER.getAmountToPay(2_500, 3);
        assertEquals(5_000, total);
    }

}