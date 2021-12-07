package dynamictypes.publictransport;

public class PublicVehicle {
    private int lineNumber;
    private double length;

    public PublicVehicle(int lineNumber, double length) {
        this.lineNumber = lineNumber;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
