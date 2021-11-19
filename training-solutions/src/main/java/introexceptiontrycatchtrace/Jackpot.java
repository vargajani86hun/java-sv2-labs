package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        Winner winner = new Winner();
        for (int i = 1; i < 10; i++){
            System.out.println("Az " + i + ". nap nyertese:");
            try {
                System.out.println(winner.getWinner());
            }
            catch (NullPointerException npe) {
                System.out.println("Nem járult hozzá a neve közléséhez.");
            }
        }
    }
}
