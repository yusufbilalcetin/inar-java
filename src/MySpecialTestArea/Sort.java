package MySpecialTestArea;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(15);
        list.add(new BigInteger("123445142"));
        list.add(new BigDecimal("414.214"));
        list.add(new Float("123"));
        System.out.println(1 == new Integer("1"));
        System.out.println("Before sorting.." + list.toString());
        sort(list);
        System.out.println("After sorting.." + list.toString());
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            Number min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < min.doubleValue()) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }
            System.out.println(i + "-> " + list.toString());
        }
    }
}
