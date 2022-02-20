package activity;

public class TrackPoint {
    private static final double RADIAN_TO_DIAGONAL = 180.0D / 3.141592653589793D;
    private static final double DIAGONAL_TO_RADIAN = 3.141592653589793D / 180.0D;
    private static final double DIAGONAL_TO_KILOMETER = 111189.57696D * RADIAN_TO_DIAGONAL;

    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getDistanceFrom(TrackPoint other) {
        /*
        final double R = 6371.0088; //Radius of the earth in kilometers

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
         */
        double x = coordinate.getLatitude() * DIAGONAL_TO_RADIAN;
        double y = other.coordinate.getLatitude() * DIAGONAL_TO_RADIAN;
        return Math.acos( Math.sin(x) * Math.sin(y) + Math.cos(x) * Math.cos(y)
                * Math.cos(DIAGONAL_TO_RADIAN * (coordinate.getLongitude()
                - other.coordinate.getLongitude()))) * DIAGONAL_TO_KILOMETER;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }
}
