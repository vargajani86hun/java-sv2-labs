package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {
    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(Issue another, CopyMode copyMode) {
        this.name = another.name;
        this.time = another.time;
        this.status = another.status;
        if (copyMode == CopyMode.WITH_COMMENTS) {
            this.comments.addAll(copyComments(another.comments));
        }
    }
    public void addComment(Comment newComment) {
        comments.add(newComment);
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return new ArrayList<>(comments);
    }

    private List<Comment> copyComments (List<Comment> comments) {
        List<Comment> results = new ArrayList<>();
        for (Comment c: comments) {
            results.add(new Comment(c));
        }
        return results;
    }
}
