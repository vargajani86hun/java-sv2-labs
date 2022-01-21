package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {
    private List<Destination> destinations = new ArrayList<>();

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword) {
        if (destinations == null || destinations.isEmpty()) {
            return Optional.empty();
        }

        for (Destination d: destinations) {
            if (d.getDescription().contains(keyword)) {
                return Optional.of(d);
            }
        }

        return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm) {
        if (destinations == null || destinations.isEmpty()) {
            return Optional.empty();
        }

        for (Destination d: destinations) {
            if (d.getKmFromHome() < maxKm) {
                return Optional.of(d);
            }
        }

        return Optional.empty();
    }
}
