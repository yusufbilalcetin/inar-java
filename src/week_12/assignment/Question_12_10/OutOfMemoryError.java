package week_12.assignment.Question_12_10;

import java.util.ArrayList;

public class OutOfMemoryError {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int i = 1;
        boolean isEmpty = true;
        while (isEmpty) {
            try {
                String word = new String(i + "Yusuf");
                i++;
                list.add(word);
            } catch (java.lang.OutOfMemoryError ex) {
                System.out.println("outOfMemoryException occurs! : Java heap space");
                isEmpty = false;
            }
        }
    }
}
