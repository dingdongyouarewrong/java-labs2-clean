package by.gsu.pms.idz_inheritance.interfaces.Taxes;

public class RoyaltyTax implements Tax {

    private double royaltyTax = 0.01;

    public RoyaltyTax(double totalSum, boolean paid) {
        this.totalSum = totalSum;
        this.paid = paid;
    }

    public RoyaltyTax(double totalSum) {
        this.totalSum = totalSum;
    }

    public RoyaltyTax() {

    }

    private double totalSum;
    public boolean paid;


    public double getTax() {
        return totalSum* royaltyTax;
    }

    public void setPaid(boolean is_paid) {
        paid=is_paid;
    }
}
