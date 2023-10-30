package week_09.assignment;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();

        System.out.println("--Reactangle 1--");
        System.out.println("width        :" + rectangle1.width);
        System.out.println("Height       :" + rectangle1.height);
        System.out.println("Area         :" + rectangle1.getArea());
        System.out.println("Perimeter    :" + rectangle1.getPerimeter());
        System.out.println();
        System.out.println("--Reactangle 2--");

        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("width        :" + rectangle2.width);
        System.out.println("Height       :" + rectangle2.height);
        System.out.println("Area         :" + rectangle2.getArea());
        System.out.println("Perimeter    :" + rectangle2.getPerimeter());

    }
}
