package week_11.assignment.Question_11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int a;
        System.out.print("Enter numbers: ");
        do {
            a = input.nextInt();
            list.add(a);
        } while (a != 0);
        System.out.println("Largest number in the list is " + max(list));

    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.toArray().length > 0 && !list.contains(null)) {
            int max = Integer.MIN_VALUE;
            int counter = 0;
            while (list.get(counter) != 0) {
                if (list.get(counter) > max) {
                    max = list.get(counter);
                }
                ++counter;
            }

            return max;
        }
        return null;
    }

}
