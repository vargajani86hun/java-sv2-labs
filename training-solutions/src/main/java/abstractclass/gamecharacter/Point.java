package abstractclass.gamecharacter;

public class Point {
    private final long x, y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getDistance(Point otherPoint) {
        return (long) Math.sqrt(squaring(this.x - otherPoint.x) +
                squaring(this.y-otherPoint.y));
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    private long squaring(long a){
        return a * a;
    }
}
