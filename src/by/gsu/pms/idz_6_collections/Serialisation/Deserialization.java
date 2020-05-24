package by.gsu.pms.idz_6_collections.Serialisation;


import by.gsu.pms.idz_6_collections.Airline_package.Airline;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialization {

    public ArrayList<Airline> deserialize() {
        ArrayList<Airline> airlines = null;
        try(

                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("W:\\java labs\\buttermilk_Jesus.dat"))
        )
        {

            airlines=(ArrayList<Airline>)ois.readObject();

        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return airlines;
    }



}