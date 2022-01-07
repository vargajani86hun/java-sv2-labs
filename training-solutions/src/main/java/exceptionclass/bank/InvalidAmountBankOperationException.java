package exceptionclass.bank;

public class InvalidAmountBankOperationException extends
        InvalidBankOperationException {
    public InvalidAmountBankOperationException() {
        super("Invalid amount!");
    }
}
