package by.gsu.pms.practice3.practice3_1.Purchase_Classes;

public class Discount extends Purchase {
    private float discount; // percents

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Discount(String name, double price, int count, float discount) {
        super(name, price, count);
        this.discount = discount;
    }

    @Override
    public double getCost() {
        return super.getCost() * discount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", discount=" + discount;
    }
}
