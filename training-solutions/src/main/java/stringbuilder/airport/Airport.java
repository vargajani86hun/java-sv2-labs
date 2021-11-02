package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights(){
        StringBuilder sb = new StringBuilder();
        sb.append("Törölt járatok:\n");
        for (Flight f : flights) {
            if (f.getStatus() == Status.DELETED) {
                sb.append(f.getFlightNumber()).append('\n');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.addFlight(new Flight("W62342", Status.ACTIVE));
        airport.addFlight(new Flight("FR2795", Status.DELETED));
        airport.addFlight(new Flight("FZ3331", Status.ACTIVE));
        airport.addFlight(new Flight("LH1342", Status.ACTIVE));
        airport.addFlight(new Flight("NH5467", Status.DELETED));
        airport.addFlight(new Flight("SK3561", Status.DELETED));
        System.out.println(airport.getDeletedFlights());
    }
}
