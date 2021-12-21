package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{
    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int sumPassengers = this.passengers + passengers;
        if (maxPassengers < sumPassengers) {
            this.passengers = maxPassengers;
            return sumPassengers - maxPassengers;
        }
        else {
            this.passengers += passengers;
            return 0;
        }
    }
}
