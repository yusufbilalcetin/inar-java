package week_07.live_class;

public class ShiftingElements {
    public static void main(String[] args) {

        int[] myList = new int[10];

        for (int i = 0; i < myList.length; i++) {
            myList[i] += i;
        }
        for (int i = 0; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }

        int temp = 0;
        myList[myList.length - 1] = temp;
        System.out.println(temp);
    }
}
