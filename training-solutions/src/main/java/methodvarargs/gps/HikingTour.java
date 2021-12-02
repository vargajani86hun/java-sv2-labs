package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPoints = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        for (FieldPoint actual : fieldPointsToLog) {
            actual.setTimeOfLogging(timeOfLogging);
            fieldPoints.add(actual);
        }
    }

    public List<FieldPoint> getFieldPoints() {
        return new ArrayList<>(fieldPoints);
    }
}
