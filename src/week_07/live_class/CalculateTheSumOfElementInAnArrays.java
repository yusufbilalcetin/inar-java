package week_07.live_class;

public class CalculateTheSumOfElementInAnArrays {
    public static void main(String[] args) {
        int[] myList = new int[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i] += i;
        }
        int total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println(total);
    }
}
