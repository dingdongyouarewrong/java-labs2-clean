package idz_6_collections;

import idz_6_collections.Airline_package.Airline;

import java.util.Comparator;

public class AirlanesNameSorter implements Comparator<Airline> {

    @Override
    public int compare(Airline o1, Airline o2) {
        return o2.getDestination_point().compareToIgnoreCase(o1.getDestination_point());
    }
}
