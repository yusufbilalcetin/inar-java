package week_13.Question_13_07;

import week_13.Question_13_06.GeometricObject;

public class Question_13_07 {
    public static void main(String[] args) {
        GeometricObject square = new Square("Black", true, 32);

        ((Square) square).howToColor();
    }
}
