package activitytracker;

import activity.ActivityType;

import java.time.LocalDateTime;
import java.util.Objects;

public class Activity {
    private long id;
    private LocalDateTime startTime;
    private String description;
    private activity.ActivityType type;

    public Activity(long id, LocalDateTime startTime, String description, ActivityType type) {
        this.id = id;
        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }

    public Activity(LocalDateTime startTime, String description, ActivityType type) {
        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }

    public long getId() {
        return id;
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

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity activity)) return false;
        return id == activity.id && Objects.equals(startTime, activity.startTime) && Objects.equals(description, activity.description) && type == activity.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, description, type);
    }
}
