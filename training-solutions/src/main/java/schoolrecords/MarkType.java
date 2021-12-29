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

    public static MarkType parseMarkType(String line) {
        if (line.length() == 1) {
            char first = line.charAt(0);
            switch (first) {
                case '5':
                case 'A':
                    return MarkType.A;
                case '4':
                case 'B':
                    return MarkType.B;
                case '3':
                case 'C':
                    return MarkType.C;
                case '2':
                case 'D':
                    return MarkType.D;
                case '1':
                case 'F':
                    return MarkType.F;
                default:
                    throw new IllegalArgumentException("Not a valid mark! Use 1-5, or A-D and F.");
            }
        }
        else {
            throw new IllegalArgumentException("Not a valid mark! Use 1-5, or A-D and F.");
        }
    }
}
