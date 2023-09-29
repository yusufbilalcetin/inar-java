package week_07.live_class;

public class FindingTheSmallestIndexOfTheLargestElement {
    public static void main(String[] args) {
        int[] myList = {1, 5, 3, 4, 5, 5};

        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);
    }
}
