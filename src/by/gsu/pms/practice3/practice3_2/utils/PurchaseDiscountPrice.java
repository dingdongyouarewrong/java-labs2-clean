package by.gsu.pms.practice3.practice3_2.utils;

public class PurchaseDiscountPrice extends AbstractPurchase implements ShowInfo {

    private double discount;

    public PurchaseDiscountPrice(Commodity commodity, int countOfPurchasedUnits, double discount) {
        super(commodity, countOfPurchasedUnits);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getCost() {
        return (getCommodity().getPrice() - discount) * getCountOfPurchasedUnits();
    }
}