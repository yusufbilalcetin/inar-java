package week_05.assignment;

public class Question_05_11 {
    public static void main(String[] args) {
        final int NUMBER_OF_PER_LINES = 10;
        int count = 0;

        for (int number = 100; number <= 200; number++) {
            if ((number % 5 == 0) ^ (number % 6 == 0)) {
                count++;
                if (count % NUMBER_OF_PER_LINES == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }

        }
    }
}
