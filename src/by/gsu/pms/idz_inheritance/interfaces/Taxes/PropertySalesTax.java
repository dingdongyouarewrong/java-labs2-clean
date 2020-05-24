package by.gsu.pms.idz_inheritance.interfaces.Taxes;

public class PropertySalesTax implements Tax {


    private double propertCost;
    private boolean paid;

    public PropertySalesTax(double propertCost) {
        this.propertCost = propertCost;

    }

    public PropertySalesTax(boolean paid) {
        this.paid = paid;
    }



    public double getTax() {
        double giftTax = 0.015;
        return propertCost* giftTax;
    }

    public void setPaid(boolean is_paid) {
        paid=is_paid;
    }


}
