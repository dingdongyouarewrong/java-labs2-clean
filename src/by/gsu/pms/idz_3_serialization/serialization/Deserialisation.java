package by.gsu.pms.idz_3_serialization.serialization;



import by.gsu.pms.idz_3_serialization.butter_package.Butter;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialisation {

    public Butter[] deserialise() {
        Butter[] butter = null;
        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("W:\\java labs\\buttermilk_Jesus.dat"))
        )
        {
            butter=(Butter[])ois.readObject();
//            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return butter;
    }



}
