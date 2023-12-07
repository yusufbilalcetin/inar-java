package week_14.Question_14_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_14_07 {
    public static void main(String[] args) {

        // Create a list and populate it with 7 random integers
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }

        // Print the generated list
        System.out.println("Generated list: " + list);

        // Generate a random value for 'y'
        int y = (int) (Math.random() * 10 + 1);

        // Prompt the user for the position of the 'y' greatest number
        System.out.println("What is the " + y + " greatest number");

        // Sort the list in ascending order and then reverse it for descending order
        Collections.sort(list);
        Collections.reverse(list);

        // Print the 'y'th largest element in the list
        System.out.println("The " + y + "th largest element is: " + list.get(y - 1));
    }
}
