package by.gsu.pms.practice3.practice3_1;

import by.gsu.pms.practice3.practice3_1.Purchase_Classes.DiscountFactory;
import by.gsu.pms.practice3.practice3_1.Purchase_Classes.Purchase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {

        Purchase[] purchases = new Purchase[6];

        FileReader file = new FileReader("in.txt");
        Scanner scan = new Scanner(file);

        double maxCost = 0;
        Purchase maxPurchase = new Purchase();

        for (int current_purchase_index = 0; current_purchase_index < purchases.length; current_purchase_index++) {
            String string = scan.nextLine();

            purchases[current_purchase_index] = new DiscountFactory().Factory(string);
            Purchase current_purchase = purchases[current_purchase_index];

            if (current_purchase.getCost() > maxCost) {
                maxCost = current_purchase.getCost();
                maxPurchase = current_purchase;
            }
            System.out.println(current_purchase.toString());
            if (current_purchase_index==purchases.length-1) {
                for (int potentially_equal_index = 0;
                     potentially_equal_index < current_purchase_index; potentially_equal_index++){
                    if (current_purchase != purchases[potentially_equal_index]){

                        System.out.println("Purchases are not equal");
                        break;
                    }
                }
            }

        }
        file.close();

        System.out.println("Max cost: " + maxPurchase.toString());

    }
}
