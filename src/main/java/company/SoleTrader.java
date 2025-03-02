package company;

public class SoleTrader extends Company implements InvoiceIssuable {
    private String ownerName;
    private double initialCapital;
    private double currentCapital;

    public SoleTrader(String name, String creationDate, String bulstat, String ownerName, double initialCapital, double currentCapital) {
        super(name, creationDate, bulstat);
        setOwnerName(ownerName);
        setInitialCapital(initialCapital);
        setCurrentCapital(currentCapital);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            System.out.println("The owner's name must be valid.");
        } else {
            this.ownerName = ownerName;
        }
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        if (initialCapital >= 0) {
            this.initialCapital = initialCapital;
        } else {
            System.out.println("Initial capital must be non-negative.");
        }
    }

    public double getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(double currentCapital) {
        if (currentCapital >= 0) {
            this.currentCapital = currentCapital;
        } else {
            System.out.println("Current capital must be non-negative.");
        }
    }

    public double calculateProfit() {
        return currentCapital - initialCapital;
    }

    @Override
    public void issueInvoice() {
        System.out.println("Invoice issued by company " + getName() + " with Bulstat: " + getBulstat());
    }
}
