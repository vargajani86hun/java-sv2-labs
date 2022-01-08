package catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AudioFeatures implements Feature {
    private final String title;
    private final int length;
    private List<String> composers, performers;

    public AudioFeatures(String title, int length, List<String> performers, List<String> composers) {
        this(title, length, performers);
        checkComposers(composers);
        this.composers = composers;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        checkTitle(title);
        this.title = title;
        checkLength(length);
        this.length = length;
        checkPerformers(performers);
        this.performers = performers;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public List<String> getComposers() {
        return new ArrayList<>(composers);
    }

    public List<String> getPerformers() {
        return new ArrayList<>(performers);
    }

    @Override
    public List<String> getContributors() {
        List<String> results = new ArrayList<>();
        if (!Validators.isEmpty(composers)) {
            results.addAll(composers);
        }
        if (!Validators.isEmpty(performers)) {
            results.addAll(performers);
        }
        return results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof AudioFeatures af) {
            return af.title.equals(this.title) && af.length == this.length && af.composers.equals(this.composers) &&
                    af.performers.equals(this.performers);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length, composers, performers);
    }

    private void checkTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
    }

    private void checkLength(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length should be positive");
        }
    }

    private void checkComposers(List<String> composers) {
        if (Validators.isEmpty(composers)) {
            throw new IllegalArgumentException("Composers must not be empty");
        }
    }

    private void checkPerformers(List<String> performers) {
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Performers must not be empty");
        }
    }
}
