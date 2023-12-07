package week_14.Question_14_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        //0 23 0 3234 2 46 93 0 20 0 02 59 -1
        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter integers for ArrayList nums (enter -1 to stop): ");
        int num;
        do {
            num = input.nextInt();
            if (num != -1) {
                list.add(num);
            }
        }
        while (num != -1);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
                list.add(0);
            }
        }
    }
}
