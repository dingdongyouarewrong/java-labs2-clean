package by.gsu.pms.practice3.practice3_2.utils;


public class PurchaseTransport extends AbstractPurchase implements ShowInfo {

    private double transportExpenses;

    public PurchaseTransport(Commodity commodity, int countOfPurchasedUnits, double transportExpenses) {
        super(commodity, countOfPurchasedUnits);
        this.transportExpenses = transportExpenses;
    }

    public double getTransportExpenses() {
        return transportExpenses;
    }

    public void setTransportExpenses(double transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    @Override
    public double getCost() {
        return getCommodity().getPrice() * getCountOfPurchasedUnits() + transportExpenses;
    }
}
