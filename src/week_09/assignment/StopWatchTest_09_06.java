package week_09.assignment;

import java.util.Date;

import static week_07.assignment.Question_07_16.selectionSort;

public class StopWatchTest_09_06 {
    private long startTime;
    private long endTime;

    public StopWatch_09_06() {
        startTime = new Date().getTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = new Date().getTime();
    }

    public void stop() {
        endTime = new Date().getTime();
    }

    public long getElapsedTime() {
        return (endTime - startTime);
    }
}