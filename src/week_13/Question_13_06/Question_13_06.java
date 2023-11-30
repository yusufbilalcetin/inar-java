package week_13.Question_13_06;

public class Question_13_06 {
    public static void main(String[] args) {
        ComparableCircle cc1 = new ComparableCircle("blue", true, 16.5);
        ComparableCircle cc2 = new ComparableCircle("purple", true, 16.5);

        System.out.println("\nComparableCircle1:\n" + cc1);
        System.out.println("\nComparableCircle2:\n" + cc2);


        System.out.println((cc1.compareTo(cc2) == 1 ? "\nComparableCircle1 " : "\nComparableCircle2 ") +
                "is the larger of the two circles");
    }
}
