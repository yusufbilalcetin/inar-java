package week_07.live_class;

public class RandomShuffling {
    public static void main(String[] args) {
        int[] myList = new int[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i] += i;
        }

        for (int i = 0; i < myList.length - 1; i++) {
            int j = (int) (Math.random() * (i + 1));
            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
        System.out.println();
    }
}
