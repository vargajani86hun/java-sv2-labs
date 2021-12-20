package statemachine.seatheater;

public enum SeatHeaterState {
    OFF{
        @Override
        SeatHeaterState next() {
            return MAXIMUM;
        }
    },
    MAXIMUM{
        @Override
        SeatHeaterState next() {
            return LEVEL_TWO;
        }
    },
    LEVEL_TWO{
        @Override
        SeatHeaterState next() {
            return LEVEL_ONE;
        }
    },
    LEVEL_ONE{
        @Override
        SeatHeaterState next() {
            return OFF;
        }
    };

    abstract SeatHeaterState next();
}
