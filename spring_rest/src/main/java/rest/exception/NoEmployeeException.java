package rest.exception;

public class NoEmployeeException extends RuntimeException {
    public NoEmployeeException(String message) {
        super(message);
    }
}
