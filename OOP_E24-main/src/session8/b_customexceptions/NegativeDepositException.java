package session8.b_customexceptions;

public class NegativeDepositException extends RuntimeException {
    public NegativeDepositException() {
      super("This is not allowed. It is a negative quantity.");
    }

}
