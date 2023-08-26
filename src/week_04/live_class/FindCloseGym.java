package week_04.live_class;

import java.util.Scanner;

public class FindCloseGym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min, mid, max;

        System.out.print("Please enter the 3 locations of neighborhood gyms:");
        int gym1 = input.nextInt();
        int gym2 = input.nextInt();
        int gym3 = input.nextInt();


        int distanceGym1 = Math.abs(gym1);
        int distanceGym2 = Math.abs(gym2);
        int distanceGym3 = Math.abs(gym3);

        int tempMin = Math.min(gym1, gym2);
        min = Math.min(tempMin, gym2);

        if (min == distanceGym1) {
            System.out.printf("the closest gym is gym1  with %d\n", gym1);
        } else if (min == distanceGym2) {
            System.out.printf("the closest gym is gym2  with %d\n", gym2);
        } else {
            System.out.printf("the closest gym is gym3  with %d\n", gym3);
        }
    }
}
