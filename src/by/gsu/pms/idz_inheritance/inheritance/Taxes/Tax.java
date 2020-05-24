package by.gsu.pms.idz_inheritance.inheritance.Taxes;

import static java.lang.String.valueOf;

class Tax {

    private double income;
    public boolean paid;


    public double getSumWithoutTax() {
        return income*0.87;
    }

    public void setPaid(boolean is_paid) {
        paid=is_paid;
    }

    public String toString() {

        return ("income "+valueOf(income)+"paid - "+valueOf(paid));
    }


    public double getSumWithTax(double totalSum) {
        return totalSum;
    }
}
