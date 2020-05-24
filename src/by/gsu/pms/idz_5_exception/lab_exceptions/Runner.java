package by.gsu.pms.idz_5_exception.lab_exceptions;


import by.gsu.pms.idz_5_exception.lab_exceptions.Butter_package.Butter;
import by.gsu.pms.idz_5_exception.lab_exceptions.Exceptions.EmptyErrayException;
import by.gsu.pms.idz_5_exception.lab_exceptions.Exceptions.MyArithmeticException;
import by.gsu.pms.idz_5_exception.lab_exceptions.Serialisation.Deserialisation;
import by.gsu.pms.idz_5_exception.lab_exceptions.Serialisation.Serialisation;

import static java.lang.String.valueOf;


public class Runner {

    public static void main(String[] args) {
        Butter[] butterList = new Butter[3];

        butterList[0] = new Butter("Russian", 70, 5);
        butterList[1] = new Butter("Ukrainian", 60, 6);
        butterList[2] = new Butter("Machine", 80, 0);


        Serialisation ser = new Serialisation();
        try {
            ser.serialise(butterList);
        } catch (EmptyErrayException e ){
            System.out.println("We're out of memory");
        }
        Deserialisation deser = new Deserialisation();
        Butter[] brandNewButterList = null;
        try {
            brandNewButterList = deser.deserialise();
        } catch (MyArithmeticException e) {
            System.out.println(valueOf(e));
        }


        for (Butter butter : brandNewButterList) {
            System.out.println(butter);
        }

        int quantityOfButterWithAdditives = 0;

        for (Butter butter : brandNewButterList) {
            if (butter != null) {
                if (butter.getAmountOfAdditives() > 0) {
                    try {
                        quantityOfButterWithAdditives += 1;

                    } catch (MyArithmeticException e) {
                        System.out.println("There is an error with our math");
                        System.out.println("Check it out: " + valueOf(e));
                        quantityOfButterWithAdditives += 1;

                    }
                }
            }
        }
        System.out.println("Quantity of butter with additivies is " + valueOf(quantityOfButterWithAdditives));


    }

}