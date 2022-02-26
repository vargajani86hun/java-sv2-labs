package activitytracker;

import java.time.LocalDate;
import java.util.Objects;

public class TrackPoint {
    private long id;
    private LocalDate time;
    private double lat;
    private double lon;

    public TrackPoint(LocalDate time, double lat, double lon) {
        this.time = time;
        this.lat = lat;
        this.lon = lon;
    }

    public TrackPoint(long id, LocalDate time, double lat, double lon) {
        this.id = id;
        this.time = time;
        this.lat = lat;
        this.lon = lon;
    }

    public long getId() {
        return id;
    }

    public LocalDate getTime() {
        return time;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public boolean isValid() {
        return  ((Math.abs(lon) <= 180) && (Math.abs(lat) <= 90));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TrackPoint that)) return false;
        return Double.compare(that.lat, lat) == 0 && Double.compare(that.lon, lon) == 0 && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, lat, lon);
    }
}
