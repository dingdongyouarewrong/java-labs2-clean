package idz_6_collections.Airline_package;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Airline implements Serializable {

    public Airline() {
    }

    public String getDestination_point() {
        return destination_point;
    }

    private String destination_point;
    private int flight_number;
    private int airplane_type;
    private Date departure_time;
    private Weekday weekday;

    public Airline(String destination_point, int flight_number, int airplane_type, Date departure_time, Weekday weekday) {
        this.destination_point = destination_point;
        this.flight_number = flight_number;
        this.airplane_type = airplane_type;
        this.departure_time = departure_time;
        this.weekday = weekday;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination_point='" + destination_point + '\'' +
                ", flight_number=" + flight_number +
                ", airplane_type=" + airplane_type +
                ", departure_time=" + departure_time +
                ", weekday=" + weekday +
                '}';
    }


    public ArrayList<Airline> get_airline_by_day(ArrayList<Airline> airlines, Weekday current_weekday) {

        ArrayList<Airline> airlines_by_day = new ArrayList<>();
        for (Airline airline:airlines) {
            if (airline.weekday==current_weekday) {
                airlines_by_day.add(airline);
            }
        }
        return airlines_by_day;
    }

    public ArrayList<Airline> get_airline_by_destination_point(ArrayList<Airline> airlines, String current_destination_point) {

        ArrayList<Airline> airlines_by_destination_point = new ArrayList<>();
        for (Airline airline:airlines) {
            if (airline.destination_point.equals(current_destination_point)) {
                airlines_by_destination_point.add(airline);
            }
        }
        return airlines_by_destination_point;
    }

    public ArrayList<Airline> get_airline_by_time_and_day(ArrayList<Airline> airlines, Weekday current_weekday, Date current_departure_time) {

        ArrayList<Airline> airline_by_time_and_day = new ArrayList<>();
        for (Airline airline:airlines) {
            if (airline.weekday==current_weekday &&
                    airline.departure_time.compareTo(current_departure_time)>0 ) {

                airline_by_time_and_day.add(airline);

            }
        }
        return airline_by_time_and_day;
    }

}
