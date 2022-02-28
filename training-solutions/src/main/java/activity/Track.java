package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public void loadFromGpx(InputStream is) {
        List<Coordinate> coordinates = new ArrayList<>();
        List<Double> elevations = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().startsWith("<trkpt")) {
                    String[] parts = line.trim().split("\"");
                    coordinates.add(new Coordinate(Double.parseDouble(parts[1]), Double.parseDouble(parts[3])));
                } else if (line.trim().startsWith("<ele>")) {
                    elevations.add(Double.parseDouble(line.trim().substring(5, 10)));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read input stream", ioe);
        }

        buildListFromCoordinatesAndElevations(coordinates, elevations);
    }

    private void buildListFromCoordinatesAndElevations(List<Coordinate> coordinates, List<Double> elevations) {
        if (coordinates.size() != elevations.size()) {
            throw new IllegalStateException("Coordinates and elevations has not got equal number");
        }
        for (int i = 0; i < coordinates.size(); i++) {
            trackPoints.add(new TrackPoint(coordinates.get(i), elevations.get(i)));
        }
    }

    public Coordinate findMaximumCoordinate() {
        double maxLongitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .max().orElse(0);
        double maxLatitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .max().orElse(0);
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate() {
        double minLongitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .min().orElse(0);
        double minLatitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .min().orElse(0);
        return new Coordinate(minLatitude, minLongitude);
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
            double decrease = trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            fullDecrease += (0 > decrease) ? decrease : 0;
        }
        return Math.abs(fullDecrease);
    }

    public double getFullElevation() {
        double fullElevation = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            double elevation = trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            fullElevation += (0 < elevation) ? elevation : 0;
        }
        return fullElevation;
    }

    public double getRectangleArea() {
        TrackPoint minimum = new TrackPoint(findMinimumCoordinate(), 0);
        TrackPoint maximum = new TrackPoint(findMaximumCoordinate(), getLargestElevation());
        double diagonal = minimum.getDistanceFrom(maximum);
        return Math.pow(diagonal, 2) / 2;
    }

    public List<TrackPoint> getTrackPoints() {
        return Collections.unmodifiableList(trackPoints);
    }

    private double getLargestElevation() {
        double largestElevation = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            double elevation = trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            largestElevation = Math.max(largestElevation, elevation);
        }
        return largestElevation;
    }
}
