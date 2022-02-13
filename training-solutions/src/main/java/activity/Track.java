package activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        return null;
    }

    public Coordinate findMinimumCoordinate() {
        return null;
    }

    public double getDistance() {
        double fullDistance = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            fullDistance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i + 1));
        }
        return fullDistance;
    }

    public double getFullDecrease() {
        return 0;
    }

    public double getFullElevation() {
        return 0;
    }

    public double getRectangleArea() {
        return 0;
    }

    public List<TrackPoint> getTrackPoints() {
        return Collections.unmodifiableList(trackPoints);
    }
}
