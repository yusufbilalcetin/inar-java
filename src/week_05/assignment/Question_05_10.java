package week_05.assignment;

public class Question_05_10 {
    public static void main(String[] args) {
        final int NUMBER_OF_PER_LINE = 10;
        int count = 0;

        for (int number = 120; number < 1000; number += 30) {
            count++;
            if (count % NUMBER_OF_PER_LINE == 0) {
                System.out.println(number);
            } else {
                System.out.print(number + " ");
            }
        }


    }
}
