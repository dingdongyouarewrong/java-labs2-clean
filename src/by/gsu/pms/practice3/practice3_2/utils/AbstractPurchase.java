package by.gsu.pms.practice3.practice3_2.utils;

public abstract class AbstractPurchase {

    private Commodity commodity;
    private int countOfPurchasedUnits;

    public AbstractPurchase() {
        this.commodity = new Commodity();
        this.countOfPurchasedUnits = 0;
    }

    public AbstractPurchase(Commodity commodity, int countOfPurchasedUnits) {
        this.commodity = commodity;
        this.countOfPurchasedUnits = countOfPurchasedUnits;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getCountOfPurchasedUnits() {
        return countOfPurchasedUnits;
    }

    public void setCountOfPurchasedUnits(int countOfPurchasedUnits) {
        this.countOfPurchasedUnits = countOfPurchasedUnits;
    }

    public abstract double getCost();

    public String toString(){
        return commodity.toString() + ";" + countOfPurchasedUnits + ";" + getCost();
    }

    public boolean CompareTo(AbstractPurchase purchase){
        return getCost() > purchase.getCost();
    }
}