package exceptions;

public class NullStringException extends Exception {
    private final String message;
    public NullStringException(String message) {
        super(message);
        this.message=message;
    }
    public void printException() {
        System.out.println(message);
    }
}
