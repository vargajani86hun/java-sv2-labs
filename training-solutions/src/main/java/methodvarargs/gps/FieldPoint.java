package methodvarargs.gps;

import java.time.LocalDateTime;

public class FieldPoint {
    private LocalDateTime timeOfSetting, timeOfLogging;
    private double latitude, longitude;

    public FieldPoint(LocalDateTime timeOfSetting, double latitude, double longitude) {
        this.timeOfSetting = timeOfSetting;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocalDateTime getTimeOfSetting() {
        return timeOfSetting;
    }

    public LocalDateTime getTimeOfLogging() {
        return timeOfLogging;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setTimeOfLogging(LocalDateTime timeOfLogging) {
        isValidLoggingTime(timeOfLogging);
        this.timeOfLogging = timeOfLogging;
    }

    private boolean isValidLoggingTime(LocalDateTime timeOfLogging) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("Logging time is not available");
        }
        return true;
    }
}
