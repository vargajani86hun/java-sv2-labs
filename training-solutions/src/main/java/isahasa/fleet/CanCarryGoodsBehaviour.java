package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {
    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int fullWeight = this.cargoWeight + cargoWeight;
        if (maxCargoWeight < fullWeight) {
            this.cargoWeight = maxCargoWeight;
            return fullWeight - maxCargoWeight;
        }
        else {
            this.cargoWeight += cargoWeight;
            return 0;
        }
    }
}
