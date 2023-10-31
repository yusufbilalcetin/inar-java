package week_09.assignment;

public class RectangleTest_09_01 {
    public static void main(String[] args) {
        Rectangle_09_01 rectangle1 = new Rectangle_09_01();

        System.out.println("--Reactangle 1--");
        System.out.println("width        :" + rectangle1.width);
        System.out.println("Height       :" + rectangle1.height);
        System.out.println("Area         :" + rectangle1.getArea());
        System.out.println("Perimeter    :" + rectangle1.getPerimeter());
        System.out.println();
        System.out.println("--Reactangle 2--");

        Rectangle_09_01 rectangle2 = new Rectangle_09_01(3.5,35.9);
        System.out.println("width        :" + rectangle2.width);
        System.out.println("Height       :" + rectangle2.height);
        System.out.println("Area         :" + rectangle2.getArea());
        System.out.println("Perimeter    :" + rectangle2.getPerimeter());

    }
}
