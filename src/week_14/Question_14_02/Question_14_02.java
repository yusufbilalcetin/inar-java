package week_14.Question_14_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question_14_02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("Generated ArrayList:\n " + list);

        Set<Integer> set = new TreeSet<>(list);
        list = new ArrayList<>(set);

        System.out.println("ArrayList after removing duplicates:\n " + list);
    }
}
