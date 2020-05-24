package by.gsu.pms.idz_5_exception.lab_exceptions.Serialisation;


import by.gsu.pms.idz_5_exception.lab_exceptions.Butter_package.Butter;
import by.gsu.pms.idz_5_exception.lab_exceptions.Exceptions.MyArithmeticException;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialisation  {

    public Butter[] deserialise() throws MyArithmeticException {
        Butter[] butter = null;
        try(

                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("W:\\java labs\\buttermilk_Jesus.dat"))
        )
        {

            butter=(Butter[])ois.readObject();
//            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
            throw new ArithmeticException("jyg");

        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return butter;
    }



}