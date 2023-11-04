package week_09.assignment;

import java.util.Scanner;

public class QuadraticEquationTest_09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        QuadraticEquation_09_10 quadraticEquation = new QuadraticEquation_09_10(a, b, c);

        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.printf("The equation has two roots %.3f and %.3f", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.printf("The equation has one root %.1f", quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }


    }
}
