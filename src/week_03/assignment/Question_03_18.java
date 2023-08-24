package week_03.assignment;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your package weight in pounds: ");
        double weight = input.nextDouble();
        double multiplier = 0;

        if (weight > 0 && weight <= 1) {
            multiplier = 3.5;
        } else if (weight > 1 && weight <= 3) {
            multiplier = 5.5;
        } else if (weight > 3 && weight <= 10) {
            multiplier = 8.5;
        } else if (weight > 10 && weight <= 20) {
            multiplier = 10.5;
        }
        if (multiplier == 0) {
            System.out.println("this package cannot be shipped. ");
        } else {
            System.out.println("the shipping cost of package is $" + multiplier * weight);
        }
    }
}
