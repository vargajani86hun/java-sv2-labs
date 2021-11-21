package introexceptioncause;

public class Tracking {
    public static void main(String[] args) {
        TrackPoints tp = new TrackPoints();
        tp.readDataFromFile("src/main/texts/tracking.csv");
        tp.printHeightDifferences();
    }
}
