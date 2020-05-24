package by.gsu.pms.idz_inheritance.inheritance.Taxes;

public class IncomeTax extends Tax {

    private double incomeTax = 0.01;

    public IncomeTax(double totalIncome, boolean paid) {
        this.totalIncome = totalIncome;
        this.paid = paid;
    }

    public IncomeTax(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public IncomeTax() {

    }



    private double totalIncome;
    public boolean paid;


    public double getIncomeTax() {
        return totalIncome* incomeTax;
    }

    public void setPaid(boolean is_paid) {
        paid=is_paid;
    }
}
