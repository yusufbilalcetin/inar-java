package week_09.live_class;

public class Example_02 {
    public static void main(String[] args) {
        int[] array = new int[10];
        display(array);
        method(array);

        display(array);
    }

    public static void method(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 25) + 50;
        }
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
