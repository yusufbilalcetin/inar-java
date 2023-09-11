package week_05.live_class;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SubractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTİONS = 5;
        int correnctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTİONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("what is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct ");
            } else {
                System.out.println("Your answer is wrong \n" + number1 + " - " + number2 +
                        " Should be " + (number1 - number2));
                count++;
                output += "\n" + number1 + " - " + number2 + " = " + answer +
                        ((number1 - number2 == answer) ? "corrent" : "wrong");
            }
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Corrent count is " + correnctCount +
                "\nTest time is " + testTime / 1000 + "seconds\n" + output);

    }
}
