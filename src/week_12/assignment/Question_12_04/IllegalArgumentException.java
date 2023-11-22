package week_12.assignment.Question_12_04;

public class IllegalArgumentException {
    public static void main(String[] args) {
        try {
            LoanWithException loan = new LoanWithException(3.5, 5, 0);
        } catch (java.lang.IllegalArgumentException ex) {
            System.out.println("Wrong input! Please greater than 0 (zero)");
        }
    }
}
