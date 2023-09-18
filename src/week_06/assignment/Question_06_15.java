package week_06.assignment;

public class Question_06_15 {
    public static void main(String[] args) {
        System.out.println("Taxable Income     Single     Married joint or Quealifying widow(er)     Married Separate     Head of a house"
                + "\n---------------------------------------------------------------------------------------------------------------");
        int status = 50_000;
        int taxableIncome = 60_000;
        computeTax(status, taxableIncome);
    }

    public static void computeTax(double status, double taxableIncome) {
        for (int i = 50_000; i <= 60_000; i += 50) {
            System.out.printf("%5d", status, taxableIncome);

        }
    }
}