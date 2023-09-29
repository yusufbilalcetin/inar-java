package week_07.live_class;

import java.util.Scanner;

public class ExampleProccesingArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int list = input.nextInt();
        int[] myList = new int[list];
        System.out.println("enter " + myList + " values");

        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextInt();
        }
        System.out.println();
    }
}
