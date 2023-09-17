package week_06.assignment;

public class Question_06_01 {
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONALS = 100; // Display the first 100 pentagonals
        final int NUMBER_PER_LINE = 10;

        for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
            if (i % NUMBER_PER_LINE == 0) {
                System.out.printf("%7d\n", getPentagonlNumber(i));
            } else {
                System.out.printf("%7d", getPentagonlNumber(i));
            }
        }
    }

    public static int getPentagonlNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}