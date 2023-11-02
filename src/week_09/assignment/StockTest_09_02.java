package week_09.assignment;

public class StockTest_09_02 {
    public static void main(String[] args) {

        Stock_09_02 stocked1 = new Stock_09_02("ORCL", "Oracle Corporation", 34.5, 34.35);

        System.out.println("Stock name       : " + stocked1.getName());
        System.out.println("Stock symbol     : " + stocked1.getSymbol());
        System.out.println("Price-change percentage: " + stocked1.getChangePercent());
    }
}
