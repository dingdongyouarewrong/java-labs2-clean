package by.gsu.pms.idz_3_serialization;

import by.gsu.pms.idz_3_serialization.butter_package.Butter;
import by.gsu.pms.idz_3_serialization.serialization.Deserialisation;
import by.gsu.pms.idz_3_serialization.serialization.Serialisation;

import static java.lang.String.valueOf;


public class Runner {

    public static void main(String[] args) {
        Butter[] butterList = new Butter[3];

        butterList[0] = new Butter("Russian", 70, 5);
        butterList[1] = new Butter("Ukrainian", 60, 6);
        butterList[2] = new Butter("Machine", 80, 0);


        Serialisation ser = new Serialisation();
        ser.serialise(butterList);
        Deserialisation deser = new Deserialisation();
        Butter[] brandNewButterList = deser.deserialise();

        for (Butter butter : brandNewButterList) {
            System.out.println(butter);
        }

        int quantityOfButterWithAdditives = 0;

        for (Butter butter:brandNewButterList) {
            if (butter != null) {
                if (butter.getAmountOfAdditives()>0) {
                    quantityOfButterWithAdditives+=1;
                }
            }
        }
        System.out.println("Quantity of butter with additivies is "+valueOf(quantityOfButterWithAdditives));


    }

}