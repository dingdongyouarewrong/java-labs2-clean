package by.gsu.pms.practice_collections.purchase_package;

public class PricePurchase extends Purchase {

    @Override
    public String toString() {
        return "PricePurchase{" +
                "discount=" + discount +
                '}';
    }

    private int discount;

    public PricePurchase(String name, int cost, int count, int discount) {
        super(name, cost, count);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }



    public int get_price(){
        return (getCost() - discount) * getCount();
    }

}