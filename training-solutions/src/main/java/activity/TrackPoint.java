package activity;

public class TrackPoint {
    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getDistanceFrom(TrackPoint other) {
        final int R = 6371; //Radius of the earth in kilometers

        double latDistance = Math.toRadians(other.getCoordinate().getLatitude()
                - coordinate.getLatitude());
        double lonDistance = Math.toRadians(other.getCoordinate().getLongitude()
                - coordinate.getLongitude());
        double a = Math.pow(Math.sin(latDistance / 2), 2)
                + Math.cos(Math.toRadians(coordinate.getLatitude()))
                * Math.cos(Math.toRadians(other.getCoordinate().getLatitude()))
                * Math.pow(Math.sin(lonDistance / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; //Convert to meters

        double height = elevation - other.elevation;

        return Math.sqrt(Math.pow(distance, 2) + Math.pow(height, 2));
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }
}
