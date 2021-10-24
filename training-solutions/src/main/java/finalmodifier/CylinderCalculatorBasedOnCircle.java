package finalmodifier;

public class CylinderCalculatorBasedOnCircle {
    public double calculateVolume(double r, double h) {
        return h * (new CircleCalculator()).calculateArea(r);
    }

    public double calculateSurfaceArea(double r, double h) {
        CircleCalculator circle = new CircleCalculator();
        return h * circle.calculatePerimeter(r) + 2 * circle.calculateArea(r);
    }
}
