package week_09.assignment;

import java.util.Scanner;

public class IntersectingPointTest_09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //2 2 5 -1.0 4.0 2.0 -1.0 -2.0
        //2 2 7 6.0 4.0 2.0 -1.0 -2.0

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = a * x1 - (-b * y1);
        double f = c * x3 - (-d * y3);

        LinearEquation_09_11 linearEquation = new LinearEquation_09_11(a, b, c, d, e, f);

        if (linearEquation.isSolvable()) {
            System.out.printf("The intersecting point is at (%.5f , %.4f)", linearEquation.getX(), linearEquation.getY());
        } else {
            System.out.println("The two lines are parallel");
        }
    }
}
