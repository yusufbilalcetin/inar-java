package week_03.assignment;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds : ");
        double weight = input.nextDouble();

        System.out.println("Enter feet: ");
        double feet = input.nextDouble();

        System.out.println("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUNDS = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInkilograms = weight * KILOGRAMS_PER_POUNDS;
        double heightInMeters = (inches + feet * 12) * METERS_PER_INCH;
        double bmi = weightInkilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
    }
}
