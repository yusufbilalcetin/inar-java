package week_10.assignment;

public class MyPointTest_10_04 {
    public static void main(String[] args) {
        MyPoint_10_04 myPoint1 = new MyPoint_10_04(0.0, 0.0);
        MyPoint_10_04 myPoint2 = new MyPoint_10_04(10, 30.5);

        System.out.printf("The distance between (%.1f, %.1f) and (%.1f , %.1f) is : %.14f ", myPoint1.getX(), myPoint1.getY(),
                myPoint2.getX(), myPoint2.getY(), myPoint1.distance(myPoint2));
    }
}
