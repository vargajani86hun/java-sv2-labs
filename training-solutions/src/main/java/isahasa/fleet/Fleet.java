package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople, waitingCargo;

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight) {
        if (ships.isEmpty()) {
            throw new IllegalStateException("There are no ships!");
        }

        waitingCargo = cargoWeight;
        waitingPeople = passengers;

        for (Ship actual : ships) {
            if (actual instanceof CanCarryGoods ccgShip && waitingCargo > 0) {
                waitingCargo = ccgShip.loadCargo(waitingCargo);
            }
            if (actual instanceof CanCarryPassengers ccpShip && waitingPeople > 0) {
                waitingPeople = ccpShip.loadPassenger(waitingPeople);
            }
        }
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
