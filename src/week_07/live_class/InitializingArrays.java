package week_07.live_class;

public class InitializingArrays {
    public static void main(String[] args) {
        int[] myList = new int[100];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int)(Math.random() * 100);
        }
        System.out.println();
    }
}
