package by.gsu.pms.idz_3_serialization.butter_package;

import java.io.Serializable;

import static java.lang.String.valueOf;

public class Butter implements Comparable<Butter>, Serializable {
    public Butter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmountOfAdditives() {
        return amountOfAdditives;
    }

    public void setAmountOfAdditives(int amountOfAdditives) {
        this.amountOfAdditives = amountOfAdditives;
    }


    private String name;
    private float price;
    private int amountOfAdditives;


    public Butter(String name, float price, int amountOfAdditives) {
        this.name = name;
        this.price = price;
        this.amountOfAdditives = amountOfAdditives;
    }

    @Override
    public String toString() {
        return valueOf(name)+";"+valueOf(price)+";"+valueOf(amountOfAdditives);
    }

    public void show() {
        System.out.println("--------------------");
        System.out.println("Name: "+valueOf(name));
        System.out.println("Price: "+valueOf(price));
        System.out.println("Amount of additives: "+valueOf(amountOfAdditives));
    }


    @Override
    public int compareTo(Butter o) {
        return 0;
    }
}
