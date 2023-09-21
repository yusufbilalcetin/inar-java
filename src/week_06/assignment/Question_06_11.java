package week_06.assignment;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount     |     Comission      \n" + "---------------------------------------------------");
        for (double Amount = 10000; Amount <= 100000; Amount += 5000) {
            System.out.printf(" %-16.0f", Amount);
            System.out.printf("%13.1f\n", computeCommission(Amount));
        }
    }

    public static double computeCommission(double amount) {
        double balance = 0;
        double commission = 0;

        if (amount >= 10000.01) {
            balance += ((amount - 10000) * 0.12);
            commission += balance;
        }
        if (amount >= 5000.01) {
            balance -= (balance - 5000) * 0.10;
            commission += balance;

        }

        if (amount >= 0.01) {
            commission += balance * 0.08;
        }
        return commission;
    }
}


