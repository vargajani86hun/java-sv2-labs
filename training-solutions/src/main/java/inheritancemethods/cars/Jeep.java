package inheritancemethods.cars;

public class Jeep extends Car {
    private double extraCapacity, extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity,
                double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        if (fuel > calculateRefillAmount()) {
            throw new IllegalArgumentException("Too much fuel to tank!");
        }
        if (fuel <= super.calculateRefillAmount()) {
            super.modifyFuelAmount(fuel);
        }
        else {
            double toTankAmount = super.calculateRefillAmount();
            super.modifyFuelAmount(toTankAmount);
            extraFuel += (fuel - toTankAmount);
        }
    }

    @Override
    public void drive(int km) {
        if (km > calculateDriveableDistance()) {
            throw new IllegalArgumentException("Not enought fuel to drive " +
                    km + "km!");
        }

        if (extraFuel >= (getFuelRate() * km / 100.)){
            extraFuel -= getFuelRate() * km / 100.;
        }
        else {
            int remainDistance = (int) (km - (extraFuel / getFuelRate() * 100));
            super.drive(remainDistance);
            extraFuel = 0;
        }
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + extraCapacity - extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    private double calculateDriveableDistance() {
        return (getFuel() + extraFuel) / getFuelRate() *  100.;
    }
}
