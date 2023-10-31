package week_09.live_class;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        // array
        // 10 eleman
        //random (50-100) arası
        // bu display
        //sort yapılacak
        //kücükten büyüge
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) + 50;
        }
        int enBuyukDeger = enBuyukDegerBulmaMethodu(array);
        System.out.println(enBuyukDeger);
        display(array);
        int enKucukDeger = enKucukDegerBulmaMethodu(array);
        System.out.println(enKucukDeger);
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int enBuyukDegerBulmaMethodu(int[] array) {
        int suanaKadarBuldugumEnBuyukDeger = array[0];
        for (int i = 0; i < array.length; i++) {
            if (suanaKadarBuldugumEnBuyukDeger < array[i]) {
                suanaKadarBuldugumEnBuyukDeger = array[i];
            }
        }
        return suanaKadarBuldugumEnBuyukDeger;
    }

    public static int enKucukDegerBulmaMethodu(int[] array) {
        int suanaKadarEnKucukSayı = array[0];
        for (int i = 0; i < array.length; i++) {
            if (suanaKadarEnKucukSayı > array[i]) {
                suanaKadarEnKucukSayı = array[i];
            }
        }
        return suanaKadarEnKucukSayı;
    }
}
