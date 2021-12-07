package inheritancemethods.cars;

public class Car {
    private double fuelRate, fuel, tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        if (fuel > calculateRefillAmount()) {
            throw new IllegalArgumentException("Too much fuel to tank!");
        }
        this.fuel += fuel;
    }

    public void drive(int km) {
        if (km >= calculateDriveableDistance()) {
            throw new IllegalArgumentException("Not enought fuel to drive " +
                    km + "km!");
        }
        fuel -= (fuelRate * km / 100.);
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    private double calculateDriveableDistance() {
        return fuel / fuelRate *  100.;
    }
}
