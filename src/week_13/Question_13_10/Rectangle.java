package week_13.Question_13_10;

import week_13.Question_13_09.Circle;

public class Rectangle extends GeometricObject implements Comparable<GeometricObject> {
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
    public int compareTo(Circle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        return this.compareTo((Rectangle) o) == 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + this.width + "\nHeight: " + this.height +
                "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }
}
