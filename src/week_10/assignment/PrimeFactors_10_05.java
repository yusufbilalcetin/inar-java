package week_10.assignment;

import week_10.live_class.StackOfInteger;

import java.util.Scanner;

public class PrimeFactors_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int divider = 2;
        StackOfInteger stack = new StackOfInteger();
        while (number != 1) {
            if (number % divider == 0) {
                number /= divider;
                stack.push(divider);
            } else {
                divider++;
            }
        }
        System.out.print("Decreasing order: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}