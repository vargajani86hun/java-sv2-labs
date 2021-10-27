package introconstructors;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void start() {
        this.startDateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        Task task = new Task("Kávé", "Igyál sok kávét.");
        task.setDuration(24);
        task.start();
        System.out.println(task.getStartDateTime() + "-tól elvégzendő feladat: " + task.getTitle());
        System.out.println(task.getDescription() + " " + task.getDuration() + " perced van rá.");
    }
}