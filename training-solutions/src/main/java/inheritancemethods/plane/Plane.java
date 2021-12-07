package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("John Doe", 22_400);
        PriorityPassenger pPassenger = new PriorityPassenger("Jack Doe",
                22_400, 20);
        FirstClassPassenger fcPassenger = new FirstClassPassenger("Jane Doe",
                22_400, 25);
        System.out.println(passenger.getName() + ": " +
                passenger.getPriceOfPlaneTicket() + " Ft");
        System.out.println(pPassenger.getName() + ": " +
                pPassenger.getPriceOfPlaneTicket() + " Ft");
        System.out.println(fcPassenger.getName() + ": " +
                fcPassenger.getPriceOfPlaneTicket() + " Ft");
    }
}
