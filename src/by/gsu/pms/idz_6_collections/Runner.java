package by.gsu.pms.idz_6_collections;


import by.gsu.pms.idz_6_collections.Airline_package.Airline;
import by.gsu.pms.idz_6_collections.Airline_package.Weekday;
import by.gsu.pms.idz_6_collections.Serialisation.Deserialization;
import by.gsu.pms.idz_6_collections.Serialisation.Serialization;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static java.lang.String.valueOf;

public class Runner {

    public static void main(String[] args) {
        Airline airline_clean = new Airline();
        ArrayList<Airline> airlines = new ArrayList<>();
        airlines.add(new Airline("Paris", 123, 1,
                new Date(System.currentTimeMillis()), Weekday.MON));
        airlines.add(new Airline("New-York", 254, 1,
                new Date(2020, 4, 28, 20, 11), Weekday.TUE));
        airlines.add(new Airline("Tokyo", 287, 3,
                new Date(2020, 4, 29, 10, 11), Weekday.WED));
        airlines.add(new Airline("London", 462, 1,
                new Date(2020, 4, 30, 15, 11), Weekday.THU));
        airlines.add(new Airline("Paris", 209, 2,
                new Date(2020, 5, 1, 0, 11), Weekday.FRI));

        Serialization serialization = new Serialization();
        serialization.serialize(airlines);


        Deserialization deserialization = new Deserialization();
        ArrayList<Airline> loaded = deserialization.deserialize();
        loaded.sort(new AirlanesNameSorter());
        Date time_to_compare = new Date(System.currentTimeMillis());
        System.out.println(airline_clean.get_airline_by_destination_point(loaded, "Tokyo"));
        System.out.println(airline_clean.get_airline_by_time_and_day(loaded, Weekday.FRI, time_to_compare));
        System.out.println(airline_clean.get_airline_by_day(loaded, Weekday.FRI));
        System.out.println(airline_clean.get_airline_by_destination_point(loaded, "Paris"));
        System.out.println(loaded);
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter( "out.txt", true));
            for (Airline airline:loaded) {
                writer.write(airline.toString()+"\n");
            }
            writer.close();

        }
        catch ( IOException e)
        {
            System.out.println(valueOf(e));
        }
    }
}


