package by.gsu.pms.idz_inheritance.interfaces.Taxes;

public class IncomeTax implements Tax {

    private double incomeTax = 0.01;

    public IncomeTax(double totalIncome, boolean paid) {
        this.totalIncome = totalIncome;
        this.paid = paid;
    }

    public IncomeTax(double totalIncome) {
        this.totalIncome = totalIncome;
    }



    private double totalIncome;
    public boolean paid;


    public double getTax() {
        return totalIncome* incomeTax;
    }

    public void setPaid(boolean is_paid) {
        paid=is_paid;
    }
}
