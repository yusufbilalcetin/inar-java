package week_13.Question_13_20;

import week_13.Question_13_17.Complex;

import java.util.Scanner;

public class Question_13_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            System.out.println("The root is " + (-b + Math.sqrt(discriminant)) / (2 * a));
        } else {
            System.out.print("The root are ");
            Complex root1 = new Complex(-b / (2 * a), Math.sqrt(2 * a));
            Complex root2 = new Complex(-b / (2 * a), -Math.sqrt(2 * a));
            System.out.println(root1 + " and " + root2);
        }
    }
}
