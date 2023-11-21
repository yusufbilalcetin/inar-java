package week_12.live_class;

import java.io.FileNotFoundException;

public class TestCircleWithCustomException {
    public static void main(String[] args) throws FileNotFoundException {

        CircleWithException circle = new CircleWithException(5);
        try {
            circle.setRadius(-5);
        }
        catch (IllegalArgumentException e){
            System.out.println("Hello");

        }






    }




    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Access denied - You must be at least 18 years old.");
        }
        System.out.println("Access granted - You are old enough.");
    }
}
