package exceptionclass.bank;

public class LowBalanceBankOperationException extends
        InvalidBankOperationException {
    public LowBalanceBankOperationException() {
        super("Low balance!");
    }
}
