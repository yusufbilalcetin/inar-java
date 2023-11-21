package week_12.live_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continueInput = true;


        do {
            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt();
                System.out.println("The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                System.out.println(input.hasNext());
                System.out.println(input.nextLine());

            }
        } while (continueInput);
        System.out.println("Final statement");
    }
}