package week_13.Question_13_12;

import week_13.Question_13_09.Circle;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }


    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + this.width + "\nHeight: " + this.height +
                "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }
}
