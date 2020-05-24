package by.gsu.pms.idz_inheritance.inheritance.Taxes;

public class RemittanceTax extends Tax  {

    private double REMITTANCE_TAX = 0.01;

    public RemittanceTax(double totalSum, boolean paid) {
        this.totalSum = totalSum;
        this.paid = paid;
    }

    public RemittanceTax(double totalSum) {
        this.totalSum = totalSum;
    }

    public RemittanceTax() {

    }



    private double totalSum;
    public boolean paid;


    public double getRemittanceTax() {
        return totalSum*REMITTANCE_TAX;
    }

    public void setPaid(boolean is_paid) {
        paid=is_paid;
    }





}
