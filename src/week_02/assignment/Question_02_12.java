package week_02.assignment;

import java.util.Scanner;

public class Question_02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();

        double length = Math.pow(v , 2) / (2 * a);
        System.out.println("The minumum runaway length for this airplane is " + length);




    }
}
