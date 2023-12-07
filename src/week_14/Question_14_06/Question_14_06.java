package week_14.Question_14_06;

import java.util.ArrayList;
import java.util.List;

public class Question_14_06 {
    public static void main(String[] args) {
        // Create a list and populate it with 10 random integers
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }

        // Print the original list
        System.out.println("Original List: " + list);

        // Rearrange the list with odd numbers first, followed by even numbers
        ArrangeList(list);

        // Print the rearranged list
        System.out.println("Rearranged List: " + list);
    }

    // Rearrange the given list with odd numbers first, followed by even numbers
    public static void ArrangeList(List<Integer> list) {
        // Separate odd and even numbers into two separate lists
        List<Integer> oddNums = new ArrayList<>();
        List<Integer> evenNums = new ArrayList<>();

        // Iterate through the original list and categorize numbers
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                oddNums.add(list.get(i));
            } else {
                evenNums.add(list.get(i));
            }
        }
    }
}
