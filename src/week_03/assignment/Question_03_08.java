package week_03.assignment;

import java.util.Scanner;

public class Question_03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if (number3 > number1 && number2 < number1) {
            System.out.println(number1 + " > " + number2 + " > " + number3);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number1 + " > " + number3 + " > " + number2);
        } else {
            System.out.println(number1 + " > " + number3 + " > " + number2);
        }
    }
}
