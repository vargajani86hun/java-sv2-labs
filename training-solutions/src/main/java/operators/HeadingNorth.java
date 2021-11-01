package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections() {
        int i = 0;
        int direction = 0;
        while (direction < 360) {
            i++;
            direction += i * 10;
        }
        return i;
    }

    public static void main(String[] args) {
        HeadingNorth hn = new HeadingNorth();
        System.out.println("A megtett irányváltoztatások száma: " +
                hn.getNumberOfNewDirections());
    }
}
