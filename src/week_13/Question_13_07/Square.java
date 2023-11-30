package week_13.Question_13_07;

import week_13.Question_13_06.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {

    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + this.side;
    }
}
