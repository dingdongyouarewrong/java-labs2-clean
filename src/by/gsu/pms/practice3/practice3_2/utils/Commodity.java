package by.gsu.pms.practice3.practice3_2.utils;

public class Commodity {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    private String name;
    private double price;

    public Commodity() {
        this.name = "Default";
        this.price = 0;
    }

    public Commodity(String name, double price) {
        this.name = name;
        this.price = price;
    }

}