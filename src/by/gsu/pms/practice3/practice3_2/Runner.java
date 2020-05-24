package by.gsu.pms.practice3.practice3_2;

import by.gsu.pms.practice3.practice3_2.utils.*;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {

        Commodity cocaColaZero = new Commodity("milk", 2.5);
        Commodity meat = new Commodity("ice cream", 1.2);

        AbstractPurchase[] purchases = new AbstractPurchase[6];
        purchases[0] = new PurchaseDiscountPrice(cocaColaZero, 1, 0.15);
        purchases[1] = new PurchaseDiscountPercent(cocaColaZero, 2, 20);
        purchases[2] = new PurchaseDiscountPrice(meat, 3, 0.3);
        purchases[3] = new PurchaseDiscountPercent(meat, 4, 15);
        purchases[4] = new PurchaseTransport(cocaColaZero, 9, 6);
        purchases[5] = new PurchaseTransport(meat, 2, 1);

        System.out.println("Before:");
        for (AbstractPurchase purchase: purchases){
            System.out.println(purchase.toString());;
        }

        Arrays.sort(purchases, Comparator.comparing(AbstractPurchase::getCost));

        System.out.println("After:");
        for (AbstractPurchase purchase: purchases){
            System.out.println(purchase.toString());
        }

        System.out.println("Min cost:");
        System.out.println(purchases[0].toString());

    }
}