package idz_6_collections.Serialisation;


import idz_6_collections.Airline_package.Airline;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import static java.lang.String.valueOf;

public class Serialization {


    public void serialize(ArrayList<Airline> airlinesList)  {
        ObjectOutputStream oos = null;
        try {
            System.out.println("serialized");
            oos = new ObjectOutputStream(new FileOutputStream("W:\\java labs\\buttermilk_Jesus.dat"));
            oos.writeObject(airlinesList);
            oos.close();
        } catch (IOException e) {
            System.out.println(valueOf(e));
        }


    }


}