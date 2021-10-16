package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(137.433, true);
        System.out.println("The distance is " + distance.getDistanceInKm() + "km");
        System.out.println("This distance value is " + (distance.isExact()?"exact":"not exact"));

        int km = (int)distance.getDistanceInKm();
        System.out.println("The whole part of the distance is: " + km + "km");
    }
}
