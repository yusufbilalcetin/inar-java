package week_03.assignment;

import java.util.Scanner;

public class Question_03_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");

        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double check = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        double length1 = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
        double length2 = Math.sqrt(Math.pow(x2 - x0, 2) + Math.pow(y2 - y0, 2));

        if (check == 0 && length1 >= length2) {
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from " +
                    "(" + x0 + ", " + y0 + ") to " + "(" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from " +
                    "(" + x0 + ", " + y0 + ") to " + "(" + x1 + ", " + y1 + ")");
        }

    }
}
