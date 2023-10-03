package week_07.assignment;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        System.out.print("Enter ten numbers :");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }

        reverse(number);
        for (int e : number) {
            System.out.print(e + " ");
        }
    }

    public static int[] reverse(int[] list) {
        for (int i = 0, j = list.length - 1; i < j; i++, j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        return list;
    }
}

