package week_11.assignment.Question_11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getListFromUser();
        displaySum(list);
    }

    private static ArrayList<Integer> getListFromUser() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter ten integers:");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            list.add(number);
        }
        input.close();
        return list;
    }

    public static void displaySum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("Sum of the list: " + sum);
    }
}
