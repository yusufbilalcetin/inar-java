package week_10.assignment;

public class TaxTest_10_08 {
    public static void main(String[] args) {
        System.out.println("2009 U.S Federal Personal Tax Rates          ");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n"
                , "Income", "Status 0", "Status 1", "Status 2", "Status 3");
        System.out.println("---------------------------------------------------");

        for (int income = 50_000; income <= 60_000; income += 1000) {
            System.out.printf("%-10d", income);
            for (int status = 0; status <= 3; status++) {
                Tax_10_08 tax = new Tax_10_08();
                tax.setTaxableIncome(income);
                tax.setFilingStatus(status);
                System.out.printf("%-10.2f", tax.getTax());
            }
            System.out.println();
        }
    }
}


