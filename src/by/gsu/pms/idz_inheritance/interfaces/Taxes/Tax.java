package by.gsu.pms.idz_inheritance.interfaces.Taxes;

public interface Tax {


    double tax = 0;



    default double getTax() {

        return tax;
    }
}
