package methodoverloading;

public enum Number {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
    SEVEN(7), EIGHT(8), NIGHT(9), TEN(10), ELEVEN(11),
    TWELVE(12), THIRTEEN(13), FOURTEEN(14), FIFTEEN(15),
    SIXTEEN(16), SEVENTEEN(17), EIGHTEEN(18), NINETEEN(19),
    TWENTY(20), TWENTYONE(21), TWENTYTWO(22), TWENTYTHREE(23),
    TWENTYFOUR(24), TWENTYFIVE(25);

    private int value;

    Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
