package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        Position[] positions = Position.values();
        for (Position p : positions) {
            System.out.println(p.name() + " fizetése: " + p.getSalary() +
                    "Ft, egyéb juttatásai:\n" + p.getBenefit());
        }
    }
}
