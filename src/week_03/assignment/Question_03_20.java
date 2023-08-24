package week_03.assignment;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58F and -41F: ");
        int temperature = input.nextInt();

        System.out.println("Enter the wind speed (>=2) in miles per hour : ");
        int speed = input.nextInt();

        if (temperature >= -58 && temperature <= 41 && speed >= 2) {
            double chill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temperature * Math.pow(speed, 0.16));
            System.out.print("The wind chill index is ");
            System.out.format("%.5f", chill);
        } else if ((temperature < -58 || temperature > 41) && speed >= 2) {
            System.out.println("The input of temperature is invalid.");
        } else if (speed < 2 && temperature >= -58 && temperature <= 41) {
            System.out.println("The input of wind speed is invalid");
        } else {
            System.out.println("The inputs are invalid");
        }

    }
}
