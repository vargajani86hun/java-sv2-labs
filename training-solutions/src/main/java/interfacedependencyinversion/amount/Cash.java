package interfacedependencyinversion.amount;

public class Cash implements Payable {
    @Override
    public int getPayableAmount(int amount) {
        switch (amount % 5) {
            case 1:
                return amount - 1;
            case 2:
                return amount - 2;
            case 3:
                return amount + 2;
            case 4:
                return amount + 1;
            default:
                return amount;
        }
    }
}
