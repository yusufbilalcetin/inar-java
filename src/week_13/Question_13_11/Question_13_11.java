package week_13.Question_13_11;

public class Question_13_11 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octogon oct1 = new Octogon("Green", true, 5);
        System.out.println("Area: " + oct1.getArea());
        System.out.println("Perimeter: " + oct1.getPerimeter());

        System.out.println("Cloning the Octogon...");
        Octogon oct2 = (Octogon) oct1.clone();

        int result = (oct1.compareTo(oct2));
        if (result == 1) {
            System.out.println("Octogon is greater equal to its clone.");
        } else if (result == -1) {
            System.out.println("Octogon is less than its clone.");
        } else {
            System.out.println("Octogen is equal to its clone.");
        }
    }

}
