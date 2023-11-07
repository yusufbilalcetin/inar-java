package week_10.assignment;

public class TimeTest_10_01 {
    public static void main(String[] args) {
        Time_10_01 time1 = new Time_10_01();
        Time_10_01 time2 = new Time_10_01(555550000);
        System.out.printf("%d:%d:%d\n", time1.getHour(), time1.getMinute(), time1.getSecond());
        System.out.printf("%d:%d:%d", time2.getHour(), time2.getMinute(), time2.getSecond());
    }
}
