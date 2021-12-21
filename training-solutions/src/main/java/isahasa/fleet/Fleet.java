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
        loadCanCarryGoodsShips(getCanCarryGoodsShips(), cargoWeight);

        loadCanCarryPassengersShips(getCanCarryPassengersShips(), passengers);
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }

    private List<CanCarryGoods> getCanCarryGoodsShips() {
        if (ships.isEmpty()) {
            throw new IllegalStateException("There are no ships!");
        }

        List<CanCarryGoods> results = new ArrayList<>();
        for (Ship actual : ships) {
            if (actual instanceof CanCarryGoods) {
                results.add((CanCarryGoods) actual);
            }
        }
        return results;
    }

    private void loadCanCarryGoodsShips(List<CanCarryGoods> canCarryGoodsShips,
                                        int cargoWeight) {
        waitingCargo = cargoWeight;
        for (CanCarryGoods actual : canCarryGoodsShips) {
            if (waitingCargo > 0) {
                waitingCargo = actual.loadCargo(waitingCargo);
            }
            else {
                return;
            }
        }
    }

    private List<CanCarryPassengers> getCanCarryPassengersShips() {
        if (ships.isEmpty()) {
            throw new IllegalStateException("There are no ships!");
        }

        List<CanCarryPassengers> results = new ArrayList<>();
        for (Ship actual : ships) {
            if (actual instanceof CanCarryPassengers) {
                results.add((CanCarryPassengers) actual);
            }
        }
        return results;
    }

    private void loadCanCarryPassengersShips(
            List<CanCarryPassengers> canCarryPassengersShips, int passengers) {
        waitingPeople = passengers;
        for (CanCarryPassengers actual : canCarryPassengersShips) {
            if (waitingPeople > 0) {
                waitingPeople = actual.loadPassenger(waitingPeople);
            }
            else {
                return;
            }
        }
    }
}
