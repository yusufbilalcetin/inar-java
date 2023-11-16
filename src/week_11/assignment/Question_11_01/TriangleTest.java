package week_11.assignment.Question_11_01;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.nextLine();
        System.out.print("Enter a Color: ");
        String color = input.nextLine();
        System.out.print("Is the triangle filled (true / false)? ");
        String value = input.nextLine();
        boolean isFilled = Boolean.parseBoolean(value);

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.IsFilled(isFilled);

        System.out.println("Triangle: side1 = " + triangle.getSide1() + " side2 = " + triangle.getSide2() + " side3 = " + triangle.getSide3() +
                "\narea: " + triangle.getArea() +
                "\nPerimeter: " + triangle.getPerimeter() +
                "\ncolor: " + triangle.getColor() + "\nTriangle ");
        System.out.print((triangle.IsFilled()) ? " is empty." : " is filled.");

    }
}
