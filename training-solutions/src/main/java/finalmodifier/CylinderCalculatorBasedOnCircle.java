package finalmodifier;

public class CylinderCalculatorBasedOnCircle {
    public double calculateVolume(double r, double h) {
        return h * (new CircleCalculator()).calculateArea(r);
    }

    public double calculateSurfaceArea(double r, double h) {
        return h * (new CircleCalculator()).calculatePerimeter(r);
    }
}
