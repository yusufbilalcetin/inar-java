package week_04.live_class;


import java.util.Scanner;

public class MaxMinMidAbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min,mid,max;

        System.out.println("Please enter three numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int tempMax = Math.max(num1, num2);
        max = Math.max(tempMax, num3);

        System.out.printf("the numbers are %d, %d, %d\n", num1, num2, num3);
        System.out.printf("the max numbers are %d\n", max);

        //---------------------------------------------------

        int tempMin = Math.min(num1, num2);
        min = Math.min(tempMin, num3);

        System.out.printf("the min numbers are %d\n", min);

        //----------------------------------------------------

        if (num1 != max && num1 != min) {
            mid = num1;
        } else if (num2 != max && num2 != min) {
            mid = num2;
        } else {
            mid = num3;
        }

        System.out.printf("the mid numbers are %d\n", mid);

    }
}
