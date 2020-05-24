package by.gsu.pms.idz_inheritance.interfaces.Taxes;

import static java.lang.String.valueOf;

public interface Tax {


    double tax = 0;



    default double getTax() {

        return tax;
    }
}
