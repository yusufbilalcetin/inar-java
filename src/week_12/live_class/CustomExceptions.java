package week_12.live_class;

public class CustomExceptions {
    public static void main(String[] args) {
        try {
            checkAge(-1);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkAge(int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative");
        }
    }
}

