package company;

public class Test {
    public static void main(String[] args) {
        // Creating a SoleTrader instance
        SoleTrader trader = new SoleTrader("My Company", "01-01-2020", "BG1234567890", "Ivan Ivanov", 10000, 15000);

        // Displaying profit
        System.out.println("Profit as of today: " + trader.calculateProfit());

        // Issuing an invoice
        trader.issueInvoice();

        // Example with an invalid Bulstat
        trader.setBulstat("12345");
    }
}
