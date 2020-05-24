package by.gsu.pms.idz_inheritance.inheritance.Taxes;

public class Allowance {

    public int allowance_rate;
    private boolean paid;

    public Allowance(int allowance_rate, boolean paid) {
        this.allowance_rate = allowance_rate;
        this.paid = paid;
    }

    public Allowance(int allowance_rate) {
        this.allowance_rate = allowance_rate;
    }


    public Allowance() {

    }


    public double getAllowance() {
        return allowance_rate;
    }


    public void setPaid(boolean is_paid) {
        paid=is_paid;
    }


}
