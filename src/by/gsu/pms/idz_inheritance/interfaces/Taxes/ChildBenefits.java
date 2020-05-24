package by.gsu.pms.idz_inheritance.interfaces.Taxes;

public class ChildBenefits {

    public double oneChildBenefits = 0.01;
    private int amountOfChildrens;

    public ChildBenefits(int amountOfChildrens) {
        this.amountOfChildrens = amountOfChildrens;
    }

    public double getFullBenefits() {
        return  (amountOfChildrens * oneChildBenefits);
    }

    public double getSumWithBenefits(double sum) {
        return sum*(1-getFullBenefits());
    }

}
