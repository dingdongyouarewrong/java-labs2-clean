package by.gsu.pms.practice3_strings;


import by.gsu.pms.practice3_strings.file_work.Trip;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader file = new FileReader("\\file_work\\in.txt");
        Scanner scanner = new Scanner(file);

        double rate = Double.parseDouble(scanner.nextLine().split("=")[1]);
        int[] indices = Arrays.stream(scanner
                .nextLine()
                .split("=")[1]
                .split(";"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Trip[] Trips = new Trip[indices.length];

        for (int i=0; i < indices.length; i++){
            String account = scanner.nextLine().split("=")[1];
            int transport_expenses = Integer.parseInt(scanner.nextLine().split("=")[1]);
            int days_quantity = Integer.parseInt(scanner.nextLine().split("=")[1]);

            Trips[i] = new Trip(account, transport_expenses, days_quantity);
        }

        Arrays.sort(Trips, Comparator.comparing(Trip::get_total).reversed());

        for(Trip Trip: Trips){
            Trip.show();
        }



    }
}