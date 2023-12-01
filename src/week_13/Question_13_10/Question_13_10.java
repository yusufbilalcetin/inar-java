package week_13.Question_13_10;

public class Question_13_10 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("blue", true, 3, 5);
        Rectangle r2 = new Rectangle("red", false, 3, 5);
        Rectangle r3 = new Rectangle("blue", true, 6, 4);

        System.out.println("Rectange1 radius :" + r1.getArea());
        System.out.println("Rectange2 radius :" + r2.getArea());
        System.out.println("Rectange3 radius :" + r3.getArea());

        System.out.println("Rectange1 is" + (r1.equals(r2) ? "" : " not") + " equal to Rectangle2");
        System.out.println("Rectangle1 is" + (r1.equals(r3) ? "" : " not") + " equal to Rectangle3");

    }
}
