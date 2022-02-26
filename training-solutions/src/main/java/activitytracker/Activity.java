package activitytracker;

import activity.ActivityType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Activity {
    private long id;
    private LocalDateTime startTime;
    private String description;
    private activity.ActivityType type;
    private List<TrackPoint> trackPoints;

    public Activity(LocalDateTime startTime, String description, ActivityType type) {
        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }

    public Activity(long id, LocalDateTime startTime, String description, ActivityType type) {
        this(startTime, description, type);
        this.id = id;
    }

    public Activity(LocalDateTime startTime, String description, ActivityType type, List<TrackPoint> trackPoints) {
        this(startTime, description, type);
        this.trackPoints = trackPoints;
    }

    public Activity(long id, LocalDateTime startTime, String description, ActivityType type, List<TrackPoint> trackPoints) {
        this(id, startTime, description, type);
        this.trackPoints = trackPoints;
    }

    public Activity(long id, Activity other) {
        this.id = id;
        this.startTime = other.startTime;
        this.description = other.description;
        this.type = other.type;
        this.trackPoints = other.trackPoints;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDescription() {
        return description;
    }

    public ActivityType getType() {
        return type;
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", trackPoints=" + trackPoints +
                '}';
    }
}
