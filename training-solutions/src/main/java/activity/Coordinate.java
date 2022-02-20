package activity;

public class Coordinate {
    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        checkLatitude(latitude);
        checkLongitude(longitude);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getDistanceFrom(Coordinate other) {
        final double R = 6371.0088; //Radius of the earth in kilometers

        double latDistance = Math.toRadians(other.latitude - latitude);
        double lonDistance = Math.toRadians(other.longitude - longitude);
        double a = Math.pow(Math.sin(latDistance / 2), 2)
                + Math.cos(Math.toRadians(latitude))
                * Math.cos(Math.toRadians(other.latitude))
                * Math.pow(Math.sin(lonDistance / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c * 1000.; //Convert to meters
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private void checkLatitude(double latitude) {
        if (Math.abs(latitude) > 90) {
            throw new IllegalArgumentException("Invalid latitude value: " + latitude);
        }
    }

    private void checkLongitude(double longitude) {
        if (Math.abs(longitude) > 180) {
            throw new IllegalArgumentException("Invalid longitude value: " + longitude);
        }
    }
}
