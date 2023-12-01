package week_13.Question_13_11;

import week_13.Question_13_09.Circle;

import java.util.Date;

public abstract class GeometricObject {
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
    public String toString() {
        return "It is created on " + this.datecreated + "\nColor :" + this.color + "\nFilled :" + this.filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
