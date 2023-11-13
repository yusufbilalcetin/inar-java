package week_10.assignment;


import java.awt.geom.Line2D;

public class MyReactangle2D_10_13 {
    private double x;
    private double y;
    private double width;
    private double height;


    public MyReactangle2D_10_13() {
        this(0, 0, 1, 1);
    }

    public MyReactangle2D_10_13(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    public boolean contains(double x, double y) {
        if (this.getX() - (width / 2) < x && x < this.getY() + (width / 2) &&
                (this.getY() - (height / 2) < y && y < this.getY() + (height / 2))) {
            return true;
        }
        return false;
    }

    public boolean contains(MyReactangle2D_10_13 r) {
        if (contains(r.getX() + r.getWidth() / 2, r.getY() + r.getHeight() / 2) &&
                contains(r.getX() - r.getWidth() / 2, r.getY() + r.getHeight() / 2) &&
                contains(r.getX() + r.getWidth() / 2, r.getY() - r.getHeight() / 2) &&
                contains(r.getX() - r.getWidth() / 2, r.getY() - r.getHeight() / 2)) {
            return true;
        }
        return false;
    }

    public boolean overlaps(MyReactangle2D_10_13 r) {
        if ((r.getLeftX() <= this.getRightX() && r.getRightX() > this.getRightX()) ||
                (r.getRightX() >= this.getLeftX() && r.getLeftX() < this.getLeftX()) ||
                (r.getBottomY() <= this.getRightX() && r.getRightX() > this.getRightX()) ||
                (r.getRightX() >= this.getBottomY() && r.getBottomY() < this.getBottomY())) {
            return true;
        }
        return false;
    }

    private double getLeftX() {
        return this.getX() - (this.getWidth() / 2);
    }

    private double getRightX() {
        return this.getX() + (this.getWidth() / 2);
    }

    private double getBottomY() {
        return this.getY() - (this.getHeight() / 2);
    }

    private double getTopY() {
        return this.getY() + (this.getHeight() / 2);
    }

    public String toString() {
        return "Rectangle's center (" + this.getX() + ", " + this.getY() + ") width -> "
                + getWidth() + " height -> " + getHeight();
    }

}

