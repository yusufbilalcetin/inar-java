package week_04.live_class;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        double c = Math.sqrt((Math.pow(a,2)) + (Math.pow(b,2)) );
        System.out.println("the hypotenuse of triangle with the following edge " + a + " and " + b + " is " + c);
    }
}
