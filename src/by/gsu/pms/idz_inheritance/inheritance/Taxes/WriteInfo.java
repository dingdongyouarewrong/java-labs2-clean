package by.gsu.pms.idz_inheritance.inheritance.Taxes;

import static java.lang.String.valueOf;

public class WriteInfo {
    WriteInfo() {
    }
    public void info(double[] taxes) {
         System.out.println("there is "+valueOf(taxes.length)+" taxes");
    }

}
