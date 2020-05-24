package by.gsu.pms.practice3.practice3_1.Purchase_Classes;

public class DiscountRequirements extends Purchase {

    public DiscountRequirements(String name, double price, int count, float discount, int required_count) {
        super(name, price, count);
        this.required_count = required_count;
        this.discount = discount;
    }

    public int getRequired_count() {
        return required_count;
    }

    public void setRequired_count(int required_count) {
        this.required_count = required_count;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    private int required_count;
    private float discount ;

    @Override
    public double getCost() {
        if (getCount() > required_count){
            return super.getCost() * discount;
        } else {
            return super.getCost();
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", required_count=" + required_count +
                ", discount=" + discount;
    }






}
