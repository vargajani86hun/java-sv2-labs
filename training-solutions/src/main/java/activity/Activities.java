package activity;

import java.util.List;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        return activities.stream()
                .map(a -> new Report(a.getType(), a.getDistance()))
                .toList();
    }

    public int numberOfTrackActivities() {
        return (int) activities.stream()
                .filter(a -> a instanceof ActivityWithTrack)
                .count();
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities.stream()
                .filter(a -> a instanceof ActivityWithoutTrack)
                .count();
    }
}
