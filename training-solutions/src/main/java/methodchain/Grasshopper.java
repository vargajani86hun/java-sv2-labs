package methodchain;

public class Grasshopper {
    private int position;

    public Grasshopper hopOnce(Direction direction) {
        position += (Direction.POSITIVE == direction) ? 1 : -1;
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops() {
        this.hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.NEGATIVE).hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE);
    }

    public int getPosition() {
        return position;
    }
}
