package by.gsu.pms.idz_1_classes;

import by.gsu.pms.idz_1_classes.butter.Butter;
import by.gsu.pms.idz_1_classes.butter.Sort_butters;

import java.util.ArrayList;


import static java.lang.String.valueOf;


public class Runner {

    public static void main(String[] args) {
        ArrayList<Butter> sortedByName = new ArrayList<Butter>();
        ArrayList<Butter> sortedByPrice = new ArrayList<Butter>();
        Butter[] butterList = new Butter[10];
        butterList[0] = new Butter("Belorussian", 10, 0);
        butterList[1] = null;
        butterList[2] = new Butter("Polish", 20, 1);
        butterList[3] = new Butter("Lithuanian", 30, 2);
        butterList[4] = new Butter("Latvian", 40, 3);
        butterList[5] = new Butter("Estonian", 50, 4);
        butterList[6] = new Butter();
        butterList[7] = new Butter("Russian", 70, 5);
        butterList[8] = new Butter("Ukrainian", 60, 6);
        butterList[9] = new Butter("Machine", 80, 0);

        System.out.println("\n\nNot sorted");
        for (Butter butter:butterList) {
            if ((butter!=null)) {
                System.out.println(butter.toString());
                if (butter.getPrice()>0) {
                    sortedByPrice.add(butter);
                    sortedByName.add(butter);
                }

            }
        }


        System.out.println("\nSorted by name:");
        sortedByName = Sort_butters.sortButtersByName(sortedByName);

        for (Butter butter:sortedByName) {
            System.out.println(butter.toString());
        }

        System.out.println("\nSorted by price:");
        sortedByPrice = Sort_butters.sortButtersByPrice(sortedByPrice);
        System.out.println(sortedByPrice);


        for (Butter butter:sortedByPrice) {
            System.out.println(butter.toString());
        }

        float price_sum = 0;
        for (Butter butter:butterList) {
            if (butter != null) {
                price_sum+=butter.getPrice();
            }
        }
        System.out.println("\nPrice of all butter is: "+valueOf(price_sum));

        int quantityOfButterWithAdditives = 0;
        for (Butter butter:butterList) {
            if (butter != null) {
                if (butter.getAmountOfAdditives()>0) {
                    quantityOfButterWithAdditives+=1;
                }
            }
        }
        System.out.println("Quantity of butter with additivies is "+valueOf(quantityOfButterWithAdditives));


    }

}

