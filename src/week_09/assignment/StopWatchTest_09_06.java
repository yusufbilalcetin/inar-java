package week_09.assignment;

import static week_07.assignment.Question_07_16.selectionSort;

public class StopWatchTest_09_06 {
    public static void main(String[] args) {
        StopWatch_09_06 stopWatch = new StopWatch_09_06();

        int[] number = new int[100_000];
        for (int i = 0; i <number.length ; i++) {
            number[i] = (int) (Math.random() * 100_000);
        }
        stopWatch.start();
        selectionSort(number);
        stopWatch.stop();

        System.out.println("The execution of sorting  100,000 numbers using selection sort :" + stopWatch.getElapsedTime() + " milliseconds");
    }
}
