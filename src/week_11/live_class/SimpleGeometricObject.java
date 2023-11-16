package week_11.live_class;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public SimpleGeometricObject() {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean IsFilled(boolean isFilled) {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "created on " +
                dateCreated +
                "\ncolor" + color +
                " and filled: " + filled;
    }

    public boolean IsFilled() {
        return filled;
    }
}
