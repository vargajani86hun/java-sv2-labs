package schoolrecords;

public enum MarkType {
    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    private final int value;
    private final String rating;

    MarkType(int value, String rating) {
        this.value = value;
        this.rating = rating;
    }

    public int getValue() {
        return value;
    }

    public String getRating() {
        return rating;
    }


    @Override
    public String toString() {
        return rating + "(" + value + ")";
    }
}
