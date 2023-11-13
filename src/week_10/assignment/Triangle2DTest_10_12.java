package week_10.assignment;

public class Triangle2DTest_10_12 {
    public static void main(String[] args) {
        Triangle2D_10_12 t1 = new Triangle2D_10_12(new MyPoint_10_04(2.5, 2), new MyPoint_10_04(4.2, 3),
                new MyPoint_10_04(5, 3.5));

        System.out.println("Area : " + t1.getArea() +
                "\nPerimeter : " + t1.getPerimeter());
        System.out.println("t1 contains (3.3) ? : " + t1.contains(new MyPoint_10_04(3,3)));
        System.out.println("t1 contains (new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new \nMyPoint(1, 3.4))) ? : "
                +t1.contains(new Triangle2D_10_12(new
                MyPoint_10_04(2.9, 2), new MyPoint_10_04(4, 1), new MyPoint_10_04(1, 3.4))));

        System.out.println("t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2,\n6.5))) ? : "
                + t1.overlaps(new Triangle2D_10_12(new MyPoint_10_04(2, 5.5), new MyPoint_10_04(4,
                -3), new MyPoint_10_04(2, 6.5))));
    }
}
