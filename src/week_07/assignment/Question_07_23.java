package week_07.assignment;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                if ((j) % (i) == 0) {
                    lockers[j - 1] = !lockers[j - 1];
                }
            }
        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print("L" + (i + 2) + " ");
            }
        }
    }
}
