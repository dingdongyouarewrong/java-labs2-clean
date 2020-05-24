package by.gsu.pms.practice_collections;

import by.gsu.pms.practice_collections.purchase_package.PricePurchase;
import by.gsu.pms.practice_collections.purchase_package.Purchase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Runner {
    public static void main(String[] args) throws IOException {

        ArrayList<Purchase> purchases = new ArrayList<Purchase>();

        BufferedReader csvReader = new BufferedReader(new FileReader("W:\\учеба\\java_labs2\\src\\by\\gsu\\pms\\practice_collections\\in.csv"));
        boolean first_line = true;
        String row;
        while ((row = csvReader.readLine()) != null) {
            if (first_line) {
                first_line=false;
                continue;
            }

            String[] params = row.split(";");
            if (params.length==3) {
                purchases.add(
                        new Purchase(params[0],
                        Integer.parseInt(params[1]),
                        Integer.parseInt(params[2])));
            } else {
                purchases.add(
                        new PricePurchase(params[0],
                        Integer.parseInt(params[1]),
                        Integer.parseInt(params[2]),
                        Integer.parseInt(params[3])));
            }

        }
        csvReader.close();

        for (Purchase purchase: purchases){
            System.out.println(purchase.toString());
        }

        System.out.println("Element with index 6:");
        System.out.println(purchases.get(6).toString());

        purchases.removeIf(purchase -> purchase.get_price() < 10000);
        Collections.sort(purchases, Purchase::compareTo);

        for (Purchase purchase: purchases){
            System.out.println(purchase.toString());
        }

        Comparator<Purchase> comparator4binary = Comparator.comparingInt(Purchase::getCost);

        int index = Collections.binarySearch(purchases, new Purchase("", 35000, 0), comparator4binary);
        System.out.println(index);
    }
}