package week_03.assignment;

import java.util.Scanner;

public class Question_03_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double x;
        double y;

        if ( (a * d) - (b * c) == 0) {
            System.out.println("the equation has no solution ");
        }else {
            x = ( (e * d) - (b * c) ) / ( (a * d) - (b * c) );
            y = ( (a * d) - (e * c) ) / ( (a * d) - (b * c) );
            System.out.println("x is " + x + " and y is " + y);
            }
        }
}
