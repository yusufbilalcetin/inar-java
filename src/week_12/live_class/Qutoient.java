package week_12.live_class;

import java.util.Scanner;

public class Qutoient {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 != 0)
            System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        else
            System.out.println("Divisor cannot be zero");
        System.out.println("Final statement");
    }
}

