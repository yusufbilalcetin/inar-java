package week_07.live_class;

public class DisplayingArrays {
    public static void main(String[] args) {
        int[] myList = new int[100];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int)(Math.random() * 100);
        }


        for (int i = 1; i < myList.length; i++) {
            System.out.println(myList[i] + "");

        }
    }
}
