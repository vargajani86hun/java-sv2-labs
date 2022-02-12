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
