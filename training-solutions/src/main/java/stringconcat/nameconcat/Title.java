package stringconcat.nameconcat;

public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr."),
    PHD("phD.");
    private final String value;

    Title (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
