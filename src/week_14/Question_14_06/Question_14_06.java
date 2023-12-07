package week_14.Question_14_06;

import java.util.ArrayList;
import java.util.List;

public class Question_14_06 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }

        System.out.println("Orginal List: " + list);
        ArrangeList(list);
        System.out.println("Rearranged List: " + list);
    }

    public static void ArrangeList(List<Integer> list) {
        List<Integer> oddNums = new ArrayList<>();
        List<Integer> evenNums = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                oddNums.add(list.get(i));
            } else {
                evenNums.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(oddNums);
        list.addAll(evenNums);
    }
}
