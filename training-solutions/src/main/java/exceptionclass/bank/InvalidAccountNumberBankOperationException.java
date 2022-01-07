package exceptionclass.bank;

public class InvalidAccountNumberBankOperationException extends
        InvalidBankOperationException {
    public InvalidAccountNumberBankOperationException() {
        super("Invalid account number!");
    }
}
