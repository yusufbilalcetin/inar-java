package week_11.assignment.Question_11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getListFromUser();
        removeDuplicate(list);
    }

    public static ArrayList<Integer> getListFromUser() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            list.add(number);
        }
        return list;
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> distincList = new ArrayList<>();
        for (Integer integer : list) {
            if (!distincList.contains(integer)) {
                distincList.add(integer);
            }
        }
        System.out.println("Distinct numbers are :" + distincList);
    }
}
