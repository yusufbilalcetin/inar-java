package week_02.live_class;

public class InterviewQuestion {
    public static void main(String[] args) {
        //We swap the values of x and y
        int x = 5;
        int y = 7;

        x = y - x;
        y = y - x;

        x = y + x;

        System.out.println("x of value is " + x );
        System.out.println("y of value is " + y );



    }
}
