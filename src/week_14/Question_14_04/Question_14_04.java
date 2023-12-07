package week_14.Question_14_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question_14_04 {
    public static void main(String[] args) {
        /*
        ListA--<>  12 51 736 92 10 57 207
        ListB--<>  34 99 154 33 923
         */

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create three ArrayLists to store integers
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();

        // Prompt the user to enter the size 'n' for ArrayList A
        System.out.print("Enter the size 'n' for ArrayList A: ");
        int n = input.nextInt();

        // Prompt the user to enter 'n' integers for ArrayList A
        System.out.print("Enter " + n + " integers for ArrayList A: ");
        for (int i = 0; i < n; i++) {
            listA.add(input.nextInt());
        }

        // Prompt the user to enter the size 'n2' for ArrayList B
        System.out.print("Enter the size 'n' for ArrayList B: ");
        int n2 = input.nextInt();

        // Prompt the user to enter 'n2' integers for ArrayList B
        System.out.print("Enter " + n2 + " integers for ArrayList B: ");
        for (int i = 0; i < n2; i++) {
            listB.add(input.nextInt());
        }

        // Sort ArrayList A and B
        Collections.sort(listA);
        Collections.sort(listB);

        // Reverse ArrayList B
        Collections.reverse(listB);

        // Merge and sort ArrayLists A and B into ArrayList C
        merge(listA, listB, listC);

        // Print the merged and sorted ArrayList C
        System.out.println("Merged and sorted ArrayList C: " + listC);
    }

    // Merge two sorted lists into a third list
    public static void merge(List<Integer> listA, List<Integer> listB, List<Integer> listC) {
        for (int i = 0; i < listA.size() + listB.size(); i++) {
            if (i < listA.size()) {
                listC.add(listA.get(i));
            } else {
                listC.add(listB.get(i - listA.size()));
            }
        }
    }
}

