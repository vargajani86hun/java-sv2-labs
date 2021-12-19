package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {
    Deletable orderState;

    @Test
    void testNew() {
        orderState = OrderState.NEW;
        assertTrue(orderState.canDelete());
    }

    @Test
    void testConfirmed() {
        orderState = OrderState.CONFIRMED;
        assertTrue(orderState.canDelete());
    }

    @Test
    void testPrepared() {
        orderState = OrderState.PREPARED;
        assertTrue(orderState.canDelete());
    }

    @Test
    void testOnboard() {
        orderState = OrderState.ONBOARD;
        assertFalse(orderState.canDelete());
    }

    @Test
    void testDelivered() {
        orderState = OrderState.DELIVERED;
        assertFalse(orderState.canDelete());
    }

    @Test
    void testReturned() {
        orderState = OrderState.RETURNED;
        assertFalse(orderState.canDelete());
    }

    @Test
    void testDeleted() {
        orderState = OrderState.DELETED;
        assertFalse(orderState.canDelete());
    }
}