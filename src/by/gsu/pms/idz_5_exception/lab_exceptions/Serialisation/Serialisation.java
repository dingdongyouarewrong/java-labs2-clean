package by.gsu.pms.idz_5_exception.lab_exceptions.Serialisation;

import by.gsu.pms.idz_5_exception.lab_exceptions.Butter_package.Butter;
import by.gsu.pms.idz_5_exception.lab_exceptions.Exceptions.EmptyErrayException;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.NoSuchFileException;

import static java.lang.String.valueOf;

public class Serialisation {


    public void serialise(Butter[] butterList) throws EmptyErrayException {
        ObjectOutputStream oos = null;
        if (butterList.length==0) throw new EmptyErrayException("Wrong value. Array is empty");
        try {
            System.out.println("serialized");
            oos = new ObjectOutputStream(new FileOutputStream("W:\\java labs\\buttermilk_Jesus.dat"));
            oos.writeObject(butterList);
            oos.close();
        } catch (NoSuchFileException ex) {
            System.out.println("No file");
        } catch (IOException e) {
            System.out.println(valueOf(e));
        }


    }


}