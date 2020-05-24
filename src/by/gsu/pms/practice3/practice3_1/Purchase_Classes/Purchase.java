package by.gsu.pms.practice3.practice3_1.Purchase_Classes;

import java.util.Objects;

public class Purchase {

    public Purchase(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Purchase() {
        this.name = "Default";
        this.price = 0;
        this.count = 0;
    }

    private String name;
    private double price;
    private int count;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchase)) return false;
        Purchase purchase = (Purchase) o;
        return Double.compare(purchase.price, price) == 0 &&
                count == purchase.count &&
                Objects.equals(name, purchase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, count);
    }

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCost() {
        return price*count;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count;
    }
}
