package by.gsu.pms.idz_inheritance.interfaces.Taxes;

public class GiftTax implements Tax {


    private double totalSum;
    private boolean paid;

    public GiftTax(double totalSum) {
        this.totalSum = totalSum;

    }

    public GiftTax(boolean paid) {
        this.paid = paid;
    }



    public double getTax() {
        double giftTax = 0.015;
        return totalSum* giftTax;
    }

    public void setPaid(boolean is_paid) {
        paid=is_paid;
    }


}
