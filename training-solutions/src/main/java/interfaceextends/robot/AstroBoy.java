package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {
    public static final long ALTITUDE = 5;
    private int angle;
    private Point position;
    private List<Point> path = new ArrayList<>();

    public AstroBoy(Point position) {
        this.position = position;
    }

    public void flyTo(Point position) {
        path.add(position);
        this.position = position;
    }

    @Override
    public void liftTo(long altitude) {
        Point newHeightPosition = new Point(position.getX(),
                position.getY(), altitude);
        path.add(newHeightPosition);
        position = newHeightPosition;
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        flyTo(new Point(position.getX(), position.getY(), ALTITUDE));
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

    public int getAngle() {
        return angle;
    }

    public Point getPosition() {
        return position;
    }

    @Override
    public List<Point> getPath() {
        return new ArrayList<>(path);
    }

    private void walkTo(Point position) {
        path.add(position);
        this.position = position;
    }
}
