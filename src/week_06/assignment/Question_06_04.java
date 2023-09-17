package week_06.assignment;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("display an integer reversed : ");

        System.out.print("Enter an integer : ");
        int number = input.nextInt();

        System.out.println("reverse of the number: ");
        reverse(number);

    }


    public static void reverse(int number) {
        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }
}
