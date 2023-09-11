package week_05.assignment;

public class Question_05_04 {
    public static void main(String[] args) {
        final double RATE = 1.609;
        System.out.println("Miles          Pounds");

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%-15d%.3f", i, i * RATE);
            System.out.println();
        }

    }
}
