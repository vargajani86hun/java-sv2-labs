package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (String arguments: args) {
            if (("/list").equals(arguments)) {
                System.out.println("Listázás");
            }
            else if (("/add").equals(arguments)) {
                System.out.println("Hozzzáadás");
            }
            else if (("/delete").equals(arguments)) {
                System.out.println("Törlés");
            }
            else {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}
