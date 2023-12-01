package week_13.Question_13_10;

import week_13.Question_13_09.Circle;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    boolean filled;
    String color;
    Date datecreated;

    public GeometricObject(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.datecreated = datecreated;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static <o2> GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }

    @Override
    public String toString() {
        return "It is created on " + this.datecreated + "\nColor :" + this.color + "\nFilled :" + this.filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract int compareTo(Circle o);
}
