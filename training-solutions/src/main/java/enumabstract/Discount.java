package enumabstract;

public enum Discount {
    SPECIAL_OFFER {
        private final int OFFER = 20;
        @Override
        public double getAmountToPay(int price, int pieces) {
            return pieces * price * (1 - (OFFER / 100.));
        }
    },
    BLACK_FRIDAY_OFFER {
        private final int OFFER = 25;
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces <= 2) {
                return pieces * price * (1 - (OFFER / 100.));
            }
            else {
                double blackFridayPrice = price * (1 - (2 * OFFER / 100.));
                return blackFridayPrice + ((pieces - 1) * price *
                        (1 - (OFFER / 100.)));
            }
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
