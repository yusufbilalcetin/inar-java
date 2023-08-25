package week_03.assignment;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if (Math.pow(Math.pow(x, 2), 0.5) <= 10.0 / 2 || Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2) {
            System.out.println("Point (" + x + "," + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + "," + y + ") is not in the rectangle");
        }
    }

}
