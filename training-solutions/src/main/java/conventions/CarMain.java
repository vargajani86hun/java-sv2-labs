package conventions;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Car car;
        String carType, engineType, modelName;
        int doors, persons;
        Scanner scr = new Scanner(System.in);

        System.out.println("Kérem, adja meg az autó márkáját: ");
        carType = scr.nextLine();
        System.out.println("Kérem, adja meg a motor típusát: ");
        engineType = scr.nextLine();
        System.out.println("Kérem, adja meg az ajtók számát: ");
        doors = scr.nextInt();
        scr.nextLine();
        System.out.println("Kérem adja meg az ülések számát: ");
        persons = scr.nextInt();
        scr.nextLine();
        car = new Car(carType, engineType, doors, persons);
        System.out.println("Az ön autója egy " + car.getEngineType() + " üzemű, " + car.getDoors() + " ajtós, " +
                car.getPersons() + " személyes, " + car.getCarType() + " típusú jármű.");

        System.out.println("Adja meg a modell nevét: ");
        modelName = scr.nextLine();
        car.addModelName(modelName);
        System.out.println("Az ön autójának pontos típusa: " + car.getCarType());

        System.out.println("Adjon meg egy új márkát: ");
        car.setCarType(scr.nextLine());
        System.out.println("Adjon meg egy új motor típust: ");
        car.setEngineType(scr.nextLine());
        System.out.println("Adja meg az ajtók új számát: ");
        car.setDoors(scr.nextInt());
        scr.nextLine();
        System.out.println("Adja meg az ülések új számát: ");
        car.setPersons(scr.nextInt());
        System.out.println("Az új jármű egy " + car.getEngineType() + " üzemű, " + car.getDoors() + " ajtós, " +
                car.getPersons() + " személyes, " + car.getCarType() + " típusú jármű.");

    }
}
