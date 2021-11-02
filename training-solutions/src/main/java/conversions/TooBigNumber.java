package conversions;

public class TooBigNumber {
    public long getRightResult(int number) {
        return 2_147_483_647L + number;
    }

    public static void main(String[] args) {
        TooBigNumber tbn = new TooBigNumber();
        System.out.println(tbn.getRightResult(321_568));
    }
}
