package week_05.assignment;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer : ");
        int integer1 = input.nextInt();

        System.out.print("enter second integer : ");
        int integer2 = input.nextInt();

        int divisor = Math.min(integer1, integer2);

        int gcd = 1;
        boolean value = true;
        while (value) {
            if (integer1 % divisor == 0 && integer2 % divisor == 0) {
                gcd = divisor;
                value = false;
            }
            divisor--;
        }
        System.out.println("the greatest common divisor for "
                + integer1 + " and " + integer2 + " is " + gcd) ;
    }
}
