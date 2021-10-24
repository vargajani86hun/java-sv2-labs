package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        CircleCalculator circle = new CircleCalculator();
        System.out.println("A 10 egység sugarú kör kerülete: " + circle.calculatePerimeter(10));
        System.out.println("A 10 egység sugarú kör területe: " + circle.calculateArea(10));

        CylinderCalculator cylinder = new CylinderCalculator();
        System.out.println("A 10 egység sugarú kör alapú, 5 egység magas henger felszíne: " +
                cylinder.calculateSurfaceArea(10, 5));
        System.out.println("A 10 egység sugarú kör alapú, 5 egység magas henger térfogata: " +
                cylinder.calculateVolume(10, 5));

        CylinderCalculatorBasedOnCircle cylinder2 = new CylinderCalculatorBasedOnCircle();
        System.out.println("Az 10 egyés sugarú kör alapú, 5 egység magas henger felszíne: " +
                cylinder2.calculateSurfaceArea(10, 5));
        System.out.println("Az 10 egyés sugarú kör alapú, 5 egység magas henger felszíne: " +
                cylinder2.calculateVolume(10, 5));
        System.out.println("A pi értéke: " + CircleCalculator.PI);
    }
}
