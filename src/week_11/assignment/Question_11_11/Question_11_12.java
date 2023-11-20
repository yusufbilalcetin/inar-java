package week_11.assignment.Question_11_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        //34 21 6 3 5 0
        ArrayList<Integer> number = getListFromUser();
        System.out.println("Before sorting..");
        printList(number);
        sort(number);
        System.out.println("After sorting..");
        printList(number);
    }

    public static ArrayList<Integer> getListFromUser() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        System.out.print("Enter a list of integers ending with 0: ");
        int value;
        do {
            value = input.nextInt();
            if (value != 0) {
                result.add(value);
            }
        } while (value != 0);
        return result;
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }
}
