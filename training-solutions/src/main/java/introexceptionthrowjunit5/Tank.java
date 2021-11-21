package introexceptionthrowjunit5;

public class Tank {
    private int angle;

    public void modifyAngle(int angleNumber) {
        if(Math.abs(angle + angleNumber) > 80) {
            throw new IllegalArgumentException("Túl nagy szögérték!");
        }
        angle += angleNumber;
    }

    public int getAngle() {
        return angle;
    }

}
