package week_12.live_class;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println(printNumber());
    }


    public static void numberMethod() {
        int number = Integer.parseInt("Cats"); // NumberFormatException
    }


    public static int printNumber() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }


    public static void printNumber2(int x) throws ArithmeticException {
        if (x == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(10 / x);
        }
        System.out.println();

    }

}
