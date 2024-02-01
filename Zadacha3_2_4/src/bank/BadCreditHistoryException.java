package bank;

public class BadCreditHistoryException extends RuntimeException{
    BadCreditHistoryException(String message) {
        super(message);

    }
}
