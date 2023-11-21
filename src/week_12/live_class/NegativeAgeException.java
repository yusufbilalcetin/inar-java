package week_12.live_class;

public class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }

    public NegativeAgeException() {
        super("Age cannot be negative");
    }
}

