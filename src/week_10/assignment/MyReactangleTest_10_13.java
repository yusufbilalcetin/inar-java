package week_10.assignment;

public class MyReactangleTest_10_13 {
    public static void main(String[] args) {
        MyReactangle2D_10_13 r1 = new MyReactangle2D_10_13(2, 2, 5.5, 4.9);
        System.out.println("Rectangle:");
        System.out.println("-----------------------");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println((r1.contains(3, 3) ? "contains" : "does not contain") + " the point (3, 3).");

        System.out.println((r1.contains(new MyReactangle2D_10_13(4, 5, 10.5, 3.2)) ? "contains" :
                "does not contain") + " the rectangle with points (4, 5, 10.5, 3.2)");

        System.out.println((r1.overlaps(new MyReactangle2D_10_13(3, 5, 2.3, 5.4)) ? "overlaps" :
                "does not overlap") + " the rectangle with points (3, 5, 2.3, 5.4)");
    }
}
