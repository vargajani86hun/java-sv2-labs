package activity;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public void loadFromGpx(InputStream is) {

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
        double fullDecrease = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            double decrease = trackPoints.get(i).getElevation() - trackPoints.get(i + 1).getElevation();
            fullDecrease += (0 > decrease) ? decrease : 0;
        }
        return fullDecrease;
    }

    public double getFullElevation() {
        double fullElevation = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            double elevation = trackPoints.get(i).getElevation() - trackPoints.get(i + 1).getElevation();
            fullElevation += (0 < elevation) ? elevation : 0;
        }
        return fullElevation;
    }

    public double getRectangleArea() {
        double minLongitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .min().orElse(0);
        double maxLongitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .max().orElse(0);
        double minLatitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .min().orElse(0);
        double maxLatitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .max().orElse(0);
        Coordinate coordinateMinMin = new Coordinate(minLatitude, minLongitude);
        Coordinate coordinateMinMax = new Coordinate(minLatitude, maxLongitude);
        Coordinate coordinateMaxMin = new Coordinate(maxLatitude, minLongitude);
        Coordinate coordinateMaxMax = new Coordinate(maxLatitude, maxLongitude);
        double distanceA = coordinateMinMin.getDistanceFrom(coordinateMaxMin);
        double distanceB = coordinateMinMin.getDistanceFrom(coordinateMinMax);
        return distanceA * distanceB;
    }

    public List<TrackPoint> getTrackPoints() {
        return Collections.unmodifiableList(trackPoints);
    }
}
