package week_03.assignment;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double r1 = (-b + Math.pow(Math.pow(b , 2) - 4  * a * c , 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(Math.pow(b , 2) - 4  * a * c , 0.5)) / (2 * a);

        if (Math.pow(b , 2) - 4 * a * c > 0) {
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        if (Math.pow(b , 2) - 4 * a * c == 0) {
            System.out.println("The equation has one root " + r1);
        }
        if (Math.pow(b , 2) - 4 * a * c < 0){
            System.out.println("The equation has no real roots ");
        }


    }
}
