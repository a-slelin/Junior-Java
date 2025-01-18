package Exception;

public class EmptyArrayException extends RuntimeException {
    public EmptyArrayException() {
        super("Array is empty.");
    }
}
