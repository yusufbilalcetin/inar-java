package week_07.live_class;

public class FindingTheLargestElementInAnArray {
    public static void main(String[] args) {
        int[] myList = new int[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i] += i;
        }
        int max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
            System.out.println();
        }
    }
}
