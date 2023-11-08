package week_10.assignment;

import week_10.live_class.StackOfInteger;

public class Question_10_06 {
    public static void main(String[] args) {

        StackOfInteger stack = new StackOfInteger();

        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }
        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        for (int d = 2; d <= number / 2; d++) {
            if (number % d == 0) {
                return false;
            }
        }
        return true;
    }
}
