package week_13.Question_13_05;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private boolean filled;
    private String color;
    private Date dateCreated;

    public GeometricObject(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.dateCreated = new Date();
    }

    public GeometricObject() {
        this("default", false);
        dateCreated = new Date();
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
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

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }

    @Override
    public String toString() {
        return "It is created on " + dateCreated + "\nColor: " + this.color + "\nisfilled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
