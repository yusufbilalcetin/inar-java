package week_13.Question_13_11;


public class Octogon extends GeometricObject implements Cloneable, Comparable<Octogon> {
    private double side;

    public Octogon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Octogon octogon = (Octogon) super.clone();
        return octogon;
    }


    @Override
    public int compareTo(Octogon o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return super.toString() + "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }


}
