package week_06.assignment;

import java.util.Scanner;

public class Question_06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The are of the pentagon is " +  area(side));
    }

    public static double area(double side) {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }
}
