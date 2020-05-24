package by.gsu.pms.idz_3_serialization.serialization;


import by.gsu.pms.idz_3_serialization.butter_package.Butter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static java.lang.String.valueOf;

public class Serialisation {


    public void serialise(Butter[] butterList) {
        ObjectOutputStream oos = null;
        try {
            System.out.println("serialized");
            oos = new ObjectOutputStream(new FileOutputStream("W:\\java labs\\buttermilk_Jesus.dat"));
            oos.writeObject(butterList);
            oos.close();
        } catch (IOException e) {
            System.out.println(valueOf(e));
        }


    }


}
