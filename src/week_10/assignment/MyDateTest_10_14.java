package week_10.assignment;

public class MyDateTest_10_14 {
    public static void main(String[] args) {
        MyDate_10_14 date1 = new MyDate_10_14();
        MyDate_10_14 date2 = new MyDate_10_14(34355555133101L);

        System.out.println("Date1: " + date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear());

        System.out.println("Date2: " + date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear());
    }
}

